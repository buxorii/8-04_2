package task02;

public class ReadheadDuck extends Duck{
    @Override
    public void display(){
        System.out.println(name+" has a head. "+name+"'s head is "+color);
    }

    public ReadheadDuck(String name) {
        super(name);
    }
}
