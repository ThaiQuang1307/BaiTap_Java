package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Square extends Shape{
    Double canhVuong;

    public Square() {

    }

    public Square(Double x, Double y, Double canhVuong) {
        super(x, y);
        this.canhVuong = canhVuong;
    }

    public Square(Shape s, Double canhVuong) {
        super(s);
        this.canhVuong = canhVuong;
    }


    @Override
    public void outPut() {
        System.out.println("\t- Thong tin: S(" + x + ", " + y + ", Canh vuong = " + canhVuong + ", dien tich = " + Area());
    }

    @Override
    public Double Area() {
        return canhVuong * canhVuong;
    }
}
