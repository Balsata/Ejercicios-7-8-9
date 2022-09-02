import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        reverse("Hola mundo");

        String arr[] = {"Frase1", "Frase2", "Frase3"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int arraybidi[][] = {{1, 2, 3},
                {4, 5, 6}};

        for (int i = 0; i < arraybidi.length; i++) {

            for (int j = 0; j < arraybidi[1].length; j++) {

                System.out.println("Posicion i = " + i + " Posicion j: " + j + " Valor : " + arraybidi[i][j]);
            }
        }

        Vector<Integer> vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Datos de vector " + vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Datos eliminados " + vector);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Dato 1");
        lista.add("Dato 2");
        lista.add("Dato 3");
        lista.add("Dato 4");

        LinkedList<String> listaenlace = new LinkedList<>(lista);

        for (int i = 0; i < listaenlace.size(); i++) {
            System.out.println(listaenlace.get(i));
        }

    }
        

    public static void reverse(String texto) {
        String nstr = "";
        char ch;
        for (int i = 0; i < texto.length(); i++) {
            ch = texto.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);

    }
}



