import java.util.Scanner;
public class praktekUKL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa : ");
        int s = input.nextInt();
        double[] n = new double[s];
        double total = 0;   

        for (int i = 0; i < s; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + " : ");
            n[i] = input.nextDouble();
            total += n[i];
        }
        double r = total / s;
        System.out.println("Rata-rata nilai adalah : " + r);           
    }
}
