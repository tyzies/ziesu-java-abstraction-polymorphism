package latihan2;

// Implementasikan class TransferBank implements Pembayaran
public class TransferBank implements Pembayaran {
     private String nomorRekening;

    // Constructor dan implement methods
    public TransferBank(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Bank Transfer Payment: Rp" + jumlah);
        System.out.println("Payment successful via Bank Transfer");
    }

    @Override
    public String getMetodePembayaran() {
        return "Transfer Bank";
    }
}
