package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	Random iamavariable = new Random();
	
	
	int Alfred= iamavariable.nextInt(10);
	int Alfred1= iamavariable.nextInt(10);
	int Alfred2= iamavariable.nextInt(10);
	int Alfred3= iamavariable.nextInt(10);
	int Alfred4= iamavariable.nextInt(10);
	
	JOptionPane.showMessageDialog(null, "The Jackpot for two billion is the number: "+ Alfred + Alfred1 + Alfred2 + Alfred3 + Alfred4);
}
}
