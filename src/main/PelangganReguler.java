public class PelangganReguler extends Pelanggan {
    private double diskon;

    public PelangganReguler(String nama, double diskon) {
        super(nama);
        this.diskon = diskon;
    }

    @Override
    public double getDiskon() {
        return diskon;
    }
}
