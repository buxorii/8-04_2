package task2;

public class Duck2 {
     int age = 5;


}
class MallarDuck extends Duck2{

    public int display(int age){
        return age;
    }
}
class RedheadDuck{
    public String display(String name){
        return "Hello " + name;
    }
}
class Main1{
    public static void main(String[] args) {
        Duck2 p1 = new Duck2();
        MallarDuck p2 = new MallarDuck();
        RedheadDuck p3 = new RedheadDuck();

    }
}