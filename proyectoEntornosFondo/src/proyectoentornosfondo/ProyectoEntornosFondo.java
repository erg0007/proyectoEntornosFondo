package proyectoentornosfondo;

public class ProyectoEntornosFondo {

    public static void main(String[] args) {
        Cliente paco = new Cliente("paco");
        Cliente maria = new Cliente("maria");
        Cliente lucia = new Cliente("lucia");
        ListaClientes paquita = new ListaClientes(10);
        paquita.aniadirCola(paco);
        paquita.aniadirCola(maria);
        paquita.aniadirCola(lucia);

        paquita.adelantarPuesto(maria);

    }

}
