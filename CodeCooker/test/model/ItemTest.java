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
 * Classe para testes dos m�todos da classe "Item"
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

    @Test
    public void testGetId(){
        
        Item i = new Item(0, "Chili", "Prato", (float) 19.99, "Feijao, chili, molho de tomate, carne moida", true);
        
        assertEquals(0, i.getId());
        
    }
    
    /**
     * Test of getNome method, of class Item.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        //public Item(int itemID, String nome, Tipo tipo, float preco, String ingredientes, boolean disp) {
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        
        assertEquals("Bife", i.getNome());
    }

    /**
     * Test of setNome method, of class Item.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        i.setNome("Virado");
        
        assertEquals("Virado", i.getNome());
    }

    /**
     * Test of getPreco method, of class Item.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        
        assertEquals(10, i.getPreco(), 0.0);
    }

    /**
     * Test of setPreco method, of class Item.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        i.setPreco(25);
   
        assertEquals(25, i.getPreco(), 0.0);
    }

    /**
     * Test of getIngredientes method, of class Item.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        
        assertEquals("Filet Mignon", i.getIngredientes());
    }

    /**
     * Test of setIngredientes method, of class Item.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        i.setIngredientes("milho");
        
        assertEquals("milho", i.getIngredientes());
    }

    /**
     * Test of getDisponibilidade method, of class Item.
     */
    @Test
    public void testGetDisponibilidade() {
        System.out.println("getDisponibilidade");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
               
        assertEquals(true, i.getDisponibilidade());
    }

    /**
     * Test of setDisponibilidade method, of class Item.
     */
    @Test
    public void testSetDisponibilidade() {
        System.out.println("setDisponibilidade");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        i.setDisponibilidade(false);
        
        assertEquals(false, i.getDisponibilidade());
    }

    /**
     * Test of getTipo method, of class Item.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
               
        assertEquals("Prato", i.getTipo());
    }

    /**
     * Test of setTipo method, of class Item.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Item i = new Item(1, "Bife", "Prato", 10, "Filet Mignon", true);
        i.setTipo("Prato");
        
        assertEquals("Prato", i.getTipo());
    }
    
}
