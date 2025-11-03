import java.util.Scanner;
public class praktekUKL2 {
     public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        int a = angka.nextInt();
        if (a % 2 == 0){
            System.out.println("bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }
    }
}