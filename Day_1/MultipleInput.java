import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = scanner.nextInt();

        int result = n1 + n2;
        String resultMessage = "The result: " + result;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(resultMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
