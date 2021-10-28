package Bai2;

public class FileMain {
    public static void main(String[] args) {
        /*
        f0 -> f1, f2, f3, f4
              f1 -> f5
              f2 -> f6
        */

        // thu muc goc co 2 muc con la f1, f2, 1 file van ban f3 va 1 file chay duoc f4
        FileComposite f0 = new FileComposite("Thu muc goc");
        FileComposite f1 = new FileComposite("Thu muc 1");
        FileComposite f2 = new FileComposite("Thu muc 2");

        FielText f3 = new FielText("File 3", "Day la file text.");
        FileRun f4 = new FileRun("File 4", 1, 2);

        f0.add(f1);
        f0.add(f2);
        f0.add(f3);
        f0.add(f4);

        // thu muc 1 co file text f5
        FielText f5 = new FielText("File 5", "Day la file text.");
        f0.add(f5);

        // thu muc 2 co file chay duoc f6
        FileRun f6 = new FileRun("File 6", 3, 4);
        f0.add(f6);

        System.out.println("---Duyet cay thu muc---");
        f0.open();

    }
}
