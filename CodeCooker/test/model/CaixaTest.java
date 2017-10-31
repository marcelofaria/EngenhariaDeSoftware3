/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
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
        Caixa instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Caixa.
     */
    @Test
    public void testGetSenha() {
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
