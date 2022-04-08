package polymorphism;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik","woof");
        System.out.println(d1.voice());

        Animal a1 = new Animal("Cow","mooo");
        System.out.println(a1.voice());

    }

    public static int modul(int x){
        return (x>0)?x:-x;
    }
    public static double modul(double x){
        return (x>0)?x:-x;
    }
    public static float modul(float x){
        return (x>0)?x:-x;
    }
    public static long modul(long x){
        return (x>0)?x:-x;
    }

}