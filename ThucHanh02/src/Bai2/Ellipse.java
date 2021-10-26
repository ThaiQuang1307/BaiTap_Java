package Bai2;

import java.util.Scanner;

public class Ellipse extends Shape{
    // truc ngan(2a),  truc dai (2b)
    Double a;
    Double b;

    public Ellipse(){

    }

    public Ellipse(Double x, Double y, Double a, Double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public Ellipse(Shape s, Double a, Double b) {
        super(s);
        this.a = a;
        this.b = b;
    }


    @Override
    public void outPut() {
        System.out.println("\t- Thong tin: E(" + x + ", " + y + ", a = " + a + ", b = " + b + ", dien tich = " + Area());
    }

    @Override
    public Double Area() {
        return a * b * 3.14;
    }

}
