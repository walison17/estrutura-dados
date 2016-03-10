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
public class ListaSimples {
    
    private Celula primeira; 
    private Celula ultima; 
    private int totalElementos; 
    
    public ListaSimples(){
        this.primeira = null; 
        this.ultima = null; 
        this.totalElementos = 0; 
    }
    
    public void adicionarNoComeço(Object elemento){
        Celula novaCelula = new Celula(elemento);
        novaCelula.setProxima(primeira);
        if (this.totalElementos == 0){
            this.ultima = novaCelula;
        }
        this.primeira = novaCelula; 
        
        this.totalElementos ++; 
    }
    
    public void adicionar(Object elemento){
        if (this.tamanho() == 0){
            this.adicionarNoComeço(elemento);
        } else {
            Celula novaCelula = new Celula(elemento);
            novaCelula.setProxima(null);
            this.ultima.setProxima(novaCelula);
            this.ultima = novaCelula;
            this.totalElementos ++; 
        } 
        
    } 
    
    public void adicionar(int posicao, Object elemento){
        if (posicao == 0){
            this.adicionarNoComeço(elemento);
        } else if (posicao == this.totalElementos){
            this.adicionar(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao -1); //pega celula anterior
            Celula nova = new Celula(anterior.getProxima(), elemento); 
            anterior.setProxima(nova); //aponta a celula anterior para celula criada
            this.totalElementos++;   
        }
    }
    
    public Object getElemento(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }
    
    public int tamanho(){
        return this.totalElementos;
    }
    
    public void imprimirLista(){
        
        Celula atual = this.primeira;
        while (atual != null){
            System.out.println(atual.getElemento());
            atual = atual.getProxima();
        }
        
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }
    
    private Celula pegaCelula(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw  new IllegalArgumentException("posição não existe");
        } else {
            Celula atual = this.primeira;
            for(int i = 0; i < posicao; i++){
                atual = atual.getProxima();
            }
            
            return atual;
        }  
    }
    
}
