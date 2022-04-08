package task2;

import java.util.Scanner;

public class Duck {
     public String quack(String voice){
         return "Your voice >>> " + voice;
     }
     public boolean swim(boolean n){
         return n;
     }
     public int display(int age){
         return age;
     }
     public String display(String name){
         return "Hello " + name ;
     }
}

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age: "); int age = in.nextInt();
        System.out.print("Name: ");  String name = in.next();
        System.out.println("Voice: "); String voice = in.next();
        System.out.println("Can swim?(True , False): "); boolean n = in.nextBoolean();
        Duck text = new Duck();
        System.out.println(text.display(age));
        System.out.println(text.display(name));
    }
}
