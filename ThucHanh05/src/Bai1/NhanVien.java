package Bai1;

public abstract class NhanVien {
    private String tenNhanVien;

    public NhanVien(){

    }

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public NhanVien(NhanVien nhanVien){
        this.tenNhanVien = nhanVien.tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    // bo sung nhan vien
    public void boSung(NhanVien nhanVien){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    // sa thai nhan vien
    public void saThai(NhanVien nhanVien){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    // in thong tin nhan vien
    public void hienThi(){

    }
}
