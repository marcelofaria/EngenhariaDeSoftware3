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
public class GerenteTest {
    
    public GerenteTest() {
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
     * Test of getCnpj method, of class Gerente.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Gerente g1 = new Gerente("admin", "admin", "12345678912", "123123123");
        
        assertEquals("123123123", g1.getCnpj());
    }

    /**
     * Test of setCnpj method, of class Gerente.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        Gerente g1 = new Gerente("admin", "admin", "12345678912", "123123123");
        g1.setCnpj("147147147");
        
        assertEquals("147147147", g1.getCnpj());
    }

    /**
     * Test of getIdGerente method, of class Gerente.
     */
    @Test
    public void testGetIdGerente() {
        System.out.println("getIdGerente");
        Gerente g1 = new Gerente("admin", "admin", "12345", "1234567");
        
        assertEquals(0, g1.getIdGerente());
    }

    /**
     * Test of setIdGerente method, of class Gerente.
     */
    @Test
    public void testSetIdGerente() {
        System.out.println("setIdGerente");
        Gerente g1 = new Gerente("admin", "admin", "12345", "1234567");
        g1.setIdGerente(3);
        
        assertEquals(3, g1.getIdGerente());
    }
    
}
