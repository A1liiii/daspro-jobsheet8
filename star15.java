import java.util.Scanner;

public class star15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukan Nilai Dari N = ");
        n =  sc.nextInt();

        for(int i = 1; i>n; i++ ){
            System.out.print("*");
        }
    }
}