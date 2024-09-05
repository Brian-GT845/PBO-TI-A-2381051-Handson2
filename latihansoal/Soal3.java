package latihansoal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama : ");
        double angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua : ");
        double angka2 = input.nextInt();

        System.out.println("Pilih operasi (+,-,*,/) : ");
        char operator =input.next().charAt(0);

        double hasil =0;

        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                break;
            case'-':
                hasil = angka1 - angka2;
                break;
            case'*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2!=0){
                    hasil = angka1 / angka2;
            }else {
                    System.out.println("Kesalahan: pembagian dengan nol tidak diperbolehkan");
                    return;
            }
                break;
            default:
                System.out.println("Operator tiddak valid");
                return;
        }
        //menampilkan hasil perthitungan
        if (hasil % 1 == 0) {
            System.out.printf("Hasil: %.0f%n", hasil); // Menghilangkan desimal jika hasil adalah bilangan bulat
        } else {
            System.out.println("Hasil : " + hasil);
        }
    }
}
