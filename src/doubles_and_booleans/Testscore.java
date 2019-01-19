package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Testscore {

	public static void main(String[] args) {
		
	
	//Write code to ask the user for their test score.
			String test = JOptionPane.showInputDialog(null, "I need your test score");
			
			double tt = Double.parseDouble(test);
			//Your program MUST allow the user to enter a test score that has a decimal, e.g. 75.5

			//Give them a different message according to their score.
			if(tt<=50) {
				JOptionPane.showMessageDialog(null, "You failed and did horrible go back to preschool you failer!");
			}
			if(tt==75) {
				JOptionPane.showMessageDialog(null, "you didn't get a passing score but try again repeat the grade");
			}
			if(tt>=90) {
				JOptionPane.showMessageDialog(null, "You passed the test and have a high score go to university you aren't a failer");
			}
			//Example: "Wow! You must have studied really hard for that test!"


			//HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double.

			

		
	}

}
