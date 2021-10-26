public class HangTu {
    private int soMu;
    private Double heSo;

    public HangTu() {
    }

    public HangTu(int soMu, Double heSo) {
        this.soMu = soMu;
        this.heSo = heSo;
    }

    public int getSoMu() {
        return soMu;
    }

    public void setSoMu(int soMu) {
        this.soMu = soMu;
    }

    public Double getHeSo() {
        return heSo;
    }

    public void setHeSo(Double heSo) {
        this.heSo = heSo;
    }

    public void diplay() {
        if (getSoMu() == 0){
            System.out.print(getHeSo() + "" );
        }else if (getSoMu() == 1){
            System.out.print(getHeSo() + ".x");
        }else {
            System.out.print(getHeSo() + ".x^" + getSoMu());
        }
    }
}
