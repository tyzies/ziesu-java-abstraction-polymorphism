package latihan3;

// Implementasikan class Segitiga extends Bentuk
public class Segitiga extends Bentuk {
     private double alas, tinggi;

    // Constructor
    // Assume segitiga siku-siku untuk hitung keliling
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Override hitungLuas() - return 0.5 * alas * tinggi
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Override hitungKeliling()
    // Hitung sisi miring menggunakan pythagoras: Math.sqrt(alas*alas + tinggi*tinggi)
    @Override
    public double hitungKeliling() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }

    // Override tampilkanInfo()

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + super.nama);
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " +  String.format("%.2f", hitungKeliling()));
    }
}
