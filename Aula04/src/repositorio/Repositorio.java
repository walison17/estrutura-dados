/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import model.Venda;

/**
 *
 * @author alunofavip
 */
public class Repositorio {
    
    private ArrayList<Venda> listaVendas = new ArrayList<>();

    public void addVenda(Venda venda) {
        listaVendas.add(venda);
    }

    public void removeVenda(Venda venda) {
        if (venda != null) {
            for (Venda vendaAtual : listaVendas) {
                if (vendaAtual.equals(venda)) {
                    this.removeVenda(venda);
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("Venda não computada no sistema!");
        }
    }

    public int quantidadeVendas() {
        return this.listaVendas.size();
    }

    public void imprimi() {
        this.listaVendas.forEach(System.out::println);

    }

}
