/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Mesa;
import model.MesaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.mesas.PainelMesas;

/**
 *
 * @author Rafael
 */
public class MesasControllerTest {
    
    public MesasControllerTest() {
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

    @Test
    public void testCarregarStatusMesas() {
        
        PainelMesas pm = new PainelMesas();
        MesasController instance = new MesasController(pm);
        if(instance.getTela().getBtnMesa1().getForeground().getRed() == 255){
            MesaDAO mdao = MesaDAO.getInstance();
            mdao.update(new Mesa(1, 1));
        }
        else{
            instance.getTela().switchMesa1Color();
            MesaDAO mdao = MesaDAO.getInstance();
            mdao.update(new Mesa(1, 1));
        }
        instance.carregarStatusMesas();
        if(!(instance.getTela().getBtnMesa1().getForeground().getRed() == 255)){
            assertEquals(1, 1);
        }
        else{
            fail();
        }

    }
    
}
