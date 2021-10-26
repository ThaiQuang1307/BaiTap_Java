package Bai1;

import java.util.Scanner;

public class TestStack {
    static Scanner sc = new Scanner(System.in);
    static boolean exit = true;

    static Stack stacks = new Stack();

    public static void main(String[] args) {
        while (exit) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("--------------------------");
        System.out.println("1.Them phan tu Stack");
        System.out.println("2.Lay phan tu Stack");
        System.out.println("3.Kiem tra rong");
        System.out.println("4.So phan tu cua Stack");
        System.out.println("5.Hien thi Stack");
        System.out.println("6.Thoat!");
        System.out.println("Nhap lua chon: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1: {
                System.out.println("Nhap so luong phan tu nhap vao: ");
                int slItem = sc.nextInt();
                for (int i = 0; i < slItem; i++) {
                    System.out.println("Nhap phan tu " + i + " :");
                    int temp = sc.nextInt();
                    stacks.push(temp);
                }
                break;
            }
            case 2: {
                System.out.println("Nhap so luong phan tu can lay: ");
                int slItem = sc.nextInt();
                for (int i = 0; i < slItem; i++) {
                    Node tempNode = new Node();
                    stacks.pop(tempNode);
                }
            }
            case 3: {
                if (stacks.isEmpty()) {
                    System.out.println("Stack rong..!");
                } else {
                    System.out.println("Danh sach hien co " + stacks.numOfElement() + " phan tu.");
                }
                break;
            }
            case 4: {
                System.out.println("Danh sach hien co " + stacks.numOfElement() + " phan tu.");
                break;
            }
            case 5: {
                stacks.display();
                break;
            }
            case 6: {
                exit = false;
            }

        }

    }
}
