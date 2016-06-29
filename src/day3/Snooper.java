package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String money = JOptionPane.showInputDialog("What are your bank details");
	String phone = JOptionPane.showInputDialog("What is your phone number");
	String password = JOptionPane.showInputDialog("What is you computer password");
	String address = JOptionPane.showInputDialog("What is youe home adress");
	String like = JOptionPane.showInputDialog("Do you like making robots or coding");
	String yummy = JOptionPane.showInputDialog("Better:Tofu or Pasta");
	JOptionPane.showMessageDialog(null, "I now know youe bank details");
    JOptionPane.showMessageDialog(null, "I now know your phone number");
    JOptionPane.showConfirmDialog(null, "I now know your computers password");
    JOptionPane.showConfirmDialog(null, "I now know your home adress");
    JOptionPane.showConfirmDialog(null, "I now know that you like both robots and coding");
    JOptionPane.showConfirmDialog(null, "now I know that you like well made tofu better");
}
}
