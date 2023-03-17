package tarea;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class paso8 {
    public static void main(String[] args) {
try {
    InputStream in = new FileInputStream("/etc/passwd");
    byte [] datos = in.readAllBytes();
    in.close();

    PrintStream out =new PrintStream("Copia.txt");
    out.write(datos);
    out.close();
        }catch (Exception e){
    System.out.println("Exepciones: " + e.getMessage());
}

    }
}

