package _99_extra;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String x=JOptionPane.showInputDialog("Are you happy?");
	if (x=="yes")	{
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	if (x=="no")	{
		String y=JOptionPane.showInputDialog("Do you want to be happy?");
			if (y=="yes") {
				JOptionPane.showMessageDialog(null, "change sonething");
			}
			if (y=="no")	{
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
			}
	}
}
}
