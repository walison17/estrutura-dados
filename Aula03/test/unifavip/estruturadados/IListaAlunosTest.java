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
 * @author walison filipe
 */
public class IListaAlunosTest {
    
    public IListaAlunosTest() {
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
     * Test of adicionaAluno method, of class IListaAlunos.
     */
    @Test
    public void testAdicionaAluno_Aluno() {
        System.out.println("adicionaAluno");
        Aluno aluno = new Aluno("walison");
        IListaAlunos instance = new IListaAlunosImpl();
        instance.adicionaAluno(aluno);
        
    }

    /**
     * Test of adicionaAluno method, of class IListaAlunos.
     */
    @Test
    public void testAdicionaAluno_int_Aluno() {
        System.out.println("adicionaAluno");
        int posicao = 0;
        Aluno aluno = null;
        IListaAlunos instance = new IListaAlunosImpl();
        instance.adicionaAluno(posicao, aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegaAluno method, of class IListaAlunos.
     */
    @Test
    public void testPegaAluno() {
        System.out.println("pegaAluno");
        int posicao = 0;
        IListaAlunos instance = new IListaAlunosImpl();
        Aluno expResult = null;
        Aluno result = instance.pegaAluno(posicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IListaAlunos.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int posicao = 0;
        IListaAlunos instance = new IListaAlunosImpl();
        instance.remove(posicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contem method, of class IListaAlunos.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        Aluno aluno = null;
        IListaAlunos instance = new IListaAlunosImpl();
        boolean expResult = false;
        boolean result = instance.contem(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class IListaAlunos.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        IListaAlunos instance = new IListaAlunosImpl();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTodos method, of class IListaAlunos.
     */
    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        IListaAlunos instance = new IListaAlunosImpl();
        String expResult = "";
        String result = instance.listaTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IListaAlunosImpl implements IListaAlunos {

        public void adicionaAluno(Aluno aluno) {
        }

        public void adicionaAluno(int posicao, Aluno aluno) {
        }

        public Aluno pegaAluno(int posicao) {
            return null;
        }

        public void remove(int posicao) {
        }

        public boolean contem(Aluno aluno) {
            return false;
        }

        public int tamanho() {
            return 0;
        }

        public String listaTodos() {
            return "";
        }

        @Override
        public void adicionaNoComeco(Aluno aluno) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
