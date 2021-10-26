package Bai1;

public class Circle extends Shape{
    int R;

    public Circle() {

    }

    public Circle(int x, int y, int R) {
        super(x, y);
        this.R = R;
    }

    public Circle(Circle c) {
        super(c);
        this.R = c.R;
    }

    @Override
    public void operation() {
        Double P = 2 * R * 3.14;
        Double S = R * R * 3.14;
        System.out.println("Chu vi Circle = " + P);
        System.out.println("Dien tich Circle = " + S);
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
