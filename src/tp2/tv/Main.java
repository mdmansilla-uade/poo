package tp2.tv;

import tp2.tv.model.Pantalla;
import tp2.tv.model.TipoTV;
import tp2.tv.model.Televisor;

public class Main {
    public static void main(String[] args) {
        Pantalla pantallaCompartida = new Pantalla(55, "4K", true);
        Pantalla pantallaCompartida2 = new Pantalla(32, "1080p", false);

        Televisor tv1 = new Televisor("Samsung", "Series 9", 2023, TipoTV.O, pantallaCompartida);
        Televisor tv2 = new Televisor("Samsung", "Series 8", 2023, TipoTV.O, pantallaCompartida);
        Televisor tv3 = new Televisor("Samsung", "Series 7", 2023, TipoTV.L, pantallaCompartida2);
        Televisor tv4 = new Televisor("Samsung", "Series 6", 2023, TipoTV.L, pantallaCompartida2);

        System.out.println("Estado inicial TV1: " + tv1.obtenerInformacion());
        System.out.println("Estado inicial TV2: " + tv2.obtenerInformacion());
        System.out.println("Estado inicial TV3: " + tv3.obtenerInformacion());
        System.out.println("Estado inicial TV4: " + tv4.obtenerInformacion());

        pantallaCompartida.setResolucion("8K");
        pantallaCompartida.setResolucion("4K");

        System.out.println("\nDespués de modificar la resolución:");
        System.out.println("Estado TV1: " + tv1.obtenerInformacion());
        System.out.println("Estado TV2: " + tv2.obtenerInformacion());
        System.out.println("Estado TV3: " + tv3.obtenerInformacion());
        System.out.println("Estado TV4: " + tv4.obtenerInformacion());

        tv1.encender();
        tv4.encender();
        System.out.println("\nEstado de encendido:");
        System.out.println("TV1 encendida: " + tv1.estaEncendido());
        System.out.println("TV2 encendida: " + tv2.estaEncendido());
        System.out.println("TV3 encendida: " + tv3.estaEncendido());
        System.out.println("TV4 encendida: " + tv4.estaEncendido());
    }
} 