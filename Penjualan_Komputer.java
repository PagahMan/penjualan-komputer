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

        //System.out.println();
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek = {"Processor : Intel Core i3", "Ram : 2GB"};
                String[] pilih = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek.length; j++) {
                    System.out.println("\t    " + spek[j]);
                }
                System.out.println("|=============================================================|");
                for (int k = 0; k < pilih.length; k++) {
                    System.out.println("\t    " + pilih[k]);
                }
                
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek2 = {"Processor : Intel Core i3", "Ram : 2GB"};

                String[] pilih2 = {"1. Beli", "2. Kembali"};

                for (int j = 0; j < spek2.length; j++) {
                    System.out.println("\t    " + spek2[j]);

                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih2.length; j++) {
                    System.out.println("\t    " + pilih2[j]);

                }

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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek3 = {"Processor : AMD  A6", "Ram : 2GB"};

                String[] pilih3 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek3.length; j++) {
                    System.out.println("\t   " + spek3[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih3.length; j++) {
                    System.out.println("\t   " + pilih3[j]);
                }

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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek4 = {"Processor : Intel Core 2 Duo", "Ram : 2GB"};

                String[] pilih4 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek4.length; j++) {
                    System.out.println("\t   " + spek4[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih4.length; j++) {
                    System.out.println("\t   " + pilih4[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek5 = {"Processor : Intel Atom", "Ram : 2GB"};

                String[] pilih5 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek5.length; j++) {
                    System.out.println("\t   " + spek5[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih5.length; j++) {
                    System.out.println("\t   " + pilih5[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek6 = {"Processor : AMD A8", "Ram : 4GB"};

                String[] pilih6 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek6.length; j++) {
                    System.out.println("\t   " + spek6[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih6.length; j++) {
                    System.out.println("\t   " + pilih6[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek7 = {"Processor : AMD A8", "Ram : 4GB"};

                String[] pilih7 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek7.length; j++) {
                    System.out.println("\t   " + spek7[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih7.length; j++) {
                    System.out.println("\t   " + pilih7[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek8 = {"Processor : Intel Core i3", "Ram : 4GB"};

                String[] pilih8 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek8.length; j++) {
                    System.out.println("\t   " + spek8[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih8.length; j++) {
                    System.out.println("\t   " + pilih8[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek9 = {"Processor : Intel Core i3", "Ram : 2GB"};

                String[] pilih9 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek9.length; j++) {
                    System.out.println("\t   " + spek9[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih9.length; j++) {
                    System.out.println("\t   " + pilih9[j]);
                }
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
                System.out.println("|=====                  SPESIFIKASI                      =====|");
                String[] spek10 = {"Processor : Intel Core i3", "Ram : 4GB"};

                String[] pilih10 = {"1. Beli", "2. Kembali"};
                for (int j = 0; j < spek10.length; j++) {
                    System.out.println("\t   " + spek10[j]);
                }
                System.out.println("|=============================================================|");
                for (int j = 0; j < pilih10.length; j++) {
                    System.out.println("\t   " + pilih10[j]);
                }
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
    }

}
