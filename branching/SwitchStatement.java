package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input =  new Scanner ( System.in);

        System.out.println("masukkkan nomor hari (1 -7) : ");
        int nomorhari = input.nextInt();

        String namaHari = "";
        switch (nomorhari){
            case 1:
                namaHari = "minggu";
                break;
            case 2:
                namaHari = "senin";
                break;
            case 3:
                namaHari = "selasa";
                break;
            case 4:
                namaHari = "rabu";
                break;
            case 5:
                namaHari = "kamis";
                break;
            case 6:
                namaHari = "jumat";
                break;
            case 7:
                namaHari = "sabtu";
                break;
            default:
                System.out.println("masukkan nomor antara 1-7");
                System.exit(0);
        }
        System.out.println("Hari : ");
    }
}
