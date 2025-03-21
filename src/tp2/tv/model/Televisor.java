package tp2.tv.model;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private TipoTV tipo;
    private Pantalla pantalla;
    private boolean encendido;

    public Televisor(String marca, String modelo, int anioFabricacion, TipoTV tipo, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.pantalla = pantalla;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public String estaEncendido() {
        return this.encendido ? "Si" : "No";
    }

    public String obtenerInformacion() {
        return String.format("%s %s -- %d pulgadas -- %s -- %s",
            this.marca,
            this.modelo,
            this.pantalla.getPulgadas(),
            this.pantalla.getResolucion(),
            this.pantalla.isSmart() ? "Smart" : "No Smart");
    }

    // Getters y setters
    public Pantalla getPantalla() {
        return pantalla;
    }
} 