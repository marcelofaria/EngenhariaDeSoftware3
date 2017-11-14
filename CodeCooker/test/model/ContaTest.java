package model;

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
     * Test of getID method, of class Conta.
     */
    @Test
    public void testGetID() {

        System.out.println("getID");
        Conta conta = new Conta(0, null, null);
        
        assertEquals(0, conta.getID());
    }

    /**
     * Test of getValorTotal method, of class Conta.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Conta conta = new Conta(0, null, null);
        
        
        assertEquals(100, conta.getValorTotal(), 0.0);
    }

    /**
     * Test of setValorTotal method, of class Conta.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        Conta conta = new Conta(0, null, null);
        conta.setValorTotal(250);
        
        assertEquals(250, conta.getValorTotal(), 0.0);
    }

    /**
     * Test of getData method, of class Conta.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Date data = new Date();
        
        Conta conta = new Conta(0, null, null);

        assertEquals(data.toString(), conta.getData().toString());
    }

    /**
     * Test of setData method, of class Conta.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = new Date();
        Conta conta = new Conta(0, null, null);
        try {
            TimeUnit.SECONDS.sleep(1);
            Date data2 = new Date();
            //conta.setData(data2);
            
            assertEquals(data2.toString(), conta.getData().toString());
        } catch (InterruptedException ex) {
            Logger.getLogger(ContaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of calcularValorTotal method, of class Conta.
     */
    @Test
    public void testCalcularValorTotal() {
        System.out.println("calcularValorTotal");
        Conta conta = new Conta(0, null, null);
        conta.calcularValorTotal();
    }
}
