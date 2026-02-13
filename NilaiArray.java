import java.util.Scanner;

public class NilaiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] namaKomponen = {"Tugas", "Kuis", "UTS", "UAS"};
        double[] bobot = {0.20, 0.20, 0.30, 0.30};
        double[] nilai = new double[4];
        
        System.out.println("Program Menghitung Nilai Akhir (Array)");
        System.out.println("==============================");

        boolean valid = true;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai " + namaKomponen[i] + ": ");
            nilai[i] = sc.nextDouble();
            if (nilai[i] < 0 || nilai[i] > 100) {
                valid = false;
            }
        }

        System.out.println("==============================");

        if (!valid) {
            System.out.println("==============================\nnilai tidak valid\n==============================");
        } else {
            
            double na = 0;
            for (int i = 0; i < nilai.length; i++) {
                na += nilai[i] * bobot[i];
            }

            String huruf;
            if (na > 80)      huruf = "A";
            else if (na > 73) huruf = "B+";
            else if (na > 65) huruf = "B";
            else if (na > 60) huruf = "C+";
            else if (na > 50) huruf = "C";
            else if (na > 39) huruf = "D";
            else              huruf = "E";

            System.out.println("nilai akhir : " + na);
            System.out.println("Nilai Huruf :" + huruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println((huruf.equals("D") || huruf.equals("E")) ? "TIDAK LULUS" : "SELAMAT ANDA LULUS");
        }
    }
}
