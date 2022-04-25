package proyectoentornosfondo;

public class ListaClientes {

    private Cliente listaClientes[];
    private int tamanioLista;
    private int numHuecos;
    private boolean atendido;

    public ListaClientes(int tamanioLista) {
        this.tamanioLista = tamanioLista;
        this.listaClientes = new Cliente[tamanioLista];
    }
}
//Termina parte de Angel
