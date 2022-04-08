package interfeys;

public class Cow implements Life{
    @Override
    public void eat() {
        System.out.println("Cows eat grass and flowers.");
    }
    @Override
    public void drink() {
        System.out.println("Cows drink water.");
    }
    @Override
    public void walk() {
        System.out.println("Cows walk slower than dogs.");
    }
}
