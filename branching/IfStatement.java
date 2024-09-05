package branching;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nomor hari (1-7) : ");
        int nomorhari = input.nextInt();

        String namahari = "";

        if (nomorhari ==1){
            namahari = "minggu";
        } else if (nomorhari ==2){
            namahari = "senin";
        } else if (nomorhari ==3) {
            namahari = "selasa";
        } else if (nomorhari ==4) {
            namahari = "rabu";
        } else if (nomorhari ==5) {
            namahari = "kamis";
        } else if (nomorhari ==6) {
            namahari ="jumat";
        } else if (nomorhari ==7) {
            namahari = "sabtu";
        }else {
            System.out.println("masukkan nomor antara 1-7");
            System.exit( 0);
        }
        System.out.println();
    }
}