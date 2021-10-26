package Bai1;

public class Stack {
    Node top;
    int size;

    public Stack() {
        top = null;
        size = 0;
    }

    // Empty
    public boolean isEmpty() {
        return (top == null) ? true : false;
    }

    // push phan tu vao
    public void push(int item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = top;
        top = newNode;
        size++;
    }

    //pop phan tu ra
    public void pop(Node newNode) {
        if (isEmpty()) {
            System.out.println("Stack rong..!");
            return;
        }
        newNode = top;
        top = newNode.next;
        size--;
    }

    // tra ve so phan tu hien co
    public int numOfElement() {
        int Count = 0;
        Node countNode = top;
        while (countNode != null) {
            Count++;
            countNode = countNode.next;
        }
        return Count;
    }

    // hien thi Stack
    public void display() {
        if (top == null) {
            System.out.println("Stack rong, khong the in..!");
            return;
        }
        System.out.println("Stack hien tai: ");
        Node printNode = top;
        while (printNode != null) {
            printNode.display();
            printNode = printNode.next;
        }
    }
}
