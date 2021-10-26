package Bai1;

public class TestComposition {

    public static void main(String[] args) {
        Shape p = new Point(3, 4);
        Shape l = new Line(3, 4);
        Shape c = new Circle(3, 4, 5);
        Shape r = new Rectangular(3, 4, 5);
        Shape g = new Graphic();

        p.operation();
        l.operation();
        c.operation();
        r.operation();
        g.operation();

        // them phan tu cho List
        g.add(p);
        g.add(l);
        g.add(c);
        g.add(r);

        g.getChild(1).operation();

        g.remove(l);

        System.out.println("List after delete Line");

        g.getChild(1).operation();
    }
}
