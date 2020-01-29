package _15_voting_booth;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vote {
public static void main(String[] args) {
String height=JOptionPane.showInputDialog("What is yur age?");
	
	int vari=Integer.parseInt(height);
	
	if(vari > 18)	{
		JOptionPane.showInputDialog(null, "You can vote. Who should next president?");
		int idea= new Random().nextInt(6);
		System.out.println(idea);
		if (idea==3)	{
			JOptionPane.showMessageDialog(null, "yes");
		}
		else	{
			JOptionPane.showMessageDialog(null, "no");
		}
		
	}
	else	{
		JOptionPane.showMessageDialog(null, "Nobody cares what you think, kid.");
}
}
}