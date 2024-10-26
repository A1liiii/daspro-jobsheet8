import java.util.Scanner;  

public class RataNilai115 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int totalNilai,nilaiMhs,rataNilai;  
        

        int i = 1;  
        while (i <= 5) {  
            totalNilai = 0; 
            for (int j = 1; j <= 5; j++) {  
                System.out.print("Nilai ke-" + j + " = ");  
                nilaiMhs = sc.nextInt();  
                totalNilai += nilaiMhs;  
            }  
            rataNilai = totalNilai / 5; 
            i++;  
        }  
    }  
}