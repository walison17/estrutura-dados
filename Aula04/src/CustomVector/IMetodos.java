/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomVector;

/**
 *
 * @author walison
 * @param <T> tipo
 */
public interface IMetodos<T> {

    void add(T element);

    void add(int pos, T element);

    T get(int pos);

    void remove(int pos);

    void removeAll();

    int size();

    @Override
    String toString();

}
