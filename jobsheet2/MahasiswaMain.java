package jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args) {
        
    Mahasiswa12 mhs1 = new Mahasiswa12 () ;
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "S1 2J";
    mhs1.ipk = 3.55;

    mhs1.tampilkaninformasi ();
    mhs1.ubahkelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkaninformasi ();

    Mahasiswa12 mhs2 = new Mahasiswa12 (" Anissa Nabila ","2141720160", 3.25, "TI 2L");
    mhs2.updateIpk(3.30);
    mhs2.tampilkaninformasi ();

    }
}
