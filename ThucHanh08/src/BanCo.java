import java.util.ArrayList;
import java.util.List;

public class BanCo {
    int num;
    List<QuanCo> arr;

    public BanCo() {
        arr = new ArrayList<>();
        num =0;
    }

    public boolean canAdd(QuanCo q) {
        return true;
    }

    public void add(QuanCo q) {
           arr.add(q);
           num++;
    }

    public void delete(QuanCo q) {
           arr.remove(q);
    }
}
