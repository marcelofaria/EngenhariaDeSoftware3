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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getQtd method, of class Produto.
     */
    @Test
    public void testGetQtd() {
    Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
    assertEquals(10, produto.getQtd());
    }

    /**
     * Test of setQtd method, of class Produto.
     */
    @Test
    public void testSetQtd() {
        System.out.println("setQtd");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setQtd(50);
        assertEquals(50,p1.getQtd());
    }

    /**
     * Test of getId method, of class Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Produto instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
        assertEquals("Churros", produto.getNome());
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setNome("Crepe");
        assertEquals("Crepe",p1.getNome());
    }

    /**
     * Test of getMarca method, of class Produto.
     */
    @Test
    public void testGetMarca() {
        Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
        assertEquals("Sadia", produto.getMarca());
    }

    /**
     * Test of setMarca method, of class Produto.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setMarca("Perdigao");
        assertEquals("Perdigao",p1.getMarca());
    }

    /**
     * Test of getFornecedor method, of class Produto.
     */
    @Test
    public void testGetFornecedor() {
     Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
     assertEquals("Dona Florinda", produto.getFornecedor());
    }

    /**
     * Test of setFornecedor method, of class Produto.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setFornecedor("Seu Madruga");
        assertEquals("Seu Madruga",p1.getFornecedor());
    }
   
}

 