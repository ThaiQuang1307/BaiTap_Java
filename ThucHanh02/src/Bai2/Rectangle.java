package Bai2;

import java.util.Scanner;

public class Rectangle extends Shape{
    // chieu ngan a,  chieu dai b
    Double c;
    Double d;

    public Rectangle(){

    }

    public Rectangle(Double x, Double y, Double c, Double d) {
        super(x, y);
        this.c = c;
        this.d = d;
    }

    public Rectangle(Shape s, Double c, Double d) {
        super(s);
        this.c = c;
        this.d = d;
    }


    @Override
    public void outPut() {
        System.out.println("\t- Thong tin: E(" + x + ", " + y + ", c = " + c + ", d = " + d + ", dien tich = " + Area());
    }

    @Override
    public Double Area() {
        return c * d;
    }
}
