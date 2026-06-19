// Zahra: Merakit kode 

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("=== 1. Memasukkan Data ke BST  ===");
        // Menggunakan array agar kode bersih, efisien, dan tidak bertele-tele
        int[] dataUji = {50, 30, 70, 20, 40, 60, 80};
        for (int nilai : dataUji) {
            tree.insert(nilai);
        }
        System.out.println("Data 50, 30, 70, 20, 40, 60, 80 berhasil dimasukkan.\n");

        System.out.println("=== 2. Mencetak Traversal  ===");
        System.out.print("Preorder  : ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("Inorder   : ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.print("Postorder : ");
        tree.postOrder(tree.root);
        System.out.println("\n");

        System.out.println("=== 3. Mencetak Child dan Parent  ===");
        System.out.println("-- Mengecek Node 30 --");
        tree.findNode(30);
        System.out.println();

        System.out.println("=== 4. Menambahkan dan Mengurangi Node  ===");
        // Menguji penambahan node baru
        System.out.println("Menambahkan node 45...");
        tree.insert(45);
        System.out.print("Pembuktian Inorder baru: ");
        tree.inOrder(tree.root);
        System.out.println("\n");

        // Menguji pengurangan node menggunakan fungsi dari Faisal
        System.out.println("Menghapus node 40...");
        // KRITIS: Wajib menampung return ke tree.root agar struktur tree tidak terputus
        tree.root = tree.deleteNode(tree.root, 40); 
        
        System.out.print("Pembuktian Inorder setelah 40 dihapus: ");
        tree.inOrder(tree.root);
        System.out.println();
    }
}