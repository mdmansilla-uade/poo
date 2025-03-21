package tp2.tv.model;

public class Pantalla {
    private int pulgadas;
    private String resolucion;
    private boolean smart;

    public Pantalla(int pulgadas, String resolucion, boolean smart) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.smart = smart;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
} 