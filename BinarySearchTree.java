public class BinarySearchTree {
    Node root;

    // Marvel: Fungsi Insert
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Faisal: Fungsi Delete
    Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
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
    void findNode(int key) {
        Node parent = null;
        Node current = root;

        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Angka " + key + " tidak ditemukan dalam tree.");
            return;
        }

        System.out.println("Angka ditemukan: " + current.data);

        if (parent == null) {
            System.out.println("Parent: tidak ada (ini adalah root)");
        } else {
            System.out.println("Parent: " + parent.data);
        }

        if (current.left == null && current.right == null) {
            System.out.println("Child: tidak ada (ini adalah leaf node)");
        } else {
            if (current.left != null) {
                System.out.println("Child Kiri: " + current.left.data);
            } else {
                System.out.println("Child Kiri: tidak ada");
            }

            if (current.right != null) {
                System.out.println("Child Kanan: " + current.right.data);
            } else {
                System.out.println("Child Kanan: tidak ada");
            }
        }
    }

    // Rakha: Fungsi Traversal
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
