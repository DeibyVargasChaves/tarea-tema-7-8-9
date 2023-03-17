package tarea;

import java.util.Scanner;

public class paso7 {
    public static void DividePor0() throws ArithmeticException{
        Scanner DividePor0 = new Scanner(System.in);
        System.out.println("ingrese el dividendo: ");
        int a = DividePor0.nextInt();
        System.out.println("ingrese el divisor: ");
        int b = DividePor0.nextInt();

        if (b == 0){
        throw new ArithmeticException("Division por cero");
    }
        int resultado = a / b;
        System.out.println("el resultado de la division es: " + resultado);
    }
        public static void main(String[] args) {
        try {
            DividePor0();

        }catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de código");

        }

    }
}
