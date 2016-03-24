/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomVector;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author walison
 * @param <T> tipo que a classe CustomArrayList vai armazenar
 */
public class CustomArrayList<T> implements IMetodos<T> {

    private static final int INITIAL_CAPACITY = 10;
    private Object[] list;
    private int size;

    public CustomArrayList() {
        list = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (element != null) {
            if (this.size == this.list.length) {
                this.aumentarCapacidade();
            }
            list[size] = element;
            size++;
        }
    }

    @Override
    public void add(int pos, T element) {
        if (!posicaoValida(pos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        if (this.size == this.list.length) {
            this.aumentarCapacidade();
        }
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
        if (pos < 0 || pos >= size) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return (T) list[pos];
    }

    @Override
    public void remove(int pos) {
        if (pos < 0 || pos >= size) {
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

    private void aumentarCapacidade() {
        int novaCapacidade = list.length * 2;
        list = Arrays.copyOf(list, novaCapacidade);
    }

    private boolean posicaoValida(int pos) {
        return pos >= 0 && pos <= this.size;
    }

}
