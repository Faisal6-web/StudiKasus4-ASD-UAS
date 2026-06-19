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
