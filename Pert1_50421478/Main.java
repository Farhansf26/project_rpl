
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, jari2, sisi1, sisi2, sisi3;
        System.out.println("Menu : ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar : ");
                lebar = input.nextInt();
                System.out.print("\nKeliling persegi panjang\t: " + (2 * (panjang + lebar)) + " cm");
                System.out.println("\nLuas persegi panjang\t\t: " + panjang * lebar + " cm2");
                break;
            case 2:
                System.out.print("Masukkan r : ");
                jari2 = input.nextInt();
                System.out.print("\nKeliling lingkaran\t: " + (2 * 3.14 * jari2) + " cm");
                System.out.println("\nLuas lingkaran\t\t: " + (3.14 * jari2 * jari2) + " cm2");
                break;
            case 3:
                System.out.print("Masukkan a : ");
                sisi1 = input.nextInt();
                System.out.print("Masukkan b : ");
                sisi2 = input.nextInt();
                System.out.print("Masukkan r : ");
                sisi3 = input.nextInt();
                System.out.print("\nKeliling segitiga\t: " + (sisi1 + sisi2 + sisi3) + " cm");
                System.out.println("\nLuas segitiga\t\t: " + (sisi1 * sisi2) / 2 + " cm2");
                break;
            default:
                System.out.println("data tak ditemukan, program dihentikan ...");
        }
    }
}