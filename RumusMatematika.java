package latihan;

public class RumusMatematika {
    public static void main(String[] args) {
        // Inisialisasi variabel contoh agar kode dapat berjalan/diuji
        double x = 5.0;
        double y = 2.0;
        double z = 10.0;

        // a. Formula a
        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
        
        // b. Formula b
        double b = Math.pow(x, y) - Math.pow(6, x);
        
        // c. Formula c
        double c = 4 * Math.cos(z / 5.0) - Math.sin(Math.pow(x, 2));
        
        // d. Formula d
        double d = Math.pow(x, 4) - Math.sqrt((6 * x) - Math.pow(y, 3));
        
        // e. Formula e
        double e = 1.0 / (y - (1.0 / (x - Math.pow(2, y))));
        
        // f. Formula f
        double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt((3 * x) - 4))));

        // Menampilkan hasil keluaran
        System.out.println("Hasil a: " + a);
        System.out.println("Hasil b: " + b);
        System.out.println("Hasil c: " + c);
        System.out.println("Hasil d: " + d);
        System.out.println("Hasil e: " + e);
        System.out.println("Hasil f: " + f);
    }
}