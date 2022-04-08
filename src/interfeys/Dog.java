package interfeys;

public class Dog implements Life, Hunt{
    @Override
    public void eat() {
        System.out.println("Dogs eat meat and bond.");
    }
    @Override
    public void drink() {
        System.out.println("Dogs drink water.");
    }
    @Override
    public void walk() {
        System.out.println("Dogs walk faster than cats.");
    }

    @Override
    public void hunt() {
        System.out.println("Dogs can hunt.");
    }
}
