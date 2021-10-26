public class Node {
    Double value;
    String operation;
    Node left;
    Node right;

    public Node(){
        left = null;
        right = null;
    }

    public Node(Double value, String operation){
        this.value = value;
        this.operation = operation;
        this.left = null;
        this.right = null;
    }

    public Node(Double value, String operater, Node left, Node right){
        this.value = value;
        this.operation = operater;
        this.left = left;
        this.right = right;
    }

    // gia tri cua Node
//    public int valueNode(Node node){
//        if (node.operater == ""){
//            return node.value;
//        }else {
//            if (node.operater == "+"){
//                return node.left.
//            }
//        }
//    }
}

