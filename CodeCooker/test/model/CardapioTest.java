package model;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
//import static org.junit.Assert.*;
import static junit.framework.Assert.*;
/**
 *
 * @author OTAVIO-Note
 */
public class CardapioTest {
    
    public CardapioTest() {
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
     * Test of getDia method, of class Cardapio.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Cardapio cardapio = new Cardapio(null, DiaDaSemana.Domingo);
        
        assertEquals(DiaDaSemana.Domingo, cardapio.getDia());
    }

    /**
     * Test of setDia method, of class Cardapio.
     */
    @Test
    public void testSetDia() {
        System.out.println("setDia");
        Cardapio cardapio = new Cardapio(null, DiaDaSemana.Terca);
        cardapio.setDia(DiaDaSemana.Quarta);
        
        assertEquals(DiaDaSemana.Quarta, cardapio.getDia());
        //System.out. println(cardapio.getDia());
    }

    /**
     * Test of getItens method, of class Cardapio.
     */
    @Test
    public void testGetItens() {
        System.out.println("getItens");
        Collection<Cardapio> cardapio = new ArrayList<Cardapio>();
        
        //assertEquals(, cardapio.getItens());
    }

    /**
     * Test of setItens method, of class Cardapio.
     */
    @Test
    public void testSetItens() {
        System.out.println("setItens");
        Collection<Cardapio> cardapio = new ArrayList<Cardapio>();
       /* Cardapio c1 = new Cardapio( ,null);
        cardapio.add(c1);
        
        assertEquals(,cardapio.SetItens());*/
    }
    
}
