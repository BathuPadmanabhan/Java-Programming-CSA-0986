import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = s.nextInt();

        System.out.print("Enter a number to Shift: ");
        int shift = s.nextInt();

        System.out.print("Given Number: " + n +"\n");
        int encrypt = armstrong(n, shift);
        System.out.println("Encrypted Number: " + encrypt);

        int decript = Decrypt(encrypt, shift);
        System.out.println("Decrypted Number: " + decript);

        s.close();
    }

    public static int armstrong(int n, int shift) {
        int r = 0;
        int num = 1;

        while (n > 0) {
            int rem = n % 10;
            r += (rem + shift) * num;
            num *= 10;
            n /= 10;
        }

        return r;
    }

    public static int Decrypt(int n, int shift) {
        int r = 0;
        int num = 1;

        while (n > 0) {
            int rem = n % 10;
            r += (rem - shift) * num;
            num *= 10;
            n /= 10;
        }

        return r;
    }
}
