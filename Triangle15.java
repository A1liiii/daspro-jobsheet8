import java.util.Scanner;

public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Masukkan nilai N = ");  
        int N = sc.nextInt();  
        int i = 0;  
        while(i < N) {  
            int j = 0;  
            while(j <= i) { // Ubah ini untuk mencetak bintang sesuai dengan baris  
                System.out.print("*");  
                j++;  
            }  
            System.out.println(); // Tambahkan ini untuk pindah ke baris baru  
            i++;  
        }
    }
}