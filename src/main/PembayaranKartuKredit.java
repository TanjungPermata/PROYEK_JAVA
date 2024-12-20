import java.util.Scanner;

public class PembayaranKartuKredit extends Pembayaran {
    @Override
    public void prosesPembayaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("          Pilihan Pembayaran Kartu Kredit          ");
        System.out.println("===================================================");
        System.out.println("              [1]. Kartu Kredit BCA                ");
        System.out.println("              [2]. Kartu Kredit BSI                ");
        System.out.println("              [3]. Kartu Kredit BNI                ");
        System.out.println("              [4]. Kartu Kredit BRI                ");
        System.out.println("              [5]. Kartu Kredit Mandiri            ");
        System.out.println("===================================================");
        System.out.print("Pilih Kartu Kredit : ");
        
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Anda Berhasil Membayar Menggunakan Kartu Kredit BCA.");
                break;
            case 2:
                System.out.println("Anda Berhasil Membayar Menggunakan Kartu Kredit BSI.");
                break;
            case 3:
                System.out.println("Anda Berhasil Membayar Menggunakan Kartu Kredit BNI.");
                break;
            case 4:
                System.out.println("Anda Berhasil Membayar Menggunakan Kartu Kredit BRI.");
                break;
            case 5:
                System.out.println("Anda Berhasil Membayar Menggunakan Kartu Kredit Mandiri.");
                break;
            default:
                System.out.println("Pilihan Tidak Valid! Silakan Coba Lagi.");
        }
    }
}
