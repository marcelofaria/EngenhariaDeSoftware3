package model;

import java.time.Instant;
import java.util.Date;
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
public class ContaTest {
    
    public ContaTest() {
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
     * Test of getID method, of class Conta.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Conta conta = new Conta(100, null);
        
        assertEquals(0, conta.getID());
    }

    /**
     * Test of getValorTotal method, of class Conta.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Conta conta = new Conta(100, null);
        
        assertEquals(100, conta.getValorTotal(), 0.0);
    }

    /**
     * Test of setValorTotal method, of class Conta.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        Conta conta = new Conta(100, null);
        conta.setValorTotal(250);
        
        assertEquals(250, conta.getValorTotal(), 0.0);
    }

    /**
     * Test of getData method, of class Conta.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Conta conta = new Conta(100, null);
        
        assertEquals(null, conta.getData());
    }

    /**
     * Test of setData method, of class Conta.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Conta conta = new Conta(100, null);
        //conta.setData(Date.);
        
        //assertEquals(, conta.getData());
    }

    /**
     * Test of calcularValorTotal method, of class Conta.
     */
    @Test
    public void testCalcularValorTotal() {
        System.out.println("calcularValorTotal");
        Conta conta = new Conta(100, null);
        conta.calcularValorTotal();
        
        //assertEquals(250, conta.calcularValorTotal());
    }
    
}
