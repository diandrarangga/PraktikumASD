import java.util.Scanner;

public class PemilihanHitungNilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        System.out.println("==============================");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            
            System.out.println("==============================");
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            
        } else {
            
            double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.30 * uas);

            String nilaiHuruf;
            String status;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                status = "TIDAK LULUS";
            } else {
                status = "SELAMAT ANDA LULUS";
            }
            System.out.println("==============================");
            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf :" + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println(status);
        }
        
        input.close();
    }
}