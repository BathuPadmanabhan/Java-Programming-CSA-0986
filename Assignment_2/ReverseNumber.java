import java.util.Scanner;
public class reverse{
     public static void main(String[] args) {
         int a,n,r=0,rem;
         Scanner s=new Scanner(System.in);
         System.out.println("enter a number:");
         n=s.nextInt();
         a=n;
         while(n!=0){
         rem=n%10;
         r=r*10+rem;
         n=n/10;
         }
        System.out.println(r);
     }
}
