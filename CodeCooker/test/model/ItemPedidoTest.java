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
public class ItemPedidoTest {
    
    public ItemPedidoTest() {
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
     * Test of getPedidoID method, of class ItemPedido.
     */
    @Test
    public void testGetPedidoID() {
        System.out.println("getPedidoID");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
    
        assertEquals(1, ip.getPedidoID());
    }

    /**
     * Test of getPedido method, of class ItemPedido.
     */
    /*@Test
    public void testGetPedido() {
        System.out.println("getPedido");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        Pedido p1 = new Pedido(10, 10);
        
        assertEquals("p1", ip.getPedido());
    }*/

    /**
     * Test of setPedido method, of class ItemPedido.
     */
    /*@Test
    public void testSetPedido() {
        System.out.println("setPedido");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.setPedido();
        
        asserEquals(,);
    }*/

    /**
     * Test of getItem method, of class ItemPedido.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);

        assertEquals(refrigerante, ip.getItem());
    }

    /**
     * Test of setItem method, of class ItemPedido.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        Item suco = new Item(2, "Suco de Laranja", "bebida", 5, "água e laranja", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.setItem(suco);

        assertEquals(suco, ip.getItem());
    }

    /**
     * Test of getQtd method, of class ItemPedido.
     */
    @Test
    public void testGetQtd() {
        System.out.println("getQtd");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);

        assertEquals(10, ip.getQtd());
    }

    /**
     * Test of setQtd method, of class ItemPedido.
     */
    @Test
    public void testSetQtd() {
        System.out.println("setQtd");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.setQtd(7);

        assertEquals(7, ip.getQtd());
        
    }

    /**
     * Test of getValor method, of class ItemPedido.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.calcularValor(5, 10);

        assertEquals(50, ip.getValor(), 0);
    }

    /**
     * Test of setValor method, of class ItemPedido.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.calcularValor(5, 10);
        ip.setValor(30);

        assertEquals(30, ip.getValor(), 0);
    }

    /**
     * Test of calcularValor method, of class ItemPedido.
     */
    @Test
    public void testCalcularValor() {
        System.out.println("calcularValor");
        Item refrigerante = new Item(1, "Coca Cola", "bebida", 5, "água e gás", true);
        ItemPedido ip = new ItemPedido(refrigerante, 1, 10);
        ip.setValor(30);
        ip.calcularValor(30, 10);
        
        assertEquals(30, ip.getValor(), 0);
    }
}
