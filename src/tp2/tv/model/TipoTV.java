package tp2.tv.model;

public enum TipoTV {
    P("Plasma"),
    L("LCD"),
    O("OLED");

    private final String descripcion;

    TipoTV(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
} 