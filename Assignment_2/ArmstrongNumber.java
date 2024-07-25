import java.util.Scanner;
public class armstrong{
     public static void main(String[] args) {
         int a,n,r=0,rem;
         Scanner s=new Scanner(System.in);
         System.out.println("enter a number:");
         n=s.nextInt();
         a=n;
         while(n!=0){
         rem=n%10;
         r+=rem*rem*rem;
         n=n/10;
         }
         if(a==r)
             System.out.println("it is an armstrong number");
         
         else
             System.out.println("it is not an armstrong number");
         
     }
}
