package Bai2;

public class Main {
    public static void main(String[] args) {
        Shape e = new Ellipse(0d,0d,1d,1d);
        Shape c = new Circle(0d, 0d, 2d);
        Shape r = new Rectangle(0d, 0d, 3d, 4d);
        Shape s = new Square(0d, 0d, 5d);
        Shape ss = new Square(0d, 0d, 5d);
        Controller controllers = new Controller();

        // nhap thong tin cac doi tuong
        controllers.add(e);

        controllers.add(c);

        controllers.add(r);

        controllers.add(s);

        controllers.add(ss);

        //  hien thi thong tin chi tiet doi tuong
        controllers.outPut();

        // tong dien tich cac doi tuong
        System.out.println("Tong dien tich cac doi tuong trong List: ");
        System.out.println(controllers.Area());

        // diem so luong tung loai doi tuong
        int countE = 0, countC = 0, countR = 0, countS = 0;
        for (Shape shape : controllers.getControllers()) {
            if (shape instanceof Ellipse)   countE++;
            else if (shape instanceof Circle)   countC++;
            else if (shape instanceof Rectangle)   countR++;
            else countS++;
        }

        System.out.println("\t - Count Ellipse: " + countE);
        System.out.println("\t - Count Circle: " + countC);
        System.out.println("\t - Count Rectangle: " + countR);
        System.out.println("\t - Count Square: " + countS);
    }
}
