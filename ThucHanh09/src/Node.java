public class Node {
    HangTu hangTu;
    Node next;

    public Node() {
    }

    public Node(HangTu hangTu) {
        this.hangTu = hangTu;
        this.next = null;
    }

    public Node(HangTu hangTu, Node first) {
        this.hangTu = hangTu;
        this.next = first;
    }

    public void displayNode(){
        hangTu.diplay();
    }
}
