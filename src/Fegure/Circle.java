package Fegure;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void perimetr(){
        System.out.println(2*3.14*radius);

    }

}
