package tarea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class paso9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> notas = new HashMap<String, String>();
        ArrayList<String> Usuarios = new ArrayList<String>();

        while (true) {

            try {
                System.out.println("Introduce el nombre del usuario o escribe 'fin' para salir");
                String usuario = scanner.nextLine();

                if (usuario.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.println("introduce las notas de" + usuario + ":");
                String notasObtenidas = scanner.nextLine();

                notas.put(usuario, notasObtenidas);
                Usuarios.add(usuario);

            } catch (Exception e){
                System.out.println("Error en la entrada de datos. Por favor, volver a intentar");
                scanner.nextLine();
            }
        }

        System.out.println("introduce e nombre del usuario para consultar la nota: ");
        String usuarioConsulta =scanner.nextLine();

        if (!Usuarios.contains(usuarioConsulta)){
            System.out.println("El usuario: " + usuarioConsulta + " no existe." );
        }else {

            String notasConsulta = (notas.get(usuarioConsulta));

            if (notasConsulta == null){
                System.out.println("la contraseña para " + usuarioConsulta + " es incorrecta.");
            } else {
                System.out.println("las notas de " + usuarioConsulta + " son: ");
                System.out.println(notasConsulta);
            }
        }

    }
}
