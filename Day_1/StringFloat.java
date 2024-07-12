import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringFloat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a float number: ");
        float num = 0;
        try {
            num = Float.parseFloat(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid float number.");
        }

        System.out.println("String entered: " + str);
        System.out.println("Float entered: " + num);
        s.close();
    }
}

