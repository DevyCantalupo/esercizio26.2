
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class esercizio26di2 {

    private static void add(Set list, articulos x, articulos z, articulos y) {
        list.add(x);
        list.add(z);
        list.add(y);
    }

    public static void main(String[] args) {
        Set<String> list = new HashSet<String>();

        articulos am1 = new articulos(3, "Legos");
        articulos am2 = new articulos(6, "Libros");
        articulos am3 = new articulos(9, "Comida");

        add(list, am1, am2, am3);
        System.out.println(list);

        articulos am4 = new articulos(10, "Vino");
        articulos am5 = am1;

        System.out.println("am4 ?" + list.contains(am4));
        System.out.println("am5 ? " + list.contains(am5));

        Set<Integer> list2 = new HashSet<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(list2);
        Integer IsTrue = 3;
        System.out.println(IsTrue + " " + list2.contains(IsTrue));

    }

}
