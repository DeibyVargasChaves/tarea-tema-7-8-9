package tarea;

import java.util.ArrayList;

public class paso6 {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            numero.add(i);

        }
for (int i = numero.size() - 1; i >= 0; i--) {
    if (numero.get(i) % 2 == 0) {
        numero.remove(i);

    }
}
        System.out.println(numero);
        }
    }

