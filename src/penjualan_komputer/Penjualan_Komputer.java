package penjualan_komputer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Penjualan_Komputer {

    static void tampilkanmenu() {
        System.out.println();
        System.out.println("|=============================================================|");
        System.out.println("|=====              DAFTAR BARANG DAN HARGA              =====|");
        System.out.println("|=============================================================|");
        System.out.println("|=====        1. Lenovo B-30   | Rp 5.000.000,00         =====|");
        System.out.println("|=====        2. Asus B-45     | Rp 5.500.000,00         =====|");
        System.out.println("|=====        3. Lenovo B-25   | Rp 3.500.000,00         =====|");
        System.out.println("|=====        4. Acer Z470     | RP 2.500.000,00         =====|");
        System.out.println("|=====        5. Acer B500     | Rp 2.000.000,00         =====|");
        System.out.println("|=====        6. Lenovo G405   | Rp 5.000.000,00         =====|");
        System.out.println("|=====        7. Lenovo G405s  | Rp 5.500.000,00         =====|");
        System.out.println("|=====        8. Asus ROG      | Rp 10.000.000,00        =====|");
        System.out.println("|=====        9. Toshiba L312  | Rp 3.000.000,00         =====|");
        System.out.println("|=====       10. Apple Mac X   | Rp 11.000.000,00        =====|");
        System.out.println("|=============================================================|");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int uangBayar, uangKembalian;
        int pil;
        int i = 0;
        int hargatotal = 0;
        String menu[] = new String[100];
        int harga[] = new int[100];
        String keputusan = "Y";

        tampilkanmenu();
        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.println("|=============================================================|");
            System.out.print("\t Pilih Barang Sesuai yang Anda Inginkan :");
            pil = input.nextInt();
            if (pil == 1) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Lenovo B-30                      =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core i3               ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Lenovo B-30";
                    harga[i] = 5000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 2) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                   Asus B-45                       =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core i3               ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Asus B-45";
                    harga[i] = 5500000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 3) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Lenovo B-25                      =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : AMD  A6                     ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Lenovo B-25";
                    harga[i] = 3500000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 4) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                   Acer Z470                       =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core 2 Duo            ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Acer Z470";
                    harga[i] = 25000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 5) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                   Acer B500                       =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Atom                  ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Acer B500";
                    harga[i] = 20000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 6) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Lenovo G405                      =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : AMD A8                      ====|");
                System.out.println("|====                    Ram : 4GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Lenovo G405";
                    harga[i] = 5000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 7) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Lenovo G405s                     =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : AMD A8                      ====|");
                System.out.println("|====                    Ram : 4GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Asus B-45";
                    harga[i] = 5500000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 8) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                   Asus ROG                        =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core i3               ====|");
                System.out.println("|====                    Ram : 4GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Asus ROG";
                    harga[i] = 10000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 9) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Toshiba L312                     =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core i3               ====|");
                System.out.println("|====                    Ram : 2GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Toshiba L312";
                    harga[i] = 3000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 10) {
                System.out.println("|=============================================================|");
                System.out.println("|=====                  Apple Mac X                      =====|");
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                System.out.println("|====             Processor : Intel Core i3               ====|");
                System.out.println("|====                    Ram : 4GB                        ====|");
                System.out.println("|=============================================================|");
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                System.out.print("\t   Masukkan Pilihan : ");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Apple Mac X";
                    harga[i] = 11000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else {
                System.out.println("\t   Sorry Invalid Input");
                menu[i] = "Empty";
            }

            System.out.println("|=============================================================|");
            System.out.println("\t   Barang yang Anda Pesan Adalah : " + menu[i]);
            System.out.println("\t   Harga Barang : " + harga[i]);
            System.out.println("|=============================================================|");
            System.out.print("\t   Apakah Anda Ingin Memesan Lagi ?  Y/T : ");

            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("\t   Sorry Invalid Input");
            }
            i++;
        }
        System.out.println("|=============================================================|");
        System.out.println("\t   Barang yang Anda Pesan Adalah : " + i);
        for (int a = 0; a < i; a++) {
            System.out.print(menu[a] + ", ");
        }
        System.out.println(" ");
        for (int b = 0; b < i; b++) {
            hargatotal = hargatotal + harga[b];
        }
        System.out.println("|=============================================================|");
        System.out.println("\t    Total yang Harus Anda Bayar Adalah : Rp " + hargatotal);
        System.out.print("\t   Uang Yang Dibayarkan : Rp ");
        uangBayar = input.nextInt();
        uangKembalian = uangBayar - hargatotal;
        System.out.println("\t   Kembaliannya : Rp " + uangKembalian);
        System.out.println("|=============================================================|");
        System.out.println("test");
    }
}
