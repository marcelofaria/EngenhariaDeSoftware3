package model;

import java.sql.Time;
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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of getIdReserva method, of class Reserva.
     */
    @Test
    public void testGetIdReserva() {
        System.out.println("getIdReserva");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        
        assertEquals(1, r1.getIdReserva());
    }

    /**
     * Test of setIdReserva method, of class Reserva.
     */
    @Test
    public void testSetIdReserva() {
        System.out.println("setIdReserva");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        r1.setIdReserva(2);
        
        assertEquals(2, r1.getIdReserva());
    }

    /**
     * Test of getNumMesa method, of class Reserva.
     */
    @Test
    public void testGetNumMesa() {
        System.out.println("getNumMesa");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        
        assertEquals(5, r1.getNumMesa());
    }

    /**
     * Test of setNumMesa method, of class Reserva.
     */
    @Test
    public void testSetNumMesa() {
        System.out.println("setNumMesa");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        r1.setNumMesa(8);
        
        assertEquals(8, r1.getNumMesa());
    }

    /**
     * Test of getNome method, of class Reserva.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        
        assertEquals("Otavio", r1.getNome());
    }

    /**
     * Test of setNome method, of class Reserva.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        r1.setNome("Rafael");
        
        assertEquals("Rafael", r1.getNome());
    }

    /**
     * Test of getHorario method, of class Reserva.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        
    }

    /**
     * Test of setHorario method, of class Reserva.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        
    }

    /**
     * Test of getNumPessoas method, of class Reserva.
     */
    @Test
    public void testGetNumPessoas() {
        System.out.println("getNumPessoas");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        
        assertEquals(4, r1.getNumPessoas());
    }

    /**
     * Test of setNumPessoas method, of class Reserva.
     */
    @Test
    public void testSetNumPessoas() {
        System.out.println("setNumPessoas");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        r1.setNumPessoas(6);
        
        assertEquals(6, r1.getNumPessoas());
    }

    /**
     * Test of getTelefone method, of class Reserva.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        
        assertEquals("11914141414", r1.getTelefone());
    }

    /**
     * Test of setTelefone method, of class Reserva.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        Reserva r1 = new Reserva(1, 5, "Otavio", null, 4, "11914141414");
        r1.setTelefone("19912121212");
        
        assertEquals("19912121212", r1.getTelefone());
    }
    
}
