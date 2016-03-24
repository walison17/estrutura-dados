/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomVector;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walison
 * @param <T> tipo que a classe Vector vai armazenar
 */
public class Vector<T> implements IVector<T> {

    private T[] list = (T[]) new Object[100];
    private int size;

    @Override
    public void add(T element) {
        if (element != null) {
            this.generateArray();
            list[size] = element;
            size++;
        }
    }

    @Override
    public void add(int pos, T element) {
        if (!posicaoValida(pos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        
        this.generateArray();
        
        if (element != null) {
            for (int i = this.size() - 1; i >= pos; i--) {
                list[i + 1] = list[i];
            }
            list[pos] = element;
            this.size++;
        }
    }

    @Override
    public T get(int pos) {
        if (!posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição inválida!");
        } else {
            return list[pos];
        }
    }

    @Override
    public void remove(int pos) {
        if (!posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = pos; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
        this.size--;
    }

    @Override
    public void removeAll() {
        T[] temp = (T[]) new Object[0];
        list = temp;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void generateArray() {
        if (this.list.length == this.size) {
            T[] temp = (T[]) new Object[this.list.length * 2];
            System.arraycopy(this.list, 0, temp, 0, this.list.length);
            this.list = temp;
        }
    }

    private boolean posicaoValida(int pos) {
        return pos >= 0 && pos <= this.size;
    }

    private boolean posicaoOcupada(int pos) {
        return pos >= 0 && pos < this.size;
    }
}
