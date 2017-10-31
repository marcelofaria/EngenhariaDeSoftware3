package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe para testes dos métodos da classe "Item"
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
        Item i = new Item("Bife", 10, "carne", false);
        
        assertEquals(0, i.getIdItem());
    }

    /**
     * Test of setIdItem method, of class Item.
     */
    @Test
    public void testSetIdItem() {
        System.out.println("setIdItem");
        Item i = new Item("Bife", 10, "carne", true);
        i.setIdItem(5);
        
        assertEquals(5, i.getIdItem());
    }

    /**
     * Test of getNome method, of class Item.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Item i = new Item("Bife", 10, "carne", true);
        
        assertEquals("Bife", i.getNome());
    }

    /**
     * Test of setNome method, of class Item.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Item i = new Item("Bife", 10, "carne", true);
        i.setNome("Virado");
        
        assertEquals("Virado", i.getNome());
    }

    /**
     * Test of getPreco method, of class Item.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Item i = new Item("Bife", 10, "carne", true);
        
        assertEquals(10, i.getPreco(), 0.0);
    }

    /**
     * Test of setPreco method, of class Item.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        Item i = new Item("Bife", 10, "carne", true);
        i.setPreco(25);
   
        assertEquals(25, i.getPreco(), 0.0);
    }

    /**
     * Test of getIngredientes method, of class Item.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Item i = new Item("Bife", 10, "carne", true);
        
        assertEquals("carne", i.getIngredientes());
    }

    /**
     * Test of setIngredientes method, of class Item.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        Item i = new Item("Bife", 10, "carne", true);
        i.setIngredientes("milho");
        
        assertEquals("milho", i.getIngredientes());
    }

    /**
     * Test of getDisponibilidade method, of class Item.
     */
    @Test
    public void testGetDisponibilidade() {
        System.out.println("getDisponibilidade");
        Item i = new Item("Bife", 10, "carne", true);
               
        assertEquals(true, i.getDisponibilidade());
    }

    /**
     * Test of setDisponibilidade method, of class Item.
     */
    @Test
    public void testSetDisponibilidade() {
        System.out.println("setDisponibilidade");
        Item i = new Item("Bife", 10, "carne", true);
        i.setDisponibilidade(false);
        
        assertEquals(false, i.getDisponibilidade());
    }

    /**
     * Test of getTipo method, of class Item.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Item i = new Item("Bife", 10, "carne", true);
               
        assertEquals(null, i.getTipo());
    }

    /**
     * Test of setTipo method, of class Item.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Item i = new Item("Bife", 10, "carne", true);
        i.setTipo(Tipo.Prato);
        
        assertEquals(Tipo.Prato, i.getTipo());
    }
    
}
