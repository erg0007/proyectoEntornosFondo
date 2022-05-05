package proyectoentornosfondo;

public class ListaClientes {

    public Cliente listaClientes[];
    private int tamanioLista;
    private int numHuecos;
    private boolean atendido;

    //Metodo constructor de lista de clientes, es decir una cola con turnos
    public ListaClientes(int tamanioLista) {
        this.tamanioLista = tamanioLista;
        this.listaClientes = new Cliente[tamanioLista];
    }
    
    public ListaClientes() {
    }

    //Aniade un cliente a la cola
    public String aniadirCola(Cliente nuevo) {
        String res = "";
        boolean insertado = false;
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == null) {
                nuevo.setNumLista(i);
                listaClientes[i] = nuevo;
                i = listaClientes.length + 1;
                insertado = true;
            }
        }
        if (insertado) {
            res = "Se ha podido aniadir el cliente";
        } else {
            res = "No se ha podido aniadir el cliente";
        }
        return res;
    }

    //Metodo para atender a los clientes de la cola
    public void atender() {
        if (!this.atendido) {
            this.atendido = false;
            System.out.println("El cliente esta siendo atendido");
        } else {
            System.out.println("El cliente ya se encuentra atentdido");
        }
    }

    //Metodo para que un cliente abandone la cola
    public void abandonar() {
        if (this.atendido) {
            this.atendido = false;
            System.out.println("El cliente ha abandonado la cola");
        } else {
            System.out.println("El cliente no se encuentra en la cola");
        }
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

    public void dejarPasar(Cliente pasado) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (pasado.getNumLista() == listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(-1);
                i += listaClientes.length;
            }
        }
        for (int i = 0; i < listaClientes.length; i++) {
            if (pasado.getNumLista() - 1 == listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(+1);
                i += listaClientes.length;
            }
        }

    }

    public void mostrarNoAtendidos() {
        for (int i = 0; i < listaClientes.length; i++) {
            if (!atendido) {
                System.out.println(listaClientes[i].getNombre());
            }
        }
    }

    public void mostrarAtendidos() {
        for (int i = 0; i < listaClientes.length; i++) {
            if (atendido) {
                System.out.println(listaClientes[i].getNombre());
            }
        }
    }
}
