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
 * @author OTAVIO-Note
 */
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getIdItem method, of class Item.
     */
    @Test
    public void testGetIdItem() {
        System.out.println("getIdItem");
        Item instance = null;
        int expResult = 0;
        int result = instance.getIdItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdItem method, of class Item.
     */
    @Test
    public void testSetIdItem() {
        System.out.println("setIdItem");
        int idItem = 0;
        Item instance = null;
        instance.setIdItem(idItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Item.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Item instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Item.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Item instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class Item.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Item instance = null;
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class Item.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        float preco = 0.0F;
        Item instance = null;
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredientes method, of class Item.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Item instance = null;
        String expResult = "";
        String result = instance.getIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredientes method, of class Item.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        String ingredientes = "";
        Item instance = null;
        instance.setIngredientes(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisponibilidade method, of class Item.
     */
    @Test
    public void testGetDisponibilidade() {
        System.out.println("getDisponibilidade");
        Item instance = null;
        boolean expResult = false;
        boolean result = instance.getDisponibilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponibilidade method, of class Item.
     */
    @Test
    public void testSetDisponibilidade() {
        System.out.println("setDisponibilidade");
        boolean disponibilidade = false;
        Item instance = null;
        instance.setDisponibilidade(disponibilidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Item.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Item instance = null;
        Tipo expResult = null;
        Tipo result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Item.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Tipo tipo = null;
        Item instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
