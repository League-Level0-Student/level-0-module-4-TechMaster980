import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String raptors = JOptionPane.showInputDialog("do you want to help the people?");
		if(raptors.equals("yes")) {
			JOptionPane.showMessageDialog(null, "jeffery dies");
			}
			else if(raptors.equals("no")) {
			JOptionPane.showMessageDialog(null, "jeffery doesn't die");
			}	
			String lawyer = JOptionPane.showInputDialog("do you want a lawyer?");
			if(lawyer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "ask people to come to the park");
			}
			else if(lawyer.equals("no")) {
			JOptionPane.showMessageDialog(null, "you have shut the park down");
			}
			String people = JOptionPane.showInputDialog("agree to it?");
			if(people.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you have gone to the park");	
			}
			else if(people.equals("no")) {
			JOptionPane.showMessageDialog(null, "you see a terrible fate has happened to the park");
			}
			String center = JOptionPane.showInputDialog("see the center");
			if(center.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you now see how the dinos were made");	
			}
			else if(center.equals("no")) {
			JOptionPane.showMessageDialog(null, "you leave to see the dinos");	
			}
		
		
		
	}

		}
