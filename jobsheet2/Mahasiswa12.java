package jobsheet2;

public class Mahasiswa12 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkaninformasi ()  {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);

    }
    
    void ubahkelas(String kelasBaru) {
        kelas=kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        ipk=ipkBaru;
    }
    
    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 2.0){
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }


    }


