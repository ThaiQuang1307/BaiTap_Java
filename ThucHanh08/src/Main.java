
/*

Player 2

 0 	 X  M  T  S  V  S  T  M  X
 1
 2	    P                 P
 3	 T     T     T     T     T
 4
 -----------------------------
 5
 6	 T     T     T     T     T
 7	    P                 P
 8
 9	 X  M  T  S  V  S  T  M  X

   	 1  2  3  4  5  6  7  8  9

Player 1
 */

import java.util.Random;

public class Main {
    static Random r = new Random();
    static BanCo bc = new BanCo();

    public static void main(String[] args) {
        Main main = new Main();
        BanCo bc = main.khoiTaoBanCo();
        main.PlayGame(bc, 5);
    }

    public BanCo khoiTaoBanCo() {
        bc.add(new Vua(5,0,1));
        bc.add(new Xe(1,0,1));
        bc.add(new Xe(9,0,1));
        bc.add(new Ma(2,0,1));
        bc.add(new Ma(8,0,1));
        bc.add(new Tuong(3,0,1));
        bc.add(new Tuong(7,0,1));
        bc.add(new Sy(4,0,1));
        bc.add(new Xe(6,0,1));
        bc.add(new Phao(2,2,1));
        bc.add(new Phao(8,2,1));
        bc.add(new Tot(1,3,1));
        bc.add(new Tot(3,3,1));
        bc.add(new Tot(5,3,1));
        bc.add(new Tot(7,3,1));
        bc.add(new Tot(9,3,1));

        bc.add(new Vua(5,9,-1));
        bc.add(new Xe(1,9,-1));
        bc.add(new Xe(9,9,-1));
        bc.add(new Ma(2,9,-1));
        bc.add(new Ma(8,9,-1));
        bc.add(new Tuong(3,9,-1));
        bc.add(new Tuong(7,9,-1));
        bc.add(new Sy(4,9,-1));
        bc.add(new Xe(6,9,-1));
        bc.add(new Phao(2,7,-1));
        bc.add(new Phao(8,7,-1));
        bc.add(new Tot(1,6,-1));
        bc.add(new Tot(3,6,-1));
        bc.add(new Tot(5,6,-1));
        bc.add(new Tot(7,6,-1));
        bc.add(new Tot(9,6,-1));

        return bc;
    }

    public void PlayGame(BanCo bc, int n) {
        int tmpX,tmpY;
        for (int i = 0;i < n; i++) {
            QuanCo tmp = bc.arr.get(r.nextInt(bc.num));

            while (tmp.z != 1 - 2*(i%2)) {
                tmp = bc.arr.get(r.nextInt(bc.num));
            }
            tmpX = r.nextInt(9)+1;
            tmpY = r.nextInt (10);

            while (!tmp.canMoveTo(tmpX, tmpY,bc)) {
                tmpX = r.nextInt(9)+1;
                tmpY = r.nextInt (10);
            }

            System.out.println(tmp.x + "," + tmp.y+" di chyen " + tmpX + "," + tmpY);
            tmp.moveTo(tmpX, tmpY, bc);
        }

    }
}
