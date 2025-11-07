package latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Introduction to Abstraction
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep abstraction dan abstract class.
         */

        // ===== TANPA ABSTRACTION: CARA BIASA =====
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Buat beberapa object hewan dengan cara biasa
        // Masalah: Kita bisa membuat object dari class Hewan yang terlalu umum
        // Padahal di dunia nyata, tidak ada "hewan" tanpa jenis spesifik

        // UNCOMMENT kode di bawah dan perhatikan masalahnya
         HewanBiasa hewan = new HewanBiasa("Hewan Umum");
         hewan.bersuara(); // Output apa yang akan keluar?

        // ===== DENGAN ABSTRACTION: MENGGUNAKAN ABSTRACT CLASS =====
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class
        // Buat beberapa object dari subclass Hewan

        // Buat object Kucing
         Kucing kucing = new Kucing("Kitty");
         kucing.bersuara();
         kucing.makan();
         kucing.tidur();

        // Buat object Anjing
         Anjing anjing = new Anjing("Bobby");
         anjing.bersuara();
         anjing.makan();
         anjing.tidur();

        // Buat object Burung
         Burung burung = new Burung("Tweety");
         burung.bersuara();
         burung.makan();
         burung.tidur();

        // ===== DEMONSTRASI ABSTRACTION =====
        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        // Latihan 3: Polymorphic array
        // Buat array bertipe Hewan yang berisi berbagai jenis hewan
        // Iterasi array dan panggil method bersuara()

         Hewan[] hewanArray = new Hewan[3];
         hewanArray[0] = new Kucing("Kitty");
         hewanArray[1] = new Anjing("Bobby");
         hewanArray[2] = new Burung("Tweety");

         for (Hewan h : hewanArray) {
             h.bersuara();
         }

        // ===== KEUNTUNGAN ABSTRACTION =====
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
        // Tuliskan dalam komentar 5 keuntungan menggunakan abstraction
        /*
        * Menyembunyikan kompleksitas dan hanya menampilkan fitur penting
        * Fokus kepada "apa yang dilakukan" bukan "bagaimana cara dilakukan"
        * Memudahkan perubahan & perbaikan
        * Meningkatkan reusability
        * Mendukung polymorphism
        */

        /*
         * EKSPEKTASI OUTPUT:
         *
         * === DENGAN ABSTRACTION ===
         * Kitty berkata: Meong!
         * Kitty sedang makan
         * Kitty sedang tidur
         *
         * Bobby berkata: Guk Guk!
         * Bobby sedang makan
         * Bobby sedang tidur
         *
         * Tweety berkata: Cuit Cuit!
         * Tweety sedang makan
         * Tweety sedang tidur
         *
         * === DEMONSTRASI ABSTRACTION ===
         * Kitty berkata: Meong!
         * Bobby berkata: Guk Guk!
         * Tweety berkata: Cuit Cuit!
         */
    }
}
