package proyectoentornosfondo;

public class Cliente {

    private String nombre;
    private boolean atendido = false;
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

    
}
