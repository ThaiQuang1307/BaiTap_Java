package Bai1;

import java.util.ArrayList;

public class ToaBao extends NhanVien {
    private String tenToaBao;

    private ArrayList<NhanVien> nvToaBaos = new ArrayList<>();

    public ToaBao() {
    }

    public ToaBao(ToaBao toaBao) {
        super(toaBao);
        this.tenToaBao = toaBao.tenToaBao;
        this.nvToaBaos = toaBao.nvToaBaos;
    }

    public String getTenToaBao() {
        return tenToaBao;
    }

    public void setTenToaBao(String tenToaBao) {
        this.tenToaBao = tenToaBao;
    }

    public ArrayList<NhanVien> getNvToaBaos() {
        return nvToaBaos;
    }

    public void setNvToaBaos(ArrayList<NhanVien> nvToaBaos) {
        this.nvToaBaos = nvToaBaos;
    }

    // bo sung nhan vien cho toa boa
    @Override
    public void boSung(NhanVien nhanVien) {
        nvToaBaos.add(nhanVien);
    }

    @Override
    public void saThai(NhanVien nhanVien) {
        nvToaBaos.remove(nhanVien);
    }

    // in danh sach NV van phong
    public void hienThiNVVanPhong() {
        int dem = 0;
        if (nvToaBaos.isEmpty()) {
            System.out.println("Toa bao khong co nhan vien nao..!");
            return;
        }
        System.out.print("\n\n---Danh sach nhan vien van phong---\n");
        for (NhanVien nvVanPhong : nvToaBaos) {
            if (nvVanPhong instanceof NVVanPhong) {
                nvVanPhong.hienThi();
                System.out.println("\t-----------------------");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co nhan vien van phong nao..!");
        }
    }

    // in danh sach nha bao
    public void hienThiNhaBao() {
        int dem = 0;
        if (nvToaBaos.isEmpty()) {
            System.out.println("Toa bao khong co nhan vien nao..!");
            return;
        }
        System.out.print("\n\n---Danh sach nha bao---\n");
        for (NhanVien nhaBao : nvToaBaos) {
            if (nhaBao instanceof NhaBao) {
                nhaBao.hienThi();
                System.out.println("\t-----------------------");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co nhan vien van phong nao..!");
        }
    }

    // in danh sach nhan vien cua toa bao
    @Override
    public void hienThi() {
        if (nvToaBaos.isEmpty()) {
            System.out.println("Toa bao khong co nhan vien nao..!");
            return;
        }
        System.out.print("\n\n---Danh sach nhan vien---\n");
        for (NhanVien nv : nvToaBaos) {
            nv.hienThi();
            System.out.println("\t-----------------------");
        }
    }
}
