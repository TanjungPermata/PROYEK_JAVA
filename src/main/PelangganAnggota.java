public class PelangganAnggota extends Pelanggan {
    private double diskon;
    private String nomorKTP;

    public PelangganAnggota(String nama, double diskon, String nomorKTP) {
        super(nama);
        this.diskon = diskon;
        this.nomorKTP = nomorKTP;
    }

    @Override
    public double getDiskon() {
        return diskon;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }
}
