import javax.swing.*;
public class Radio{
public static void main(String[] args){
JFrame f = new JFrame("BUTTON");
JRadioButton r1=new JRadioButton("A) Java");    
JRadioButton r2=new JRadioButton("B) C++");    
r1.setBounds(100,100,100,30);    
r2.setBounds(250,100,100,30);    
 
f.add(r1);f.add(r2);      
f.setSize(900,300);    
f.setLayout(null);    
f.setVisible(true);    

}
}