class arith {
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }

    void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction Result: " + result);
    }

    void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }

    void div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        arith Do = new arith();
        

        Do.add(5, 3);
        Do.sub(10, 4);
        Do.mul(7, 6);
        Do.div(20, 4);
        Do.div(20, 0);
    }
}
