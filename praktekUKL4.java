import java.util.Scanner;
public class praktekUKL4 {
    
    public static double volume_tabung (double jarijari, double tinggi) {
        double phi = 3.14;
        double volume = phi*jarijari*jarijari*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        double jarijari,tinggi;
        Scanner angka = new Scanner (System.in);
        System.out.println("Masukkan jari-jari : ");
        jarijari = angka.nextDouble();
        System.out.println("Masukkan tinggi : ");
        tinggi = angka.nextDouble();
        double volume = volume_tabung(jarijari,tinggi);
        System.out.println("Volume tabung adalah : " + volume);
    }   
}

