/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael
 */
public class CodeCookerControllerTest {
    
    public CodeCookerControllerTest() {
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
     * Test of start method, of class CodeCookerController.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        CodeCookerController instance = new CodeCookerController();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioID method, of class CodeCookerController.
     */
    @Test
    public void testGetUsuarioID() {
        System.out.println("getUsuarioID");
        int expResult = 0;
        int result = CodeCookerController.getUsuarioID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autUsuario method, of class CodeCookerController.
     */
    @Test
    public void testAutUsuario() {
        System.out.println("autUsuario");
        String u = "";
        String senha = "";
        CodeCookerController instance = new CodeCookerController();
        int expResult = 0;
        int result = instance.autUsuario(u, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadUsuario method, of class CodeCookerController.
     */
    @Test
    public void testCadUsuario() {
        System.out.println("cadUsuario");
        String username = "";
        String pass = "";
        int tipo = 0;
        String nome = "";
        String cpf = "";
        CodeCookerController instance = new CodeCookerController();
        instance.cadUsuario(username, pass, tipo, nome, cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
