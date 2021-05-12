/**
 * pattern7
 */
import java.util.Scanner;
public class pattern7 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int number = 1;
       
       for (int j = 1; j <= n; j++) {
           for (int i = 1; i <= n-j; i++) {
               System.out.print("  ");
           }
           for (int i = 1; i <= j; i++) {
               System.out.print(number+"  ");
               number++;              
           }
           System.out.println();
       }
   }
    
}