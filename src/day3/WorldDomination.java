package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Can you write code?(Do not use capitals)");	
		// 2. If they say "yes", tell them they will rule the world.
		if(answer.equals("yes")){
		JOptionPane.showMessageDialog(null," Of course you do, you're in a programming class.");	
		}else if(answer.equals("no")){
			JOptionPane.showMessageDialog(null," Are you serios?! You're in a coding class!");	
		}else{
			JOptionPane.showMessageDialog(null," What?");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

