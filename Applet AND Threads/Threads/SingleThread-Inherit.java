//inheritence
class Singlethread extends Thread{
    int a = 3,b=5,c;
    
    public void run(){
    c = a+b;
    System.out.println("sum="+c);
    }
    
    }
    class SingleInheritance{
    public static void main(String[] args){
    Singlethread t= new Singlethread();
    
    t.start();
    }
    }