package Bai2;

import Bai1.*;

public class TestPrototype {
    public static void main(String[] args) {
        Shape p = new Point(3, 4);
        Shape l = new Line(3, 4);
        Shape c = new Circle(3, 4, 5);
        Shape r = new Rectangular(3, 4, 5);
        Shape g = new Graphic();

        Shape p1 = p.clone();
        Shape l1 = l.clone();
        Shape c1 = c.clone();
        Shape r1 = r.clone();

        g.add(p);
        g.add(l);
        g.add(c);
        g.add(r);

        System.out.println("Test Prototype: ");
        p1.operation();
        l1.operation();
        c1.operation();
        r1.operation();

        g.add(r1);
        g.add(c1);
        g.add(l1);
        g.add(p1);

        Graphic g1 = new Graphic();
        g1 = (Graphic) g.clone();
        for (int i = 0; i < g1.getSizeArrayList(); i++) {
            System.out.println("Child " + i + ": ");
            g1.getChild(i).operation();
            System.out.println("-------------------------");
        }
    }
}
