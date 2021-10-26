public class CayNhiPhan {
    Node root;

    public void duyetCay(Node root, int i) {
        if (root == null) {
            return;
        }
        // InOrder: trung to
        if (i == 1) {
            duyetCay(root.left, i);
            if (root.operation == ""){
                System.out.print(root.value + " ");
            }else {
                System.out.print(root.operation + " ");
            }
            duyetCay(root.right, i);
        }
        // PreOrder: tien to
        else if (i == 2) {
            if (root.operation == ""){
                System.out.print(root.value + " ");
            }else {
                System.out.print(root.operation + " ");
            }
            duyetCay(root.left, i);
            duyetCay(root.right, i);
        }
        // PostOrder: hau to
        else if (i == 3) {
            duyetCay(root.left, i);
            duyetCay(root.right, i);
            if (root.operation == ""){
                System.out.print(root.value + " ");
            }else {
                System.out.print(root.operation + " ");
            }
        }
    }

    // gia tri cua cay
    public Double giaTriCay(Node node){
        Double giaTri = 0d;
        if (node.operation == ""){
            giaTri = node.value;
        }else {
            double x = giaTriCay(node.left);
            double y = giaTriCay(node.right);
            switch (node.operation){
                case "+": giaTri = x + y;   break;
                case "-": giaTri = x - y;   break;
                case "*": giaTri = x * y;   break;
                case "/": giaTri = x % y;   break;
            }
        }
        return giaTri;
    }
}

