
import java.util.Scanner;

public class MainKalkulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        Kalkulator kalkulator = new Kalkulator(a, b);

        kalkulator.process();

        scanner.close();
    }
}
