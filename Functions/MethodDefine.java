class ArithmeticOperations {
  
    int add(int a, int b) {
        return a + b;
    }
    
    int subtract(int a, int b) {
        return a - b; 
    }
    
    int multiply(int a, int b) {
        return a * b; 
    }
    
    double divide(double a, double b) {
        if (b != 0) {
            return a / b; 
        } else {
            throw new ArithmeticException("Can't divide by zero");
        }
    }

    public static void main(String[] args) {
        arith Do = new arith();
        
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Addition: " + Do.add(num1, num2));
        System.out.println("Subtraction: " + Do.subtract(num1, num2));
        System.out.println("Multiplication: " + Do.multiply(num1, num2));
        
        double num3 = 10.0;
        double num4 = 2.0;
        
        System.out.println("Division: " + Do.divide(num3, num4));
    }
}
