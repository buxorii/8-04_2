package task02;

public class Duck {
    String name;
    String color;
    public void quack(){
        System.out.println(name+" says 'Quack'");
    }
    public void swim(){
        System.out.println(name+" can swim");
    }

    public void display(){
        System.out.println(name+" has a head");
    }

    public Duck(String name) {
        this.name = name;
    }
}
