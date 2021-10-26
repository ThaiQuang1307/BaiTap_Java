public class Main {
    public static void main(String[] args) {

        LinkedList fx = new LinkedList();
        fx.add(new HangTu(5, 10d));
        fx.add(new HangTu(4, 9d));
        fx.add(new HangTu(1, 8d));
        fx.add(new HangTu(2, 7d));
        System.out.println(" - Da thuc: ");
        System.out.print("\tF(x) = ");
        fx.travel();

        // nhan hang tu
        fx.multiplicationNode(new HangTu(1, 1d));
        System.out.println(" - Da thuc: ");
        System.out.print("\tF(x) = ");
        fx.travel();

        LinkedList ax = new LinkedList();
        ax.add(new HangTu(3,1d));
        ax.add(new HangTu(1, 1d));
        System.out.println(" - Da thuc: ");
        System.out.print("\tA(x) = ");
        ax.travel();

        // trộn 2 da thuc
        LinkedList Sum = new LinkedList();
        Sum.firstNode = meger(fx.firstNode, ax.firstNode);
        System.out.println(" - Tron 2 da thuc: ");
        System.out.print("\tSum(x) = ");
        Sum.travel();

        // tong 2 da thuc
        Sum(Sum);
        System.out.println(" - Da thuc: ");
        System.out.print("\tSum(x) = ");
        Sum.travel();


        // gia tri da thuc voi X cho truoc
        System.out.println("Sum(" + 2 + ") = " + Sum.valueList(2d));
    }

    // ham tron 2 da thuc
    public static Node meger(Node a, Node b) {
        if (a == null  && b == null){
            return null;
        }else if (a != null && b == null){
            return a;
        }else if (a == null && b != null){
            return b;
        }

        Node Sum = new Node();
        if (a.hangTu.getSoMu() > b.hangTu.getSoMu()){
            Sum = a;
            Sum.next = meger(a.next, b);
        }else {
            Sum = b;
            Sum.next = meger(a, b.next);
        }
        return Sum;
    }


    // ket qua cong 2 da thuc
    public static void Sum(LinkedList sum){
        Node node = sum.firstNode;
        if (node == null && node.next == null) return;
        while (node.next != null){
            if (node.hangTu.getSoMu() == node.next.hangTu.getSoMu()){
                node.hangTu.setHeSo(node.hangTu.getHeSo() + node.next.hangTu.getHeSo());
                node.next = node.next.next;
            }
            node = node.next;
        }
    }
}
