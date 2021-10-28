package Bai2;

public class FileRun extends FileLeaf{
    private int x;
    private int y;

    public FileRun(String nameFile) {
        super(nameFile);
    }

    public FileRun(String nameFile, int x, int y) {
        super(nameFile);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void open() {
        System.out.println(getNameFile() + " : " + x + " + " + y + " = " + (x+y));
    }
}
