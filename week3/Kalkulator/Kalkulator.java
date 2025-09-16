
public class Kalkulator {
    int a;
    int b;

    public Kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int tambah() {
        return a + b;
    }

    public int kurang() {
        return a - b;
    }

    public int kali() {
        return a * b;
    }

    public double bagi() {
        if (b == 0) {
            System.out.println("Pembagi tidak boleh 0");
            return 0;
        }
        return (double) a / b;
    }

    public int modulus() {
        if (b == 0) {
            System.out.println("Modulus tidak boleh 0");
            return 0;
        }
        return a % b;
    }

    public void process() {
        System.out.println("Hasil Penjumlahan : " + tambah());
        System.out.println("Hasil Pengurangan : " + kurang());
        System.out.println("Hasil Perkalian : " + kali());
        System.out.println("Hasil Pembagian : " + bagi());
        System.out.println("Hasil Modulus : " + modulus());
    }
}
