package tarea;

public class paso2 {
    public static void main(String[] args) {
        int [] [] arrayBidi = new int [2] [4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 5;
        arrayBidi[1][1] = 6;
        arrayBidi[1][2] = 7;
        arrayBidi[1][3] = 8;

        for(int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);

            for(int j = 0; j < arrayBidi[0].length; j++) {
                System.out.println("estas en la fila: " + i + ", estas en la columna: " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

    }
}
