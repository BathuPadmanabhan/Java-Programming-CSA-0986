import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class CollegeTree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("College Structure");
        
        DefaultMutableTreeNode college = new DefaultMutableTreeNode("College");
        
        DefaultMutableTreeNode sec = new DefaultMutableTreeNode("SEC");
        DefaultMutableTreeNode sse = new DefaultMutableTreeNode("SSE");
        
        college.add(sec);
        college.add(sse);
        
        DefaultMutableTreeNode cse = new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode ece = new DefaultMutableTreeNode("ECE");
        
        sec.add(cse);
        sec.add(it);
        sec.add(ece);
        
        DefaultMutableTreeNode eee = new DefaultMutableTreeNode("EEE");
        DefaultMutableTreeNode mech = new DefaultMutableTreeNode("MECH");
        DefaultMutableTreeNode niotech = new DefaultMutableTreeNode("BIOTECH");
        
        sse.add(eee);
        sse.add(mech);
        sse.add(niotech);
        
        JTree collegeTree = new JTree(college);
        frame.add(new JScrollPane(collegeTree));
        
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
