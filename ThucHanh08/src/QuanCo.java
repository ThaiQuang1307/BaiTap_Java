public class QuanCo {
    // toa do cua quan co
    int x;
    int y;

    // ki hieu nguoi choi
    int z;

    public QuanCo() {
    }

    public QuanCo(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public boolean canMoveTo(int  x0,int y0,BanCo bc ){
        return true;
    }
    public void moveTo(int x0,int y0,BanCo bc){
        x = x0;
        y = y0;
    }
}
