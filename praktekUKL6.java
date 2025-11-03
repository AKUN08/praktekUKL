import java.util.Scanner;   
public class praktekUKL6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kolom : ");
        int k = input.nextInt();
        System.out.print("Masukkan jumlah baris : ");
        int b = input.nextInt();
        
        int[][] matriks = new int[b][k];
        int[][]matirks2 = new int[b][k];
        int[][] hasil = new int[b][k];

        System.out.println("Masukkan elemen matriks pertama : ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("Elemen ke-[" + i + "] [" + j  + "] : ");    
                matriks[i][j] = input.nextInt();
            }
        }    
        System.out.println("Masukkan elemen matriks kedua : ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("Elemen ke-[" + i + "] [" + j  + "] : ");    
                matirks2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                hasil[i][j] = matriks[i][j] + matirks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan kedua matriks adalah : ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("| " +hasil[i][j] + " |");
            }
            System.out.println();
        }
    }
}
