import java.util.Scanner;

class INPUT {
    protected int acc;
    protected double balance;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc = scanner.nextInt();
        balance = 5000;
    }

    public int getAcc() {
        return acc;
    }

    public double getBalance() {
        return balance;
    }
}

class Operations extends INPUT {
     double amount;

    public void deposit(double amount) {
        this.amount = amount;
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.amount = amount;
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(int toAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount transferred successfully to account " + toAccount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

public class Bank
 {
    public static void main(String[] args) {
        Operations t = new Operations();
        Scanner s = new Scanner(System.in);

        t.getInput();

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = s.nextDouble();
        t.deposit(depositAmount);
        System.out.println("New Balance after deposit: " + t.getBalance());

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = s.nextDouble();
        t.withdraw(withdrawAmount);
        System.out.println("New Balance after withdrawal: " + t.getBalance());

        System.out.print("Enter account number to transfer to: ");
        int toAccount = s.nextInt();
        System.out.print("Enter amount to transfer: ");
        double transferAmount = s.nextDouble();
        t.transfer(toAccount, transferAmount);

        System.out.println("Final Balance: " + t.getBalance());
        s.close();
    }
}
