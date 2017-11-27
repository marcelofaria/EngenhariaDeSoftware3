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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getId method, of class Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedido p1 = new Pedido(3, 1);
        
        assertEquals(3, p1.getId());
    }

    /**
     * Test of getContaId method, of class Pedido.
     */
    @Test
    public void testGetContaId() {
        System.out.println("getContaId");
        Pedido p1 = new Pedido(3, 1);
        
        assertEquals(1, p1.getContaId());
    }
    
}
