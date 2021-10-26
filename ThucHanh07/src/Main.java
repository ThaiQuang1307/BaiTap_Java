import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static CayNhiPhan cay = new CayNhiPhan();
    static boolean exit = true;

    public static void main(String[] args) {

        // (a+b)*c - d/e
        // (3+1)*4 - 3/4

        cay.root = new Node(0d, "-");
        Node node1 = new Node(0d, "*");
        Node node2 = new Node(0d, "/");
        cay.root.left = node1;
        cay.root.right = node2;

        // cay con cua node1
        Node node3 = new Node(0d, "+");
        Node node4 = new Node(4d, "");
        node1.left = node3;
        node1.right = node4;

        // cay con cua node2
        node2.left = new Node(3d, "");
        node2.right = new Node(4d, "");

        // cay con cua node 3
        node3.left = new Node(3d, "");
        node3.right = new Node(1d, "");

        while (exit){
            menu();
            System.out.println();
        }

        // gia tri cua cay
        System.out.println("");
        System.out.println("Gia tri cua cay: ");
        System.out.println(cay.giaTriCay(cay.root));
    }

    static void menu(){
        System.out.println("----------------------------");
        System.out.println("1.Trung to");
        System.out.println("2.Tien to");
        System.out.println("3.Hau to");
        System.out.println("4.Thoat!");
        System.out.println("Nhap lua chon duyet cay nhi phan: ");
        int luaChon = sc.nextInt();
        switch (luaChon){
            case 1:{
                System.out.printf("Duyet cay theo trung to: \n\t");
                cay.duyetCay(cay.root, 1);
                break;
            }
            case 2:{
                System.out.printf("Duyet cay theo trung to: \n\t");
                cay.duyetCay(cay.root, 2);
                break;
            }
            case 3:{
                System.out.printf("Duyet cay theo trung to: \n\t");
                cay.duyetCay(cay.root, 3);
                break;
            }
            case 4:
                exit = false;

            default:
                break;
        }
    }
}

