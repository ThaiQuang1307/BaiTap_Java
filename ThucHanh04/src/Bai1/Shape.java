package Bai1;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape() {

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(Shape s) {
        this.x = s.x;
        this.y = s.y;
    }

    public abstract void operation();

    public abstract Shape clone();

    public void add(Shape s){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

    public void remove(Shape s){
        throw new UnsupportedOperationException("Current operation is not support for this object");

    };

    public Shape getChild(int i){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

}


