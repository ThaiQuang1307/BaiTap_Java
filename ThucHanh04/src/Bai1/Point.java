package Bai1;

public class Point extends Shape{
    public Point(){

    }

    public Point(int x, int y) {
        super(x, y);
    }

    public Point(Point p) {
        super(p);
    }

    @Override
    public void operation() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    @Override
    public Shape clone() {
        return new Point(this);
    }
}
