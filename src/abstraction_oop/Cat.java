package abstraction_oop;

public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats drink milk and eat mice.");
    }
}
