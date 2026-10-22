package segitiga;
import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan panjang alas: ");
        double alas = in.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = in.nextDouble();
        
        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;
        
        System.out.println("Luas segitiga adalah: " + luas);
        in.close();
    }
}