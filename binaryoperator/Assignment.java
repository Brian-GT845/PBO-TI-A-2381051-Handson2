package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        int x = 5;
        x += 3; // x = x+ 3;
        System.out.println("Nilai x setelah += 3:" +x);

        int y = 10;
        y -= 2; // y = y -2
        System.out.println("Nilai x setelah -= 2" + y);

        int z =4;
        z *=4;
        System.out.println(" Nilai z setelah *= 4" + z);

        int a = 20;
        a /= 20;
        System.out.println("Nilain a setelah");
    }
}
