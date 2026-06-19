// Zahra: Merakit kode
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Anggota 4 memasukkan urutan angka uji coba: 50, 30, 70, 20, 40, 60, 80
        tree.insert(50);
        tree.insert(30);
        // ... dan seterusnya

        // Menguji fungsi traversal
        System.out.print("Inorder: ");
        tree.inOrder(tree.root);
        // Pre order dan post order

        // Menguji fungsi find and delete
        tree.findNode(30);

    }
}