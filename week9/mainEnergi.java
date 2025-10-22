public class mainEnergi {
    public static void main(String[] args) {
        KendaraanListrik m1 = new MobilListrik("Mobil Listrik", 80, 20, 10); 
        KendaraanListrik m2 = new MotorListrik("Motor Listrik", 30, 10, 5); 
        KendaraanListrik m3 = new MobilListrik("Mobil Listrik", 60, 45, 12); 
        KendaraanListrik m4 = new MotorListrik("Motor Listrik", 25, 20, 4); 

        System.out.println(m1.getNama() + " -> " + "waktu: " + m1.hitungWaktuPengisian() + " jam, energi: " + m1.hitungEnergiDibutuhkan() + " kWh");
        System.out.println(m2.getNama() + " -> " + "waktu: " + m2.hitungWaktuPengisian() + " jam, energi: " + m2.hitungEnergiDibutuhkan() + " kWh");
        System.out.println(m3.getNama() + " -> " + "waktu: " + m3.hitungWaktuPengisian() + " jam, energi: " + m3.hitungEnergiDibutuhkan() + " kWh");
        System.out.println(m4.getNama() + " -> " + "waktu: " + m4.hitungWaktuPengisian() + " jam, energi: " + m4.hitungEnergiDibutuhkan() + " kWh");

        double totalWaktu = m1.hitungWaktuPengisian() + m2.hitungWaktuPengisian() + m3.hitungWaktuPengisian() + m4.hitungWaktuPengisian();
        double totalEnergi = m1.hitungEnergiDibutuhkan() + m2.hitungEnergiDibutuhkan() + m3.hitungEnergiDibutuhkan() + m4.hitungEnergiDibutuhkan();

        System.out.println("\nWaktu waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}
