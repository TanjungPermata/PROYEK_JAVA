import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komponen> daftarKomponen = new ArrayList<>();
        daftarKomponen.add(new Prosesor("Intel Core i7", 3200000, "Prosesor 8-core dengan kecepatan tinggi", 10));
        daftarKomponen.add(new RAM("Corsair 16GB DDR4", 1200000, "RAM DDR4", 20));
        daftarKomponen.add(new VGA("NVIDIA RTX 2080", 3150000, "Kartu grafis high-end", 5));
        daftarKomponen.add(new PowerSupply("Corsair 750W", 1800000, "Power supply dengan rating efisiensi tinggi", 7));

        Scanner scanner = new Scanner(System.in);
        System.out.println("€€ª   €€ª €€ª   €€ª €€€ª   €€ª €€ª €€ª  €€ª    €€€€€€€ª €€€€€€€€ª  €€€€€€ª  €€€€€€ª  €€€€€€€ª");
        System.out.println("€€∫   €€∫ »€€ª €€…º €€€€ª  €€∫ €€∫ »€€ª€€…º    €€…ÕÕÕÕº »ÕÕ€€…ÕÕº €€…ÕÕÕ€€ª €€…ÕÕ€€ª €€…ÕÕÕÕº");
        System.out.println("€€∫   €€∫  »€€€€…º  €€…€€ª €€∫ €€∫  »€€€…º     €€€€€€€ª    €€∫    €€∫   €€∫ €€€€€€…º €€€€€ª  ");
        System.out.println("»€€ª €€…º   »€€…º   €€∫»€€ª€€∫ €€∫  €€…€€ª     »ÕÕÕÕ€€∫    €€∫    €€∫   €€∫ €€…ÕÕ€€ª €€…ÕÕº  ");
        System.out.println(" »€€€€…º     €€∫    €€∫ »€€€€∫ €€∫ €€…º €€ª    €€€€€€€∫    €€∫    »€€€€€€…º €€∫  €€∫ €€€€€€€ª");
        System.out.println("  »ÕÕÕº      »Õº    »Õº  »ÕÕÕº »Õº »Õº  »Õº    »ÕÕÕÕÕÕº    »Õº     »ÕÕÕÕÕº  »Õº  »Õº »ÕÕÕÕÕÕº");
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("                 Pilihan Pelanggan                 ");
        System.out.println("===================================================");
        System.out.println("              [1]. Pelanggan Reguler               ");
        System.out.println("              [2]. Pelanggan Anggota               ");
        System.out.println("===================================================");
        System.out.print("Pilih Jenis Pelanggan : ");
        int jenisPelanggan = scanner.nextInt();
        scanner.nextLine(); 

        Pelanggan pelanggan;
        if (jenisPelanggan == 1) {
            System.out.println("Anda Masuk Sebagai Pelanggan Reguler");
            System.out.println("Mendapatkan Diskon = 5%");
            pelanggan = new PelangganReguler("Pelanggan Reguler", 5);
        } else {
            System.out.print("Masukkan Nama Lengkap: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Nomor KTP: ");
            String nomorKTP = scanner.nextLine();
            pelanggan = new PelangganAnggota(nama, 10, nomorKTP);
            System.out.println("Pendaftaran Sebagai Pelanggan Anggota berhasil.");
            System.out.println("Mendapatkan Diskon = 10%");
            System.out.println("Nomor Keanggotaan: " + ((PelangganAnggota) pelanggan).getNomorKTP());
        }

        String pilihan;
        
        do {
            System.out.println("===================================================");
            System.out.println("           Daftar Komponen Yang Tersedia           ");
            System.out.println("===================================================");
            for (int i = 0; i < daftarKomponen.size(); i++) {
                Komponen komponen = daftarKomponen.get(i);
                System.out.println((i + 1) + ". " + komponen.getNama() + " \nDeskripsi : " + komponen.getDeskripsi() + " \nHarga : Rp. " + komponen.getHarga() + " \nStok : " + komponen.getStok());
            }
            System.out.println("===================================================");

            System.out.print("Pilih Komponen Yang Ingin Dibeli : ");
            int pilihanKomponen = scanner.nextInt() - 1;
            
            if (pilihanKomponen >= 0 && pilihanKomponen < daftarKomponen.size()) {
                Komponen komponenTerpilih = daftarKomponen.get(pilihanKomponen);
                double hargaSetelahDiskon = komponenTerpilih.getHarga() * (1 - pelanggan.getDiskon() / 100);
                System.out.println("Anda Telah Memilih Untuk Membeli: " + komponenTerpilih.getNama());
                System.out.println("Harga Asli: Rp " + komponenTerpilih.getHarga());
                System.out.println("Harga Setelah Diskon: Rp " + hargaSetelahDiskon);
                
                if (komponenTerpilih.getStok() > 0) {
                    komponenTerpilih.setStok(komponenTerpilih.getStok() - 1);
                    System.out.println("Pembelian Berhasil!");
                    System.out.println("Sisa stok " + komponenTerpilih.getNama() + ": " + komponenTerpilih.getStok());
                } else {
                    System.out.println("Maaf, Stok " + komponenTerpilih.getNama() + " habis.");
                }

                System.out.println("===================================================");
                System.out.println("                 Pilihan Pembayaran                ");
                System.out.println("===================================================");
                System.out.println("                 [1]. Kartu Kredit                 ");
                System.out.println("                 [2]. Cash                         ");
                System.out.println("===================================================");
                System.out.print("Pilih Metode Pembayaran : ");
                int metodePembayaran = scanner.nextInt();
                scanner.nextLine(); 

                Pembayaran pembayaran;
                if (metodePembayaran == 1) {
                    pembayaran = new PembayaranKartuKredit();
                } else {
                    pembayaran = new PembayaranCash();
                }
                pembayaran.prosesPembayaran();
            } else {
                System.out.println("Pilihan Tidak Valid.");
            }

            System.out.print("Apakah Anda Ingin Membeli Komponen Lagi? (Y/N): ");
            pilihan = scanner.next();
        } while (pilihan.equalsIgnoreCase("Y"));

        System.out.println("Terima Kasih Telah Berbelanja. Program selesai.");
    }
}
