package task02;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new Duck("McDonald");
        d1.color="white";
        d1.display();

        MallardDuck m1 = new MallardDuck("McDuck");
        m1.color = "green";
        m1.display();

        ReadheadDuck r1 = new ReadheadDuck("Pumba");
        r1.color="red";
        r1.display();
    }
}
