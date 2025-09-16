
public class Calculate {
    
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagi tidak boleh 0");
            return 0;
        }
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Modulus tidak boleh 0");
            return 0;
        }
        return a % b;
    }

    public void pilihanOperasi() {
        System.out.println("Menu Operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Modulus (%)");
    }

    public void operasi(int pilihan, int a, int b) {
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Penjumlahan: " + tambah(a, b));
                break;
            case 2:
                System.out.println("Hasil Pengurangan: " + kurang(a, b));
                break;
            case 3:
                System.out.println("Hasil Perkalian: " + kali(a, b));
                break;
            case 4:
                System.out.println("Hasil Pembagian: " + bagi(a, b));
                break;
            case 5:
                System.out.println("Hasil Modulus: " + modulus(a, b));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

}
