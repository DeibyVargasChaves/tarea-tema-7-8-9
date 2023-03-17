package tarea;

import java.util.Vector;

public class paso3 {
    public static void main(String[] args) {

        Vector <String> marca = new Vector<>();

        marca.add("Toyota");
        marca.add("Ford");
        marca.add("Mercedes Benz");
        marca.add("Nissan");
        marca.add("Hyundai");

        marca.remove("Ford");
        marca.remove("Mercedes Benz");


        System.out.println("marcas de coches: " + marca);

}
    }
