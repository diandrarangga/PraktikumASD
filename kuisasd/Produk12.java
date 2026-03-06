public class Produk12 {
    
    String nama12;
    double harga12;
    int stok12;
    double diskon12;

    public Produk12(String nama12, double harga12, int stok12, double diskon12) {
        this.nama12 = nama12;
        this.harga12 = harga12;
        this.stok12 = stok12;
        this.diskon12 = diskon12;
    }

    public double hitungHargaDiskon12() {
        return harga12 - (harga12 * diskon12 / 100);
    }

    public void tampilkanInformasi12() {
        System.out.println("Nama Produk  : " + nama12);
        System.out.println("Harga Awal   : Rp" + harga12);
        System.out.println("Stok         : " + stok12);
        System.out.println("Diskon       : " + diskon12 + "%");
        System.out.println("Harga Diskon : Rp" + hitungHargaDiskon12());
        System.out.println("-----------------------------------");
    }
}

