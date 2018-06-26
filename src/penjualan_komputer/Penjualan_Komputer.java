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

        String[] Laptop
                = {"1. Lenovo B-30", "2. Asus B-45", "3. Lenovo B-25", "4. Acer Z470", "5. Acer B500", "6. Lenovo G405",
                    "7. Lenovo G405s", "8. Asus ROG", "9. Toshiba L312", "10. Apple Mac X "};
        String[] Harga
                = {"| Rp 5.000.000,00", "| Rp 5.500.000,00", "| Rp 3.500.000,00", "| RP 2.500.000,00", "| Rp 2.000.000,00", "| Rp 5.000.000,00", "| Rp 5.500.000,00",
                    "| Rp 10.000.000,00", "| Rp 3.000.000,00", "| Rp 11.000.000,00"};

        for (int i = 0; i < Laptop.length; i++) {
            System.out.println(" " + Laptop[i] + "     \t" + Harga[i]);

        }

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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Lenovo B-30                      =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core i3               ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                   Asus B-45                       =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core i3               ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Asus B-45";
                    harga[i] = 5500000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 3) {
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Lenovo A-25                      =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : AMD  A6                     ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                   Acer Z470                       =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core 2 Duo            ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
                System.out.println("|====                    1. Beli                          ====|");
                System.out.println("|====                    2. Kembali                       ====|");
                System.out.println("|=============================================================|");
                pil = input.nextInt();
                if (pil == 1) {
                    menu[i] = "Acer Z470";
                    harga[i] = 25000000;

                } else if (pil == 2) {
                    tampilkanmenu();
                }
            } else if (pil == 5) {
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                   Acer B500                       =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Atom                  ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Lenovo G405                      =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : AMD A8                      ====|"},
                        {"|====                    Ram : 4GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Lenovo G405s                     =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : AMD A8                      ====|"},
                        {"|====                    Ram : 4GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                   Asus ROG                        =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core i3               ====|"},
                        {"|====                    Ram : 4GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Toshiba L312                     =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core i3               ====|"},
                        {"|====                    Ram : 2GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
                String[][] spek
                        = {{"|=============================================================|",
                            "|=====                  Apple Mac X                      =====|"},
                        {"|=====                  SPESIFIKASI                      =====|",
                            "|====             Processor : Intel Core i3               ====|"},
                        {"|====                    Ram : 4GB                        ====|",
                            "|=============================================================|"}};
                for (String[] spek1 : spek) {
                    for (int j = 0; j < spek1.length; j++) {
                        System.out.println(spek1[j]);
                    }
                }
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
