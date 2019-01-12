package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testscores {

	//Write code to ask the user for their test score.
		String test = JOptionPane.showInputDialog(null, "I need your test score");
		
		double tt = Integer.parseInt(test)
		//Your program MUST allow the user to enter a test score that has a decimal, e.g. 75.5

		//Give them a different message according to their score.
		if(test<50) {
			JOptionPane.showMessageDialog(null, "You failed and did horrible go back to preschool");
		}
		if(test=75) {
			JOptionPane.showMessageDialog(null, "you didn't get a passing score try again");
		}
		if(test>90) {
			JOptionPane.showMessageDialog(null, "You passed the test and have a high score go to university");
		}
		//Example: "Wow! You must have studied really hard for that test!"


		//HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double.



	}
}

