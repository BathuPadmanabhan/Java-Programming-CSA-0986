import javax.swing.*;
public class Text{
public static void main(String[] args){
JFrame f = new JFrame("BUTTON");
JTextArea b = new JTextArea("JAVA PROGRAMMING");
b.setBounds(50,50,400,200);
f.add(b);
f.setSize(600,400);
f.setLayout(null);
f.setVisible(true);

}
}