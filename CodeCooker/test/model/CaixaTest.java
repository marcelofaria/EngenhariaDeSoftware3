package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe para testes dos métodos da classe "Caixa"
 * @author Inoue
 */
public class CaixaTest {
    
    public CaixaTest() {
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
     * Test of getID method, of class Caixa.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Caixa c1 = new Caixa("1234", "Plínio", "123456789");
        
        assertEquals(0, c1.getID());
    }

    /**
     * Test of getSenha method, of class Caixa.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Caixa caixa = new Caixa ("banana","Joel","607");
     
        assertEquals("banana", caixa.getSenha());
    }

    /**
     * Test of setSenha method, of class Caixa.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        Caixa c1 = new Caixa("banana","Joel","607");
        c1.setSenha("morango");
        
        assertEquals("morango",c1.getSenha());
    }

    /**
     * Test of getNome method, of class Caixa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Caixa caixa = new Caixa ("banana","Joel","607");
        
        assertEquals("Joel", caixa.getNome());
    }

    /**
     * Test of setNome method, of class Caixa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Caixa c1 = new Caixa("banana","Joel","607");
        c1.setNome("Santana");
        
        assertEquals("Santana",c1.getNome());
    }

    /**
     * Test of getCpf method, of class Caixa.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Caixa caixa = new Caixa ("banana","Joel","607");
        
        assertEquals("607", caixa.getCpf());
    }

    /**
     * Test of setCpf method, of class Caixa.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        Caixa c1 = new Caixa("banana","Joel","607");
        c1.setCpf("456");
        
        assertEquals("456",c1.getCpf());
    } 
}
