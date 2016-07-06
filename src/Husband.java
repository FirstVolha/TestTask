/**
 * Created by xvom on 06.07.2016.
 */
public class Husband extends Family implements InterfaceMy, InterfaceTwo {

    String color_hair, colour_eyes;
    int heigth, weigth;
    String Name;

    public Husband() {
        //System.out.println("3...");
        super.work();
    }

    public Husband(String name) {
        Name = name;
        //System.out.println("3...");
    }

    public void appearance(int h, int w, String hair, String eyes) {
        color_hair = hair;
        colour_eyes = eyes;
        heigth = h;
        weigth = w;
        System.out.print("Husband is " + Surname + " and He has :  ");
        System.out.println();
        System.out.println("Color_hair  " + color_hair);
        System.out.println("Color_eyes  " + colour_eyes);
    }

    public int method_age(int number) {
        return number;
    }
}
