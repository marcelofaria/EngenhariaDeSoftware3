/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        DiaDaSemana dia = null;
        Cardapio instance = null;
        instance.setDia(dia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItens method, of class Cardapio.
     */
    @Test
    public void testGetItens() {
        System.out.println("getItens");
        Cardapio instance = null;
        Collection<Item> expResult = null;
        Collection<Item> result = instance.getItens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItens method, of class Cardapio.
     */
    @Test
    public void testSetItens() {
        System.out.println("setItens");
        Collection<Item> itens = null;
        Cardapio instance = null;
        instance.setItens(itens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
