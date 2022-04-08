package polymorphism;

public class Dog extends Animal{
    public String voice(){
        return name+" barking "+sound+", because it's a dog.";
    }

    public Dog(String name, String sound) {
        super(name, sound);
    }
}
