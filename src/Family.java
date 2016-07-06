/**
 * Created by xvom on 06.07.2016.
 */
public class Family implements InterfaceMy {

    String Surname;
    int num;

    public Family(String New_surname) {
        // Wife wife = new Wife();
        // Husband husband = new Husband();
        Surname = New_surname;
        // wife.Surname = New_surname;
        // husband.Surname = New_surname;
        // System.out.println("1...");
    }

    public Family(String New_surname, Husband hus, Wife wif) {
        Surname = New_surname;
        wif.Surname = New_surname;
        hus.Surname = New_surname;
        //  System.out.println("12...");
    }

    public Family() {
        //  System.out.println("11...");
    }

    private void work2() {
        System.out.println("I'm not working!...");
    }

    protected void work() {
        System.out.println("I'm working!... And we can use function work2.");
        work2();
    }

    public void appearance() {
        num = 2;
        System.out.println("The number people in family " + num);
    }

    public int method_age(int number) {
        return number;
    }
}
