public class MobilListrik extends KendaraanListrik{

    public MobilListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    double hitungWaktuPengisian() {
        double waktuPengisian = ((kapasitasBaterai - dayaSaatIni) / kecepatanPengisian); 
        return waktuPengisian * 1.1;
    }

    @Override
    public double hitungEnergiDibutuhkan() {
        double energiDiubutuhkan = kapasitasBaterai - dayaSaatIni;
        return energiDiubutuhkan;
    }
    
}
