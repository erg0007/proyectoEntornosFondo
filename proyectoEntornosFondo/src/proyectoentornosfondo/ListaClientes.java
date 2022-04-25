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
    public void adelantarPuesto(Cliente adelantado) {
    for (int i = 0; i < listaClientes.length; i++) {
        if (adelantado.getNumLista() > listaClientes[i].getNumLista()) {
            listaClientes[i].setNumLista(-1);
            i = listaClientes.length;
            adelantado.setNumLista(+1);
        }
    }
}

public void atrasarPuesto(Cliente atrasado) {
    for (int i = 0; i < listaClientes.length; i++) {
        if (atrasado.getNumLista() > listaClientes[i].getNumLista()) {
            listaClientes[i].setNumLista(+1);
            i = listaClientes.length;
            atrasado.setNumLista(-1);
        }
    }
}
}
//Termina parte de Angel
