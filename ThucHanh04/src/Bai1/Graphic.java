package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Graphic extends Shape {

    private ArrayList<Shape> graphic = new ArrayList<>();

    public Graphic(Graphic g) {
        super(g);
        this.graphic = g.graphic;
    }

    public Graphic() {

    }

    // size of ArrayList
    public int getSizeArrayList(){
        return graphic.size();
    }

    @Override
    public void operation() {
        System.out.println("This is Graphic's method..!");
    }

    @Override
    public Shape clone() {
        return new Graphic(this);
    }

    @Override
    public void add(Shape s) {
        graphic.add(s);
    }

    @Override
    public void remove(Shape s) {
        graphic.remove(s);
    }

    @Override
    public Shape getChild(int i) {
        return graphic.get(i);
    }
}
