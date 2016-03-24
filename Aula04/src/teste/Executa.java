/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import CustomVector.CustomArrayList;
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
  
        CustomArrayList<Funcionario> lista = new CustomArrayList<>();
        lista.add(new Funcionario("teste", "11", 0));
        lista.add(new Funcionario("teste", "11", 0));
        System.out.println(lista.size());
        
        
         
    }
    
    
}
