import java.util.Scanner;

public class CheckEmailWithNestedIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = s.nextLine();

        if (email.contains("@") && email.contains("gmail") || email.contains("yahoo")) {

            if (email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".org")) {
                System.out.println("Valid email address!");
            } else {
                System.out.println("Invalid email address! Must end with .com, .net, or .org");
            }
        } else {
            System.out.println("Invalid email address! Must contain @ symbol");
        }
        s.close();
    }
}
