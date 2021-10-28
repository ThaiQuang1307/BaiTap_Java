package Bai1;

public class Main {
    public static void main(String[] args) {
        NhanVien n1 = new NVVanPhong("Trinh Thai Quang", "Thuc tap sinh");
        NhanVien n2 = new NVVanPhong("Nguyen Van A", "Thuc tap sinh");
        NhanVien n3 = new NVVanPhong("Nguyen Van B", "Thuc tap sinh");
        NhanVien n4 = new NhaBao("Nguyen Van C", 100);
        NhanVien n5 = new NhaBao("Nguyen Van D", 200);
        NhanVien n6 = new NhaBao("Nguyen Van E", 300);

        ToaBao toaBaos = new ToaBao();

        // bo sung nhan vien
        toaBaos.boSung(n1);
        toaBaos.boSung(n2);
        toaBaos.boSung(n3);
        toaBaos.boSung(n4);
        toaBaos.boSung(n5);
        toaBaos.boSung(n6);
        // danh sach nhan vien ban dau
        toaBaos.hienThi();

        // in danh sach NV van phong
        toaBaos.hienThiNVVanPhong();

        //in danh sach nha bao
        toaBaos.hienThiNhaBao();


        // sa thai nhan vien n3 la nhan vien van phong
        toaBaos.saThai(n3);

        // sa thai nhan vien n4 la nha bao
        toaBaos.saThai(n4);

        // hien thi danh sach nhan vien sau khi sa thai
        toaBaos.hienThi();

    }
}
