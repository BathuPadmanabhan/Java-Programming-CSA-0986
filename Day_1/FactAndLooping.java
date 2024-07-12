import java.util.Scanner;

public class FactAndLooping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        
        System.out.println("Numbers from 1 to 10:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        s.close();
    }
}
