
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectoentornosfondo;

//Debemos importar librerias para hacer los test con JUnit y Hamcrest
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elena.racero
 */
public class ListaClientesTest {

    public ListaClientesTest() {
    }

    
    /*Este bloque se encarga de comprobar que el cliente no ha sido atendido*/
    @Test
    public void testAtenderCuandoElClienteNoEstaAtendido() {
        Cliente cliente = new Cliente("elena");
        ListaClientes manuel = new ListaClientes();
        
        manuel.atender();

        assertEquals(cliente.isAtendido(), false);
    }

    /*Este bloque se encarga de comprobar que el cliente SI ha sido atendido*/
    @Test
    public void testAtenderCuandoElClienteYaEstaAtendido() {
        
        Cliente cliente = new Cliente("elena");
        Cliente maria = new Cliente("maria");
        Cliente lucia = new Cliente("lucia");
        ListaClientes paquita = new ListaClientes(10);

        paquita.atender();

        assertEquals(cliente.isAtendido(), false);

        paquita.atender();

        assertEquals(cliente.isAtendido(), false);
    }

    
    @Test
    public void testAbandonar() {
    }

    
    /*Este bloque se encarga de comprobar que el cliente puede adelantar un puesto*/
    @Test
    public void testAdelantarPuesto() {

        Cliente paco = new Cliente("paco");
        Cliente maria = new Cliente("maria");
        Cliente lucia = new Cliente("lucia");
        ListaClientes paquita = new ListaClientes(10);
        paquita.aniadirCola(paco);
        paquita.aniadirCola(maria);
        paquita.aniadirCola(lucia);

        paquita.adelantarPuesto(maria);

        assertSame(paquita.listaClientes[0], maria);

    }

    /**
     * Test of atrasarPuesto method, of class ListaClientes.
     */
    @Test
    public void testAtrasarPuesto() {
    }

    /**
     * Test of dejarPasar method, of class ListaClientes.
     */
    @Test
    public void testDejarPasar() {
    }

    /**
     * Test of mostrarNoAtendidos method, of class ListaClientes.
     */
    @Test
    public void testMostrarNoAtendidos() {
    }

    /**
     * Test of mostrarAtendidos method, of class ListaClientes.
     */
    @Test
    public void testMostrarAtendidos() {
    }

}