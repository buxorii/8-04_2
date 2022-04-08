package polymorphism;

public class Animal {
    String name;
    int age;
    String sound;

    public String voice(){
        return name+"'s voice as "+sound;
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
}
