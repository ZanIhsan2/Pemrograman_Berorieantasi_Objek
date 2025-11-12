package KonvertSuhu;

import java.util.Scanner;

public class ProgramKonversi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        KonverterSatuan[] konverters = new KonverterSatuan[4];
        konverters[0] = new CelciusFahrenheit();
        konverters[1] = new FahrenheitCelcius();
        konverters[2] = new CelciusReamur();
        konverters[3] = new ReamurCelcius();

        System.out.println("Assalamu'alaikum, Aku adalah Konverter Besaran Suhu ...");

        while (true) {
            System.out.println("\nSilakan pilih nomor konverter:");
            for (int i = 0; i < konverters.length; i++) {
                System.out
                        .println((i + 1) + ". " + konverters[i].satuanInput() + " ke " + konverters[i].satuanOutput());
            }

            System.out.print("Konverter pilihan anda (0 untuk QUIT): ");
            int pilih;

            try {
                pilih = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid, gunakan angka.");
                sc.nextLine();
                continue;
            }

            if (pilih == 0) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            } else if (pilih < 1 || pilih > konverters.length) {
                System.out.println("Pilihan tidak valid, coba lagi!");
                continue;
            }

            KonverterSatuan k = konverters[pilih - 1];
            System.out.println(">> Anda pilih " + k.satuanInput() + " ke " + k.satuanOutput());

            System.out.print("Masukkan besaran suhu (" + k.satuanInput() + "): ");
            float nilai;

            try {
                nilai = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("Masukan tidak valid, gunakan angka.");
                sc.nextLine();
                continue;
            }

            float hasil = k.konversi(nilai);
            System.out.println(
                    ">> " + nilai + " " + k.satuanInput() + " setara dengan " + hasil + " " + k.satuanOutput());
        }

        sc.close();
    }
}
