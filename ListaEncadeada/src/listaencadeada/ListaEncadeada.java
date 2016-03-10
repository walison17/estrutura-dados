/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author walison
 */
public class ListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaSimples lista = new ListaSimples();
        lista.adicionarNoComeço("walison");
        lista.adicionarNoComeço("filipe");
        lista.adicionarNoComeço("filipe");
        lista.adicionarNoComeço("foda-se");
        lista.adicionar("ultimo");
        lista.adicionar("ultimo");
        
        lista.imprimirLista();
        System.out.println(lista.tamanho());
    }
    
}
