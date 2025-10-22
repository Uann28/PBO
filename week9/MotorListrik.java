public class MotorListrik extends KendaraanListrik {

    public MotorListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    @Override
    double hitungWaktuPengisian() {
        double waktuPengisian = ((kapasitasBaterai - dayaSaatIni) / kecepatanPengisian); 
        return waktuPengisian * 1.05;
    }

    @Override
    public double hitungEnergiDibutuhkan() {
        double energiDiubutuhkan = kapasitasBaterai - dayaSaatIni;
        return energiDiubutuhkan;
    }
}
