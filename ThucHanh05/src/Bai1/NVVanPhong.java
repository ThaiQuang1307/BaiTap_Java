package Bai1;

public class NVVanPhong extends NhanVien {
    private String chucVu;

    public NVVanPhong() {

    }

    public NVVanPhong(String tenNhanVien, String chucVu) {
        super(tenNhanVien);
        this.chucVu = chucVu;
    }

    public NVVanPhong(NVVanPhong nvVanPhong) {
        super(nvVanPhong);
        this.chucVu = nvVanPhong.chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void hienThi() {
        System.out.println("\tHo va ten: " + getTenNhanVien());
        System.out.println("\tChuc vu: " + getChucVu());
    }
}
