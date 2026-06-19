public class BinarySearchTree {
    Node root;

    // Marvel: Fungsi Insert
    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec (Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key < root.data){
            root.left = insertRec(root.left, key);
        } else if (key > root.data){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Faisal: Fungsi Delete
    Node deleteNode (Node root, int key){
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        }else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }else {

            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Rizdan: Fungsi Find/search (Mencari parent & child)
    void findNode (int key){

    }

    // Rakha: Fungsi Traversal
    void preOrder (Node root){

    }

    void inOrder (Node root) {

    }

    void postOrder (Node root) {

    }
}
