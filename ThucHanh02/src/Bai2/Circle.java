package Bai2;

import java.util.Scanner;

public class Circle extends Shape{
    Double R;

    public Circle() {

    }

    public Circle(Double x, Double y, Double R) {
        super(x, y);
        this.R = R;
    }

    public Circle(Shape s, Double R) {
        super(s);
        this.R = R;
    }


    @Override
    public void outPut() {
        System.out.println("\t- Thong tin: C(" + x + ", " + y + ", a = " + R + ", dien tich = " + Area());
    }

    @Override
    public Double Area() {
        return R * R * 3.14;
    }
}
