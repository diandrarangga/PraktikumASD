import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dosen12[] arrayOfDosen = new Dosen12[3];
        String kode, nama, dummy, jkInput;
        boolean jk;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            jkInput = sc.nextLine();
            
            jk = jkInput.equalsIgnoreCase("L"); 
            
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen12(kode, nama, jk, usia);
        }

        System.out.println("\n======= DAFTAR DOSEN (FOREACH) =======");
        
        for (Dosen12 dsn : arrayOfDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);

            String gender = dsn.jenisKelamin ? "Laki-Laki" : "Perempuan";
            System.out.println("Jenis Kelamin : " + gender);
            
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("------------------------------");
        }

        sc.close();
    }
}