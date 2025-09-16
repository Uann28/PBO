
import java.util.Scanner;

public class MainCalc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculate kalkulator = new Calculate();

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        kalkulator.pilihanOperasi();
        System.out.print("Pilih operasi (1-5): ");
        int pilihan = scanner.nextInt();

        kalkulator.operasi(pilihan, a, b);

        scanner.close();
    }
}
