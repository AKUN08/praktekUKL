import java.util.Scanner;
public class praktekUKL {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.print("Masukkan jarak tempuh paket : ");
int j = input.nextInt();
int h = 0;
if (j <= 10){
    System.out.println("masukkan berat paket (kg) :");
    int b = input.nextInt();
    h = b * 4250;
}else{
    System.out.println("masukkan berat paket (kg) : ");
    int b = input.nextInt();
    h = b*6000;
}
System.out.print("Masukkan Panjang paket : ");
int p = input.nextInt();
System.out.print("Masukkan Lebar paket : ");
int l = input.nextInt ();
System.out.print("Masukkan Tinggi paket : ");
int t = input.nextInt ();
int v = 0;
v = p*l*t;
if (v > 100) {
    int c = 0;
    c =  h + 50000;
    System.out.println("Total pengiriman adalah : " +c);
}else {
    System.out.println("Total pengiriman adalah : " +h);    
}

}
}
     


