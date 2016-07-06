/**
 * Created by xvom on 06.07.2016.
 */
public class Wife extends Family {
    int Length_hair;
    String color_hair, colour_eyes;
    int heigth;


    public Wife(String surname) {
        super(surname);
        // System.out.println("2...");
    }

    public Wife() {
        super.work();
        // System.out.println("6...");
    }

    public void appearance(int l, int h, String hair, String eyes) {
        color_hair = hair;
        colour_eyes = eyes;
        heigth = h;
        Length_hair = l;
    }
}

