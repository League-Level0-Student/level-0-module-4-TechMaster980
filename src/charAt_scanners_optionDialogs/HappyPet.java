package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
JOptionPane.showInputDialog(null, "what pet do you want to get");
	


		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	for(int i =0; i <10; i++){
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what are you going to do to make your pet happy", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water" }, null);
				System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
				
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel==10) {
			JOptionPane.showMessageDialog(null, "you love your pet very much");
			
			}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddletsarbomba(String bomba) {
	JOptionPane.showMessageDialog(null, "tsar might explode when cuddle");	
	}

}	