import java.util.Scanner;
public class praktekUKL3 {
    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int a = angka.nextInt();
        int h = a;
        for (int i = a; i > 0 ; i--){
        if (a != i) {
                h *= i; 
            }
        }
            System.out.println("hasil = " +h);
        
    }
}