/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author douglasfrari
 */
public class VetorTest {
    
    public VetorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adicionaAluno method, of class Vetor.
     * @return  
     */
    
    public Vetor carregarAlunos(){
        Vetor vetor = new Vetor(); 
        for (int i = 0; i < 500000; i++) {
            Aluno aluno = new Aluno("aluno"+i);
            vetor.adicionaAluno(aluno);
        }
        return vetor;
    }
    
    @Test
    public void testAdicionaAluno_Aluno() {
        System.out.println("adicionaAluno");
        long inicio = System.currentTimeMillis();
        
        Vetor vetor = new Vetor(); 
        for (int i = 0; i < 500000; i++) {
            Aluno aluno = new Aluno("aluno"+i);
            vetor.adicionaAluno(aluno);
        }
        long fim = System.currentTimeMillis();
        System.out.println((fim - inicio)/1000 +"s");
         
        assertTrue(vetor.tamanho() == 500000);
    }

    @Test
    public void testAdicionaAluno_comeco(){
        //adicion um aluno no comeco da lista 
        Vetor vetor = this.carregarAlunos();
        
        System.out.println("Adiciona aluno no inicio da lista");
        long inicio = System.currentTimeMillis();
        Aluno aluno_inicio = new Aluno("zuckerberg");
        int posicao_inicio = 0;
        vetor.adicionaAluno(posicao_inicio, aluno_inicio);
        long fim = System.currentTimeMillis();
        
        System.out.print((fim - inicio)/1000 +" s");
        
        assertTrue(vetor.pegaAluno(posicao_inicio) == aluno_inicio);
        assertTrue(vetor.tamanho() == 500001);
    }
    
    /**
     * Test of adicionaAluno method, of class Vetor.
     */
    
    @Test
    public void testAdicionarAluno_fim(){
        //adiciona um aluno no fim da lista 
        Vetor vetor = this.carregarAlunos();
        
        System.out.println("Adiciona aluno no fim da lista");
        Aluno aluno_fim = new Aluno("Walison Filipe");
        int posicao_fim = vetor.tamanho()-1;
        vetor.adicionaAluno(posicao_fim, aluno_fim);
        
        assertTrue(vetor.pegaAluno(posicao_fim) == aluno_fim);
    }
    
    @Test
    public void testeAdicionAluno_meio(){
        Vetor vetor = this.carregarAlunos();
        
        System.out.println("adiciona Aluno no meio da lista");
        Aluno aluno_meio = new Aluno("Bill Gates");
        int posicao = (vetor.tamanho()/2)-1; 
        vetor.adicionaAluno(posicao-1, aluno_meio);
        
        assertTrue(vetor.pegaAluno(posicao-1) == aluno_meio);     
    }
    
    @Test
    public void testAdicionaAluno_int_Aluno() {
        //adiciona 500.000 registros na lista de alunos 
        Vetor vetor = new Vetor(); 
        for (int i = 0; i < 500000; i++) {
            Aluno aluno = new Aluno("aluno"+i);
            vetor.adicionaAluno(aluno);
        }
        
        System.out.println("totalAlnos = "+vetor.tamanho());
        assertTrue(vetor.tamanho() == 500000);
       
    }

    /**
     * Test of pegaAluno method, of class Vetor.
     */
    @Test
    public void testPegaAluno() {
        System.out.println("pegaAluno");
        int posicao = 0;
        Vetor instance = new Vetor();
        Aluno expResult = new Aluno("Batman");        
        instance.adicionaAluno(expResult);
        
        Aluno result = instance.pegaAluno(posicao);
        
        assertEquals(expResult, result);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of remove method, of class Vetor.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int posicao = 0;
        Vetor instance = new Vetor();
        
        Aluno aluno = new Aluno("Ryu");        
        instance.adicionaAluno(aluno);
        
        
        instance.remove(posicao);
        
        assertTrue(instance.tamanho() == 0);
    }

    /**
     * Test of contem method, of class Vetor.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        Aluno aluno = new Aluno("Xuxa");   
        Vetor instance = new Vetor();        
        instance.adicionaAluno(aluno);
        
        boolean expResult = true;
        boolean result = instance.contem(aluno);
        assertEquals(expResult, result);
    }

    /**
     * Test of tamanho method, of class Vetor.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        Vetor instance = new Vetor();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of listaTodos method, of class Vetor.
     */
    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        Vetor instance = new Vetor();
        String expResult = "[]";
        String result = instance.listaTodos();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Vetor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vetor instance = new Vetor();
        String expResult = "[]";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        
        
    }
    
}
