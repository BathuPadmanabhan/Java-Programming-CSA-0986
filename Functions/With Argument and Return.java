class arith {
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
       arith Do = new arith();
        int result = Do.add(5, 3);
        System.out.println("Addition Result: " + result);
    }
}
