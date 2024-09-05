package binaryoperator;

public class perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean hasilsamadengan = (a == b);
        System.out.println("a == b: " + hasilsamadengan);

        boolean hasiltidaksamadengan = (a != b);
        System.out.println("a != b :" + hasiltidaksamadengan);

        boolean hasilelebihbesardari =(a > b);
        System.out.println("a > b :" + hasilelebihbesardari);

        boolean hasillebihkecildari =(a < b);
        System.out.println("a < b :" + hasillebihkecildari);

        boolean hasilLebihbesarsamadengan =(a >= b);
        System.out.println("a <= b :" + hasilLebihbesarsamadengan);

        boolean hasilLebihkecilsamadengan =(a <= b);
        System.out.println("a <= b :" + hasilLebihkecilsamadengan);

    }
}
