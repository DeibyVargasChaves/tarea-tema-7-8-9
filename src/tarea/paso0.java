package tarea;

public class paso0 {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("hola mundo");

        sb.reverse();

        System.out.println("palabra invertida: " + sb);

//------------------------------------------------------------------------------------------

        String cadena = "hola mundo";
        char[] characters = new char[cadena.length()];

        for (int i= cadena.length()-1, j=0; i>= 0; i--, j++) {

            characters[j] = cadena.charAt(i);
            String cadenaInvertida = new String(characters);
            System.out.println("palabra invertida: " + cadenaInvertida);
        }
    }
}