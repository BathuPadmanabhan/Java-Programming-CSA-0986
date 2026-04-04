//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {
    /*public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }*/

    /*public static int twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //int complement=0;
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return complement;
    }*/

    /*public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }*/

    public static void vc(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0;
        for (int i =0; i<s.length();i++){
            char ch =Character.toLowerCase(s.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
            else c++;
        }
        System.out.print("Vowels: "+v);
        System.out.print("\nConsonents: "+c);
    }

    public static String Firstnon(String s){

        for (int i =0 ;i<s.length();i++) {
            //ch=s.charAt(i);
            int c = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) c++;
            }
            if (c == 1) return String.valueOf(s.charAt(i));
        }
        return null;
    }

    public static int miss(int[] a, int n) {
        int sum = 0;
        for (int i=0;i<n-1;i++)
            sum += a[i];
        int t=n*(n+1)/2;
        return t-sum;

    }

    public static void freq(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int[] a=new int[n];

        for(int i=0;i<n;i++) {
            int count=1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            a[i]=count;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void majorityelement(int[] a,int n){
        int m=0;
        int c=0;
        for(int i=0;i<n;i++){


            for(int j=0;j<n;j++) {
                if (a[i] == a[j]) c++;
            }
            if(c>(n/2)){
                //System.out.println(a[i]);
                m=a[i];
            break;}

        }
        System.out.println(m+" "+c);
    }

    public static void empty(String s){
        String res="";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(res.indexOf(c)==-1){
                res=res+c;
            }
        }
        System.out.println(res);
    }

    public static void Rrotate(int[] a,int k,int n){
        for(int i=0;i<k;i++){
            int l=a[n-1];

            for(int j=n-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0]=l;
        }
        for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void firstlast(int[] a,int k){
        int n=a.length;

        int f=-1,l=-1;
        for (int i=0;i<n;i++){
            if(a[i]==k) {
                if (f == -1) f = i;
                l = i;
            }
        }
        System.out.println(f + l);
    }

    public static void alphaOrder(String[] a,int n){

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i].compareTo(a[j]) < 0){
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void guess(){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        int num=r.nextInt(100)+1;
        int g=0;
        while(g!=num){
            System.out.print("Enter: ");
            g=sc.nextInt();
            if(g<num) System.out.println("its low");
            else if(g>num) System.out.println("Its high");
            else if(g==num) System.out.println("(^~^)*/");
        }

    }
    public static void Maxdiff(){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        int min=a[0];
        int Max=0;

        for(int i=0;i<n;i++){
            if(a[i]-min>Max) Max=a[i]-min;
            if(a[i]<min) min=a[i];
        }
        System.out.println(Max);
    }

    public static void equi(){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l = l+a[j];
            }
            for(int j=i+1;j<n;j++){
                r+=a[j];
            }
            if (l==r){
                System.out.println(i);
                break;
            }else System.out.println("Doesn't contain an equilibrium index");
        }
    }

    public static void Neg(){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(a[i]<0) System.out.print(a[i]+" ");
        }for (int i=0;i<n;i++){
            if(a[i]>=0) System.out.print(a[i]+" ");
        }
    }
    public static void anagram(){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String a=sc.next();
        String b = sc.next();
        int[] n=new int[256];
        if(a.length()!=b.length()) System.out.print("Not an Anagram");
else {
            boolean c=true;
            for (int i = 0; i < a.length(); i++) {

                n[a.charAt(i)]++;
                n[b.charAt(i)]++;
            }

            for (int i = 0; i < 256; i++) {
                if (n[i] != 0) {
                    c=false;
                    break;
                }
            }
            if(c) System.out.print("Anagram");
            else System.out.print("Not an anagram");
        }


    }

    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a=new String[n];

        for (int i=0;i<n;i++){
            a[i]=sc.next();
        }*/

        //alphaOrder(a,n);
        equi();

            }
        }


