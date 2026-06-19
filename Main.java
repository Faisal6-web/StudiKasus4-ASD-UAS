// Zahra: Merakit kode eksekusi utama
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("=== 1. Memasukkan Data ke BST (Fungsi Marvel) ===");
        int[] dataUji = {50, 30, 70, 20, 40, 60, 80};
        for (int nilai : dataUji) {
            tree.insert(nilai);
        }
        System.out.println("Data 50, 30, 70, 20, 40, 60, 80 berhasil dimasukkan.\n");

        System.out.println("=== 2. Mencetak Traversal (Fungsi Rakha) ===");
        System.out.print("Preorder  : ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("Inorder   : ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.print("Postorder : ");
        tree.postOrder(tree.root);
        System.out.println("\n");

        System.out.println("=== 3. Mencetak Child dan Parent (Fungsi Rizdan) ===");
        System.out.println("-- Mengecek Node 30 --");
        tree.findNode(30);
        System.out.println();

        System.out.println("=== 4. Menambahkan dan Mengurangi Node (Fungsi Tambahan) ===");
        System.out.println("Menambahkan node 45...");
        tree.insert(45);
        System.out.print("Pembuktian Inorder baru: ");
        tree.inOrder(tree.root);
        System.out.println("\n");

        System.out.println("Menghapus node 40...");
        // Pembaruan: Panggil fungsi deleteKey baru dari Faisal, tidak perlu lagi ditampung di tree.root
        tree.deleteKey(40); 
        
        System.out.print("Pembuktian Inorder setelah 40 dihapus: ");
        tree.inOrder(tree.root);
        System.out.println();
    }
}