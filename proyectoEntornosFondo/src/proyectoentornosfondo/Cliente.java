package proyectoentornosfondo;

public class Cliente {

    private String nombre;
    private boolean atendido;
    private int numLista;
    private String var = "";

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.atendido = false;
        this.numLista = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public int getNumLista() {
        return numLista;
    }

    public void setNumLista(int numLista) {
        this.numLista = numLista;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void atender() {
        if (!this.atendido) {
            this.atendido = true;
            System.out.println("El cliente " + this.nombre
                    + " esta siendo atendido");
        } else {
            System.out.println("El cliente " + this.nombre + " ya ha sido atendido");
        }
    }

    public void abandonar() {
        if (this.atendido) {
            this.atendido = false;
            System.out.println("El cliente ha abandonado la cola");
        } else {
            System.out.println("El cliente no se encuentra en la cola");
        }
    }
}
