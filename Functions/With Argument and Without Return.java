import java.util.Scanner;

class arith {
    void ad() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        
        add(a, b);
        s.close();
    }


    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        arith Do = new arith();
        
        Do.ad();
    }
}
