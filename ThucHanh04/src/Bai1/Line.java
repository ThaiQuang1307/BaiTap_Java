package Bai1;

public class Line extends Shape {
    public Line() {

    }

    public Line(int x, int y) {
        super(x, y);
    }

    public Line(Line l) {
        super(l);
    }

    @Override
    public void operation() {
        System.out.println("Line: " + x + " - " + y);
    }

    @Override
    public Shape clone() {
        return new Line(this);
    }
}
