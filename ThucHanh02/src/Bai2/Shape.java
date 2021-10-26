package Bai2;

public abstract class Shape {
    protected Double x, y;

    public Shape() {

    }

    public Shape(double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Shape(Shape s) {
        this.x = s.x;
        this.y = s.y;
    }

    public void add(Shape s){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

    public abstract void outPut();

    public abstract Double Area();

    public int Count(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

    public Shape getChild(int i){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };
}
