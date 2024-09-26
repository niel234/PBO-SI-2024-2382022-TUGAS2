import java.util.Scanner;

public class TUGAS2 {
    public static void tampilkanMenu() {
        System.out.println("Pilih bangun datar:");
        System.out.println(" ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan pilihan anda: ");
    }

    public static class BangunDatar {

        public static void luasKelilingPersegi(double sisi) {
            double luas = sisi * sisi;
            double keliling = 4 * sisi;
            System.out.println("Luas persegi: " + luas);
            System.out.println("Keliling persegi: " + keliling);
        }

        public static void luasKelilingPersegiPanjang(double panjang, double lebar) {
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);
            System.out.println("Luas persegi Panjang: " + luas);
            System.out.println("Keliling persegi Panjang: " + keliling);
        }

        public static void luasKelilingLingkaran(double jariJari) {
            double luas = Math.PI * jariJari * jariJari;
            double keliling = Math.PI * jariJari * 2;
            System.out.println("Luas lingkaran: " + luas);
            System.out.println("Keliling lingkaran: " + keliling);
        }
    }

    public static double inputSisi(Scanner scanner) {
        System.out.println("Masukan sisi persegi: ");
        return scanner.nextDouble();
    }

    public static double inputPanjang(Scanner scanner) {
        System.out.println("Masukan panjang persegi panjang: ");
        return scanner.nextDouble();
    }

    public static double inputLebar(Scanner scanner) {
        System.out.println("Masukan lebar persegi panjang: ");
        return scanner.nextDouble();
    }

    public static double inputLingkaran(Scanner scanner) {
        System.out.println("Masukan jari-jari lingkaran: ");
        return scanner.nextDouble();
    }

    public static void prosesPilihan(int pilihan, Scanner scanner) {
        switch (pilihan) {
            case 1:
                double sisi = inputSisi(scanner);
                BangunDatar.luasKelilingPersegi(sisi);
                break;
            case 2:
                double panjang = inputPanjang(scanner);
                double lebar = inputLebar(scanner);
                BangunDatar.luasKelilingPersegiPanjang(panjang, lebar);
                break;
            case 3:
                double jariJari = inputLingkaran(scanner);
                BangunDatar.luasKelilingLingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tampilkanMenu();

        int pilihan = scanner.nextInt();

        scanner.nextLine();

        prosesPilihan(pilihan, scanner);

        scanner.close();
    }
}
