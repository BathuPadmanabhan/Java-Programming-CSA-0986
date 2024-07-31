import java.util.Scanner;

class arith {
    int add() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        
        System.out.print("Enter second number: ");
        int b = s.nextInt();

        s.close();
        return (a+b);
    }
}

public class Main {
    public static void main(String[] args) {
        arith Do = new arith();

        int result = Do.add();
        System.out.println("Addition: " + result);
    }
}
