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
 * Classe para testes dos métodos da classe "Cardapio"
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
        
        ArrayList<Item> itens = new ArrayList<>();
        Item i = new Item(1, "Farofa", Tipo.Porcao, 12, "Mandioca, linguica", true);
        itens.add(i);
        Cardapio cardapio = new Cardapio(itens, DiaDaSemana.Domingo);
        ArrayList<Item> itens2 = cardapio.getItens();
        
        for(Item x : itens2){
            if(x.getNome().compareTo("Farofa") == 0){
                assertEquals("Farofa", x.getNome());
            }
            else{
                fail("Nao foi possivel obter a referencia de getItens().");
            }
        }
       
    }

    /**
     * Test of setItens method, of class Cardapio.
     */
    @Test
    public void testSetItens() {
        System.out.println("setItens");
        
        ArrayList<Item> itens = new ArrayList<>();
        Item item1 = new Item(1, "Farofa", Tipo.Porcao, 12, "Mandioca, linguica", true);
        itens.add(item1);
        Cardapio c1 = new Cardapio(itens , DiaDaSemana.Segunda);
        ArrayList<Item> itens2 = new ArrayList<>();
        
        Item item2 = new Item(2, "Arroz", Tipo.Porcao, 15, "Arroz", true);
        itens2.add(item2);
        
        c1.setItens(itens2);
        
        
        assertEquals(c1.getItens().get(0).getNome(), "Arroz");
    }
    
}
