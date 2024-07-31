import java.util.Scanner;

class arith {

    void operations() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        
        System.out.println("Addition Result: " + add);
        System.out.println("Subtraction Result: " + sub);
        System.out.println("Multiplication Result: " + mul);
    }
}

public class Main {
    public static void main(String[] args) {
        arith Do = new arith();
        
        
        Do.operations();
    }
}
