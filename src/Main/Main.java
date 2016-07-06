package Main;

import Other_interface.Family;
import Other_interface.Husband;
import Other_interface.InterfaceTwo;
import Other_interface.Wife;

import java.util.*;

/**
 * Created by xvom on 06.07.2016.
 */
public class Main {
    private static final java.util.Map Map;

    static {
        Map = new HashMap();
        Map.put(1, "one");
        Map.put(2, "two");
    }

    protected static void map_function() {
        Map<Integer, String> map;
        map = Collections.emptyMap();///пустая коллекция
        map = new HashMap<Integer, String>();
        map.put(1, "One my value");
        map.put(2, "Two my value");
        System.out.println(map);

    }

    public static void show(ArrayList arraylist) {
        String test;
        System.out.println("\n==> For Example...");
        for (int i = 0; i < arraylist.size(); i++) {
            test = arraylist.get(i) + " ";
            System.out.println(test);
        }

        System.out.println("\n==> Iterator Example...");
        Iterator<String> arraylistIterator = arraylist.iterator();
        while (arraylistIterator.hasNext()) {
            System.out.println(arraylistIterator.next());
        }

        // iterate via "while loop"
        System.out.println("\n==> While Loop Example....");
        int i = 0;
        while (i < arraylist.size()) {
            System.out.println(arraylist.get(i));
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("0...");
        // Other_interface.Family family = new Other_interface.Family("Ivanovy");
        // Other_interface.Family family = new Other_interface.Family();
        System.out.println("5...");
        Husband husband = new Husband("Sergei");
        Wife wife = new Wife();
        Family family = new Family("Ivanovy_new", husband, wife);
        wife = new Wife("Petrova");
        //System.out.println(family.Surname);
        // System.out.println(wife.Surname);
        //System.out.println(husband.Surname);
        husband.appearance(180, 65, "Black", "Blue");

        System.out.println(family.method_age(3));
        System.out.println(InterfaceTwo.x);
        System.out.println(InterfaceTwo.a);
        System.out.println(husband.method_age(25));
        family.work();

        // Map and HashMap
        map_function();

        // List and ArrayList / Vector/Stack/
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Testing");
        arraylist.add("Next");

        show(arraylist);

        ArrayList<Family> list_familly = new ArrayList<Family>();
        list_familly.add(new Family("New_surname"));
        list_familly.add(new Family("New_surname2"));


    }

}

