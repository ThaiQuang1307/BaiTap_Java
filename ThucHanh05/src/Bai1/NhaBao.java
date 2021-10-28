package Bai1;

public class NhaBao extends NhanVien{
    private int soBaiDaDang;

    public NhaBao(){

    }

    public NhaBao(String tenNhanVien, int soBaiDaDang){
        super(tenNhanVien);
        this.soBaiDaDang = soBaiDaDang;
    }

    public NhaBao(NhaBao nhaBao){
        super(nhaBao);
        this.soBaiDaDang = nhaBao.soBaiDaDang;
    }

    public int getSoBaiDaDang() {
        return soBaiDaDang;
    }

    public void setSoBaiDaDang(int soBaiDaDang) {
        this.soBaiDaDang = soBaiDaDang;
    }

    @Override
    public void hienThi() {
        System.out.println("\tHo va ten: " + getTenNhanVien());
        System.out.println("\tSo bai da dang: " + getSoBaiDaDang());
    }
}
