/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import CustomVector.Vector;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
import repositorio.Repositorio;
import repositorio.RepositorioCliente;
import repositorio.RepositorioFuncionario;
import repositorio.RepositorioProduto;

/**
 *
 * @author alunofavip
 */
public class Executa {
    
    public static void main(String[] args) {
  
        Vector<Funcionario> lista = new Vector<>();
        lista.add(new Funcionario("teste", "11", 0));
        lista.add(new Funcionario("teste", "11", 0));
        lista.removeAll();
        System.out.println(lista.isEmpty() + "\n" + lista.size()); 
        
        for (int i = 0; i < 150; i++) {
            lista.add(i , new Funcionario("teste", "i", 0));    
        }
         
    }
    
    
}
