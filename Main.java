package week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    int sisi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisi);
                    System.out.println("Luas Persegi: " + persegi.luas(sisi));
                    System.out.println("Keliling Persegi: " +persegi.kelilingpersegi(sisi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(lebar, panjang);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas(lebar, panjang));
                    System.out.println("Keliling Persegi Panjang: " + persegiPanjang.kelilingsegipanjang(lebar, panjang));
                    break;
                case 3:
                    System.out.print("Masukkan panjang alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(0); // Gunakan nilai dummy karena kita tidak butuh constructor di sini
                    System.out.println("Luas Segitiga: " + segitiga.luas(alas, tinggi));
                    break;
                case 4:
                    System.out.print("Masukkan diameter lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(jariJari);
                    System.out.println("Luas Lingkaran: " + lingkaran.luas(jariJari));
                    System.out.println("Keliling Lingkaran: " + lingkaran.kelilinglingkaran(jariJari));
                    break;
                case 5:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    int sisikubus = scanner.nextInt();
                    BangunRuang kubus = new BangunRuang(sisikubus);
                    System.out.println("Volume Kubus : " + kubus.volumeKubus(sisikubus));
                    System.out.println("Keliling Kubus : " + kubus.kelilingKubus(sisikubus));
                    break;
                case 6:
                    System.out.print("Masukkan panjang balok: ");
                    int panjangbalok = scanner.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int lebarbalok = scanner.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int tinggibalok = scanner.nextInt();
                    BangunRuang balok = new BangunRuang(panjangbalok, lebarbalok);
                    System.out.println("Volume Balok : " + balok.volumeBalok(panjangbalok, lebarbalok, tinggibalok));
                    System.out.println("Keliling Balok : " + balok.kelilingBalok(panjangbalok, lebarbalok, tinggibalok));
                    break;
                case 7:
                    System.out.print("Masukkan diameter bola: ");
                    double diameter = scanner.nextDouble();
                    BangunRuang bola = new BangunRuang(diameter);
                    System.out.println("Volume Bola : " + bola.volumeBola(diameter));
                    System.out.println("Keliling Bola : " + bola.kelilingBola(diameter));
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void menu() {
        System.out.println("-------->>Pilih bangun datar atau bangun ruang<<--------");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.println("7. Bola");
        System.out.println("0. Exit");
    }
}
