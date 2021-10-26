public class LinkedList {
    int level;
    Node firstNode;
    Node lastNode;

    public LinkedList() {
        level = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public LinkedList(HangTu hangTu) {
        Node node = new Node();
        this.firstNode = node;
        this.lastNode = node;
        this.level = hangTu.getSoMu();
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    // chen hang tu(Node) vào dau da thuc
    public void addFirst(HangTu hangTu) {
        Node node = new Node(hangTu);
        if (isEmpty()) {
            firstNode = lastNode = node;
            return;
        }
        node.next = firstNode;
        firstNode = node;
    }

    // cong hang tu(Node) vao da thuc Fx
    public void add(HangTu newHangTu) {
        // hang tu moi
        Node newNode = new Node(newHangTu);
        if (isEmpty() || firstNode.hangTu.getSoMu() < newHangTu.getSoMu()) {
            addFirst(newHangTu);
            this.level = firstNode.hangTu.getSoMu();
            return;
        }

        // duyet da thuc, kiểm tra bậc của hạng tử có trong Fx ko?
        Node node = firstNode;
        while (node.next != null && node.next.hangTu.getSoMu() >= newHangTu.getSoMu()) {
            node = node.next;
        }
        // cộng hệ số trùng bậc
        if (node.hangTu.getSoMu() == newHangTu.getSoMu()) {
            node.hangTu.setHeSo(node.hangTu.getHeSo() + newHangTu.getHeSo());
        } else {
            // them vao sau vi tri tim duoc
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    // nhan hang tu(Node) vao da thuc Fx
    public void multiplicationNode(HangTu newHangTu) {
        // hang tu moi
        Node newNode = new Node(newHangTu);
        if (isEmpty() || newHangTu.getHeSo() == 0) {
            return;
        }

        Node node = firstNode;
        while (node != null){
            node.hangTu.setSoMu(node.hangTu.getSoMu() + newHangTu.getSoMu());
            node.hangTu.setHeSo(node.hangTu.getHeSo() * newHangTu.getHeSo());
            node = node.next;
        }
        this.level = firstNode.hangTu.getSoMu();
    }

    // duyet Fx
    public void travel() {

        if (isEmpty()) {
            System.out.println("0");
            return;
        }
        Node node = new Node();
        node = firstNode;
        while (node != null) {
            node.displayNode();
            if (node.next != null) {
                System.out.print(" + ");
            }
            node = node.next;
        }
        System.out.println("\n\tBac cua da thuc: " + level);
    }

    // tinh da thuc voi X cho truoc
    public Double valueList(Double x){
        Node node = firstNode;
        Double valueSumList = 0d;
        while (node != null){
            valueSumList += node.hangTu.getHeSo() * Math.pow(x, node.hangTu.getSoMu());
            node = node.next;
        }
        return valueSumList;
    }
}
