package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("What is yur height in inches?");
	
	int vari=Integer.parseInt(height);
	
	if(vari > 48)	{
		JOptionPane.showMessageDialog(null, "You can ride");
	}
	else	{
		JOptionPane.showMessageDialog(null, "Eat ur veggies");
	}
}
}
