import javax.swing.*;
class MenuApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        JMenuBar menuBar = new JMenuBar();
        JMenu mainMenu = new JMenu("Main");
        JMenu subMenu = new JMenu("OOP");
        JMenuItem itemC = new JMenuItem("C");
        JMenuItem itemPython = new JMenuItem("Python");
        JMenuItem itemCpp = new JMenuItem("C++");
        JMenuItem itemJava = new JMenuItem("Java");
        
        mainMenu.add(itemC);
        mainMenu.add(itemPython);
        subMenu.add(itemCpp);
        subMenu.add(itemJava);
        mainMenu.add(subMenu);
        menuBar.add(mainMenu);
        
        frame.setJMenuBar(menuBar);
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
