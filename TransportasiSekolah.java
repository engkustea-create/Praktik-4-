package sekolah;
import java.util.Scanner;

public class TransportasiSekolah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalOrang = in.nextInt();
        
        int kapasitasBus = 45;
        int jumlahBus = totalOrang / kapasitasBus;
        int sisaOrangVan = totalOrang % kapasitasBus;
        
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + sisaOrangVan);
        
        in.close();
    }
}