package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller extends Shape{
    static Scanner sc = new Scanner(System.in);

    private ArrayList<Shape> controllers = new ArrayList<>();

    public Controller() {

    }

    public Controller(Controller c) {
        super(c);
        this.controllers = c.controllers;
    }

    public ArrayList<Shape> getControllers() {
        return controllers;
    }

    @Override
    public void add(Shape s){
        controllers.add(s);
    }

    @Override
    public void outPut() {
        System.out.println("---Thong tin cac doi tuong cua List---");
        for (Shape shape : getControllers()) {
            shape.outPut();
//            System.out.println("--------------------------------");
        }
    }

    @Override
    public Double Area() {
        Double sumArea = 0d;
        for (Shape shape : getControllers()) {
            sumArea += shape.Area();
        }
        return sumArea;
    }

    @Override
    public Shape getChild(int i){
        return controllers.get(i);
    }
}
