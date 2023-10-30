import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.print("Masukkan nomor operasi (1/2/3/4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        double hasil = 0.0;

        switch (pilihan) {
            case 1:
                hasil = bilangan1 + bilangan2;
                break;
            case 2:
                hasil = bilangan1 - bilangan2;
                break;
            case 3:
                hasil = bilangan1 * bilangan2;
                break;
            case 4:
                if (bilangan2 == 0) {
                    System.out.println("Tidak bisa membagi dengan nol.");
                    return;
                }
                hasil = bilangan1 / bilangan2;
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                return;
        }

        System.out.println("Hasil : " + hasil);
    }
}
