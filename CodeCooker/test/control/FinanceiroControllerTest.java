/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.financeiro.PainelFinanceiro;

/**
 *
 * @author Rafael
 */
public class FinanceiroControllerTest {
    
    public FinanceiroControllerTest() {
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
     * Test of createHTML method, of class FinanceiroController.
     */
    @Test
    public void testCreateHTML() {
        PainelFinanceiro pf = new PainelFinanceiro();
        FinanceiroController instance = new FinanceiroController(pf);
        try {
            instance.createPdf("relatorio2017-12-27.pdf");
        } catch (IOException ex) {
            Logger.getLogger(FinanceiroControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FinanceiroControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        File f = new File("relatorio2017-12-27.pdf");
        if(f.exists()){
            assertEquals(1,1);
        }
        else{
            fail("Arquivo pdf não encontrado.");
        }
    }

    /**
     * Test of createPdf method, of class FinanceiroController.
     */
    @Test
    public void testCreatePdf() throws Exception {
        PainelFinanceiro pf = new PainelFinanceiro();
        FinanceiroController instance = new FinanceiroController(pf);
        instance.createHTML();
        instance.createPdf("relatorio2017-12-27.pdf");
        File f = new File("relatorio2017-12-27.pdf");
        if(f.exists()){
            assertEquals(1,1);
        }
        else{
            fail("Arquivo pdf não encontrado.");
        }
    }
    
}
