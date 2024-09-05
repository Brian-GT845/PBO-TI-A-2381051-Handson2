package latihansoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        int angka1 = scanner.nextInt();

        System.out.println("Masukkan angka kedua:");
        int angka2 = scanner.nextInt();
        if (angka1 > angka2){
            System.out.println("Angka terbesar = " + angka1 + "Angka terkecil = " +angka2 );
            System.out.println("Angka terbesar = " + angka2 + "Angka terkecil = " + angka1);
        }else {
            System.out.println("Kedua angka sama : " + angka2);
        }
    }
}
