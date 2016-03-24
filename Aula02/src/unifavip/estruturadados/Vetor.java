/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

/**
 *
 * @author douglasfrari
 */
public class Vetor implements IListaAlunos {

    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    @Override
    public void adicionaAluno(Aluno aluno) {
        if (aluno != null) {
            this.geraNovoArray();
            alunos[totalAlunos] = aluno;
            totalAlunos++;
        }

    }

    @Override
    public void adicionaAluno(int posicao, Aluno aluno) {

        //this.gerarNovoArray();
        if (posicao > this.alunos.length) {
            Aluno[] novoArray = new Aluno[posicao + 10];
            this.alunos = novoArray;
        }

        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }

        for (int i = totalAlunos - 1; i >= posicao; i -= 1) {
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        //atualiza o total de alunos 
        this.totalAlunos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalAlunos;
    }

    @Override
    public Aluno pegaAluno(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida!");
        }
        return alunos[posicao];
    }

    @Override
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        Aluno[] arrayTemp = new Aluno[this.totalAlunos];    
        System.arraycopy(this.alunos, posicao+1, arrayTemp, posicao-1, this.totalAlunos - posicao -1);
        
        this.totalAlunos--;

    }

    @Override
    public boolean contem(Aluno aluno) {
        boolean contemAluno = false;

        for (Aluno aluno1 : alunos) {
            if (aluno1 != null && aluno1.equals(aluno)) {
                contemAluno = true;
                break;
            }
        }
        return contemAluno;
    }

    @Override
    public int tamanho() {
        return this.totalAlunos;
    }

    @Override
    public String listaTodos() {
        return toString();
    }

    @Override
    public String toString() {
        if (this.totalAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < totalAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalAlunos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.alunos.length;
    }

    private void geraNovoArray() {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            //passa todos os alunos alocados para o novo array
            System.arraycopy(alunos, 0, novoArray, 0, alunos.length);

            this.alunos = novoArray;
        }
    }

}
