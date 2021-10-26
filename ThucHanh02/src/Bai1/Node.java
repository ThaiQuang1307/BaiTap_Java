package Bai1;

public class Node {
    int item;
    Node next;

    public Node() {

    }

    // truyen Node
    public Node(int item) {
        this.item = item;
    }

    //hien thi Node
    public void display() {
        System.out.println(this.item);
    }
}
