public class MahasiswaBerprestasi12 {
    Mahasiswa12[] listMhs = new Mahasiswa12[5];
    int idx;

    
    void tambah(Mahasiswa12 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    
    void tampil() {
        for (Mahasiswa12 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------");
            }
        }
    }

    
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // Proses Swap (Pertukaran)
                    Mahasiswa12 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Swap elemen terkecil ke posisi i
            Mahasiswa12 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}