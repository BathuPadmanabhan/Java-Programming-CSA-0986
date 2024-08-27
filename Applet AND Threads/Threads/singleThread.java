// interface
class Singlethread implements Runnable{
    int a = 10,b=5,c;
    
    public void run(){
    c = a+b;
    System.out.println("sum="+c);
    }
    
    }
    class SingleInter{
    public static void main(String[] args){
    Singlethread s= new Singlethread();
    Thread t=new Thread(s);
    
    t.start();
    }
    }