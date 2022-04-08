package task02;

public class MallardDuck extends Duck {
    @Override
    public void display(){
        System.out.println(name+" has a "+color+" head");
    }

    public MallardDuck(String name) {
        super(name);
    }
}
