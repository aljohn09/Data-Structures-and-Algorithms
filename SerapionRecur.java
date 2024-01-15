import java.util.Scanner;

public class SerapionRecur {
    
  public static void display_num(int eri) {
      
        if (eri >= 1) {
            
            display_num(eri - 1);
            System.out.println(eri);
        }
  }
  public static void main (String[] args) {
      
    Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.print("Enter the maximum number to display: ");
            
            int chian = scanner.nextInt();
            
            if (chian < 1) {
                
                System.out.println("Please enter a positive integer.");
            } else {
                display_num(chian);
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
  }
}
