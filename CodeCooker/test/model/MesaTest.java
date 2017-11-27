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
public class MesaTest {
    
    public MesaTest() {
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
     * Test of getNumMesa method, of class Mesa.
     */
    @Test
    public void testGetNumMesa() {
        System.out.println("getNumMesa");
        Mesa m1 = new Mesa(5, 1);
        
        assertEquals(5, m1.getNumMesa());
    }

    /**
     * Test of setNumMesa method, of class Mesa.
     */
    @Test
    public void testSetNumMesa() {
        System.out.println("setNumMesa");
        Mesa m1 = new Mesa(5, 1);
        m1.setNumMesa(4);
        
        assertEquals(4, m1.getNumMesa());
    }

    /**
     * Test of getStatus method, of class Mesa.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Mesa m1 = new Mesa(5, 1);
        
        assertEquals(1, m1.getStatus());
    }

    /**
     * Test of setStatus method, of class Mesa.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Mesa m1 = new Mesa(5, 1);
        m1.setStatus(0);
        
        assertEquals(0, m1.getStatus());
    }
    
}
