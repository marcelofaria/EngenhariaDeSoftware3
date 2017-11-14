package model;

import java.time.Instant;
import java.util.ArrayList;
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
        Conta conta = new Conta(100,null, null);
        
        assertEquals(0, conta.getID());
    }


    /**
     * Test of setValorTotal method, of class Conta.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        Conta conta = new Conta(100, null, null);
        conta.setValorTotal(250);
        
        assertEquals(250, conta.getValorTotal(), 0.0);
    }

    /**
     * Test of getData method, of class Conta.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Calendar c = Calendar.getInstance();
        
        Conta conta = new Conta(100, null, c);

        assertEquals(c.getTime(), conta.getData().getTime());
    }

    /**
     * Test of setData method, of class Conta.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Calendar c = Calendar.getInstance();
        Conta conta = new Conta(100, null, c);
        try {
            TimeUnit.SECONDS.sleep(1);
            Calendar b = Calendar.getInstance();
            conta.setData(b);
            
            assertEquals(b.getTime(), conta.getData().getTime());
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
        ArrayList<Pedido> p = new ArrayList<>();
        ArrayList<ItemPedido> ip = new ArrayList<>();
        Item i = new Item(0, "Chili", Tipo.Prato, 25, "Carne, pimenta, tomate", true);
        ItemPedido itempedido = new ItemPedido(i, 0, 3);
        ip.add(itempedido);
        Pedido pedido = new Pedido(1, ip);
        p.add(pedido);
        
        Calendar c = Calendar.getInstance();
        Conta conta = new Conta(0, p, c);
        
        assertEquals(75, conta.getValorTotal());
    }
    
}
