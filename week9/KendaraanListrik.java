abstract class KendaraanListrik implements KonsumsiEnergi {
    String nama;
    double kapasitasBaterai, dayaSaatIni, kecepatanPengisian;

    public KendaraanListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.nama = nama;
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    String getNama(){
        return nama;
    }

    abstract double hitungWaktuPengisian();

    @Override
    public double hitungEnergiDibutuhkan() {
        return 0;
    }

    
    
}
