/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getUsuarioID method, of class Usuario.
     */
    @Test
    public void testGetUsuarioID() {
        System.out.println("getUsuarioID");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        
        assertEquals(0, user.getUsuarioID());
    }

    /**
     * Test of getTipoUsuario method, of class Usuario.
     */
    @Test
    public void testGetTipoUsuario() {
        System.out.println("getTipoUsuario");
        Usuario user = new Usuario("Otavio", "34736464854", 1, "00000");
        
        assertEquals(1, user.getTipoUsuario());
    }

    /**
     * Test of setTipoUsuario method, of class Usuario.
     */
    @Test
    public void testSetTipoUsuario() {
        System.out.println("setTipoUsuario");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        user.setTipoUsuario(3);
        
        assertEquals(3, user.getTipoUsuario());
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        
        assertEquals("Otavio", user.getNome());
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        user.setNome("Rafael");
        
        assertEquals("Rafael", user.getNome());
    }

    /**
     * Test of getCpf method, of class Usuario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        
        assertEquals("34836464854", user.getCpf());
    }

    /**
     * Test of setCpf method, of class Usuario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        user.setCpf("34836464854");
        
        assertEquals("34836464854", user.getCpf());
    }

    /**
     * Test of getCnpj method, of class Usuario.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        
        assertEquals("00000", user.getCnpj());
    }

    /**
     * Test of setCnpj method, of class Usuario.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        Usuario user = new Usuario("Otavio", "34836464854", 1, "00000");
        user.setCnpj("11111");
        
        assertEquals("11111", user.getCnpj());
    }
    
}
