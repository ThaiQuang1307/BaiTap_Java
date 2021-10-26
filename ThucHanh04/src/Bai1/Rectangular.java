package Bai1;

public class Rectangular extends Shape{
    int h;

    public Rectangular(int x, int y, int h) {
        super(x, y);
        this.h = h;
    }

    public Rectangular(Rectangular r) {
        super(r);
        this.h = r.h;
    }

    @Override
    public void operation() {
        System.out.println("Volume of the rectangular box: " + x * y * h);
    }

    @Override
    public Shape clone() {
        return new Rectangular(this);
    }
}
