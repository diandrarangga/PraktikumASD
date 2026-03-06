public class Main {
    public static void main(String[] args) {
    
        Produk12[] daftarProduk12 = new Produk12[4];

        daftarProduk12[0] = new Produk12("Beras", 75000, 23, 5);
        daftarProduk12[1] = new Produk12("Gula", 17500, 58, 5);
        daftarProduk12[2] = new Produk12("Roti", 22000, 26, 2);
        daftarProduk12[3] = new Produk12("Susu", 12000, 64, 3);

        System.out.println("=== DATA PRODUK TOKO 12 ===");
        for (Produk12 item12 : daftarProduk12) {
            item12.tampilkanInformasi12();
        }
    }
}