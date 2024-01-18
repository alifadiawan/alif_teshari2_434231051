/**
 * alip
 */
import java.util.*;
import java.lang.Math;

class alip {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String tanggal;
        int result, i, temp, temp2, temp3;

        result = 0;
        System.out.println("Masukkan angka (contoh : 31122023)");
        tanggal = input.nextLine();

        // mengetahui panjang string
        temp = tanggal.length();

        // ubah string menjadi integer
        // 
        // temp3 = Int tanggal
        temp3 = Integer.parseInt(tanggal);
        for (i = 0; i <= temp - 1; i++) {
            temp2 = temp3 % 10;
            result = result * 10 + temp2;
            temp3 = (int) ((double) temp3 / 10);
        }

        // convert lagi tanggal dari String menjadi Integer
        temp3 = Integer.parseInt(tanggal);
        if (result == temp3) {
            System.out.print(result);
            System.out.println(" Merupakan Bilangan PALINDROME");
        } else {
            System.out.print(result);
            System.out.println(" Bukan Merupakan Bilangan PALINDROME");
        }
    }
}
