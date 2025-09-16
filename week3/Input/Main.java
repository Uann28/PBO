import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan biodata diri anda: ");
        
        System.out.print("Nama Lengkap: ");
        String nama = scanner.nextLine();
        
        System.out.print("Nama Panggilan: ");
        String namaPanggilan = scanner.nextLine();
        
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine();

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Hobi: ");
        String hobi = scanner.nextLine();
        
        System.out.println("\nBiodata Diri Anda:");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Nama Panggilan: " + namaPanggilan);
        System.out.println("Umur: " + umur);
        System.out.println("NIM: " + nim);
        System.out.println("Hobi: " + hobi);
        scanner.close();
    }
}
