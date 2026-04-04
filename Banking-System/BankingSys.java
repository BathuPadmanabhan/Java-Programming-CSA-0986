import java.util.*;

class Bank{
    private Map<Integer,Account> accounts=new HashMap<>();
    public void create(int Acno,String name){
        accounts.put(Acno,new Account(Acno,name));
        System.out.println("Account Created");
    }

    public Account getAccount(int Acno){
        return accounts.get(Acno);
    }

    public void transfer(int fromAcno, int toAcno, double amt) throws InsufficientBalanceException {
        Account fromAccount = getAccount(fromAcno);
        Account toAccount = getAccount(toAcno);

        if (fromAccount == null) {
            throw new InsufficientBalanceException("Source account does not exist");
        }
        if (toAccount == null) {
            throw new InsufficientBalanceException("Destination account does not exist");
        }

        fromAccount.withdraw(amt);
        toAccount.deposit(amt);

        
        fromAccount.addToHistory("Transferred: -" + amt + " to account " + toAcno);
        toAccount.addToHistory("Received: +" + amt + " from account " + fromAcno);
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account{
    private int AccNo;
    private String Name;
    private double Balance;
    private List<String>History;

    public Account(int acno,String name){
        this.AccNo=acno;
        this.Name=name;
        this.Balance=0;
        this.History=new ArrayList<>();
    }

    public int getAccNo() {
        return AccNo;
    }

    public double getBalance() {
        return Balance;
    }

    public void showHistory(){
        for(String t:History){
            System.out.println(t);
        }
    }

    public void addToHistory(String transaction) {
        History.add(transaction);
    }

    public void deposit(double amt){
        Balance+= amt;
        addToHistory("Deposited: +" + amt);
        System.out.println("Deposited: "+amt);
        System.out.println("Balance: "+Balance);
    }
    public void withdraw(double amt) throws InsufficientBalanceException{
        if(amt>Balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        Balance-= amt;
        addToHistory("WithDrew: -" + amt);
        System.out.println("Balance: "+Balance);
    }

}


public class BankingSys {
    public static void main(String[] args){
        Bank bk=new Bank();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1. Create Account\n2. Deposit\n3.WithDraw\n4.Check Balance\n5.Show Transaction History\n6.Transfer\n7.Exit");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    int Acno=sc.nextInt();
                    String Name=sc.next();
                    bk.create(Acno,Name);
                    break;
                case 2:
                    Acno=sc.nextInt();
                    System.out.print("Enter Amount to deposit: ");
                    double d=sc.nextDouble();
                    bk.getAccount(Acno).deposit(d);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    Acno=sc.nextInt();
                    System.out.print("\nEnter Amount To Withdraw: ");
                    double w=sc.nextDouble();
                    try{
                        bk.getAccount(Acno).withdraw(w);
                    } catch(InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    } break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    Acno=sc.nextInt();
                    System.out.println("Balance: "+bk.getAccount(Acno).getBalance());
                    break;
                case 5:
                    System.out.println("Account no: ");
                    Acno=sc.nextInt();
                    bk.getAccount(Acno).showHistory();
                    break;
                case 6:
                    System.out.print("Enter From Account Number: ");
                    int fromAcno = sc.nextInt();
                    System.out.print("Enter To Account Number: ");
                    int toAcno = sc.nextInt();
                    System.out.print("Enter Amount to Transfer: ");
                    double transferAmt = sc.nextDouble();
                    try {
                        bk.transfer(fromAcno, toAcno, transferAmt);
                        System.out.println("Transfer successful!");
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    return;
                    }
            }
        }
    }

