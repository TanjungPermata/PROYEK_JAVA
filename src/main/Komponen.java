public class Komponen {
    private String nama;
    private int harga;
    private String deskripsi;
    private int stok;

    public Komponen(String nama, int harga, String deskripsi, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
