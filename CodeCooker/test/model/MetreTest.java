package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe para testes dos métodos da classe "Metre"
 * @author OTAVIO-Note
 */
public class MetreTest {
    
    public MetreTest() {
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
     * Test of getIdMetre method, of class Metre.
     */
    @Test
    public void testGetIdMetre() {
        System.out.println("getIdMetre");
        Metre metre = new Metre("senha_metre", "metre", "1234567");
        
        assertEquals(0, metre.getIdMetre());
    }

    /**
     * Test of setIdMetre method, of class Metre.
     */
    @Test
    public void testSetIdMetre() {
        System.out.println("setIdMetre");
        Metre metre = new Metre("senha_metre", "metre", "1234567");
        metre.setIdMetre(5);
        
        assertEquals(5, metre.getIdMetre());
    }
    
}
