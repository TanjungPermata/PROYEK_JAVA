import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistem Penjualan Komponen PC");

        VBox layout = new VBox();
        layout.setSpacing(10);

        // Pilihan jenis pelanggan
        Label label = new Label("Pilih jenis pelanggan:");
        Button btnReguler = new Button("Pelanggan Reguler");
        Button btnAnggota = new Button("Pelanggan Anggota");

        btnReguler.setOnAction(e -> showKomponenList());
        btnAnggota.setOnAction(e -> showAnggotaForm());

        layout.getChildren().addAll(label, btnReguler, btnAnggota);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showKomponenList() {
        // Logika untuk menampilkan daftar komponen
        System.out.println("Daftar Komponen untuk Pelanggan Reguler.");
    }

    private void showAnggotaForm() {
        Stage anggotaStage = new Stage();
        anggotaStage.setTitle("Pendaftaran Pelanggan Anggota");

        VBox layout = new VBox();
        layout.setSpacing(10);

        Label nameLabel = new Label("Nama Lengkap:");
        TextField nameField = new TextField();
        Label ktpLabel = new Label("Nomor KTP:");
        TextField ktpField = new TextField();
        Button registerBtn = new Button("Daftar");

        registerBtn.setOnAction(e -> {
            String nama = nameField.getText();
            String nomorKTP = ktpField.getText();
            if (!nama.isEmpty() && !nomorKTP.isEmpty()) {
                System.out.println("Pendaftaran berhasil. Nama: " + nama + ", Nomor KTP: " + nomorKTP);
                anggotaStage.close();
                showKomponenList();
            } else {
                System.out.println("Mohon lengkapi semua data.");
            }
        });

        layout.getChildren().addAll(nameLabel, nameField, ktpLabel, ktpField, registerBtn);

        Scene scene = new Scene(layout, 300, 200);
        anggotaStage.setScene(scene);
        anggotaStage.show();
    }
}
