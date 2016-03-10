/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

/**
 *
 * @author walison filipe
 */
public interface IListaAlunos {
    
    public void adicionaAluno(Aluno aluno);
    
    public void adicionaAluno(int posicao, Aluno aluno);
    
    public Aluno pegaAluno(int posicao);
    
    public void remove(int posicao);
    
    public boolean contem(Aluno aluno);
    
    public int tamanho();
    
    public String listaTodos();
    
    //implementações parada lista ligada 
    public void adicionaNoComeco(Aluno aluno); 
    
    public void removeDoComeco();

    public void removeDoFim();
    
}
