
import java.util.Scanner;

public class MainModal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan modal awal: ");
        int modal = scanner.nextInt();
        
        System.out.print("Masukkan keuntungan per bulan: ");
        int keuntungan = scanner.nextInt();
        
        balikModal kalkulator = new balikModal(modal, keuntungan);

        int bulan = kalkulator.hitungBalikModal();

        System.out.println("Balik modal di bulan ke-" + bulan);

        scanner.close();
    }
}
