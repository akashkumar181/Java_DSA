package SelfJava;
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
      String name=JOptionPane.showInputDialog("ENTER YOUR NAME: "); 
      JOptionPane.showMessageDialog(null,"Hey "+name);
       int  age=Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR age: ")); 
      JOptionPane.showMessageDialog(null,"You are "+age+"years old");
      double  height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your  Height: ")); 
      JOptionPane.showMessageDialog(null,"You are "+height+"inches");
}
}