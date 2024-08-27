import javax.swing.*;
class Table{
    public static void main(String[] args){
 JFrame f = new JFrame("JAVA");
 String column[] = {"Reg","Name","Dept"};
 String data[][] = {{"034","PAdmanabhan","AI"},{"007","Vimal","CSE"}};
 JTable j = new JTable(data,column);
 j.setBounds(150,100,300,200);
 JScrollPane s = new JScrollPane(j);
 f.add(s);
 f.setSize(600,300);
 f.setVisible(true);
}
}