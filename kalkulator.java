import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;

        do {
            System.out.println("Kalkulator Sederhana");
            System.out.println("Pilih operasi: ");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");

            int pilihan = input.nextInt();

            System.out.println("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.println("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            // Menanyakan apakah pengguna ingin mengulangi
            System.out.println("Apakah Anda ingin melanjutkan? (y/n): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y")); // Mengulangi jika jawaban adalah 'y'

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}