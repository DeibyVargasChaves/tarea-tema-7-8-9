package tarea;

import java.util.ArrayList;
import java.util.LinkedList;

public class paso5 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();

        arraylist.add("primero");
        arraylist.add("segundo");
        arraylist.add("tercero");
        arraylist.add("cuarto");

        LinkedList<String> linkedList = new LinkedList<>(arraylist);


        for (String s : arraylist) {
            System.out.println("ArrayList: " + s);
        }

        for (String s : linkedList) {
            System.out.println("linkedList: " + s);
        }
    }
}

