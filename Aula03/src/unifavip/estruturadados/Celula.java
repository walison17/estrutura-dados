/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

/**
 *
 * @author walison
 */
public class Celula {
    
    private Celula proxima; 
    private Aluno aluno; 
    
    public Celula(Celula proxima, Aluno aluno){
        this.proxima = proxima; 
        this.aluno = aluno;
    }
    
    public Celula(Aluno aluno){
        this.aluno = aluno;
    }
    
    public void setProxima(Celula proxima){
        this.proxima = proxima; 
    }
    
    public Celula getProxima(){
        return this.proxima;
    }
    
    public Aluno getAluno(){
        return this.aluno;
    }
    
}


