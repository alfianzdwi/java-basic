package JavaDasar;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        String kode;
        String paket = null ;
        int harga = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Kode Paket [A/B/C/D] : ");
        kode = input.nextLine();
        System.out.println("==============================");
        switch (kode) {
            case "A":
                paket = "Ayam Bakar + Nasi + Es Jeruk";
                harga = 70000;
                break;
            case "B":
                paket = "Ikan Bakar + Nasi + Es Cincau";
                harga = 50000;
                break;
            case "C":
                paket = "Ayam Goreng + Nasi + Es Campur";
                harga = 35000;
                break;
            case "D":
                paket="Belut Penyet + Nasi + Es Teh";
                harga = 66000;
                break;
        }

        System.out.println("Menu Yang Di Pesan : Rp."+paket);
        System.out.println("Total Harga : Rp."+harga);
    }
}
