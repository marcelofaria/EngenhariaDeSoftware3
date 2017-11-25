package model;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe para testes dos métodos da classe "Conta"
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
     * Test of getId method, of class Conta.
     */
    @Test
    public void testGetID() {

        System.out.println("getID");
        Calendar cal = Calendar.getInstance();
        Conta conta = new Conta(0, 0, cal, true);
        
        assertEquals(0, conta.getId());
    }


    /**
     * Test of getData method, of class Conta.
     */
    @Test
    public void testGetData() {

    }

    /**
     * Test of setData method, of class Conta.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Calendar cal = Calendar.getInstance();
        Conta conta = new Conta(0, 0, cal, true);
        try {
            TimeUnit.SECONDS.sleep(1);
            Calendar cal2 = Calendar.getInstance();
            conta.setData(cal2);
            
            assertEquals(cal2.getTime(), conta.getData().getTime());
        } catch (InterruptedException ex) {
            Logger.getLogger(ContaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}