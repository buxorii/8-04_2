package abstraction_oop;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat and bond.");
    }
}
