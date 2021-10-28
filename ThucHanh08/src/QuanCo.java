public abstract class QuanCo {
    int x;
    int y;

    public QuanCo(){

    }

    public QuanCo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public QuanCo(QuanCo quanCo){
        this.x = quanCo.x;
        this.y = quanCo.y;
    }

    public boolean canMove(int x0, int y0){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void moveTo(int x0, int y0){

    }
}
