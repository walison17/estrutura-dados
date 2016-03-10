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
public class ListaEncadeada implements IListaAlunos {
    
    Celula primeira; 
    Celula ultima;
    int totalAlunos; 

    @Override
    public void adicionaAluno(Aluno aluno) {
        if (this.tamanho() == 0){
            this.adicionaNoComeco(aluno);
        } else {
            Celula celula = new Celula(aluno);
            //aponta pra nova celula criada
            this.ultima.setProxima(celula);
            //recebe a referencia da celula atual
            this.ultima = celula; 
            this.totalAlunos++; 
        }
        
    }

    @Override
    public void adicionaAluno(int posicao, Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno pegaAluno(int posicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int posicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contem(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listaTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionaNoComeco(Aluno aluno) {
        Celula celula = new Celula(this.primeira, aluno);
        this.primeira = celula; 
        
        if (this.tamanho() == 0){
            this.ultima = this.primeira; 
        }
        
        this.totalAlunos++;
    }

    @Override
    public void removeDoComeco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeDoFim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
