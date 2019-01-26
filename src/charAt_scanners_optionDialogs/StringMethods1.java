package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		
// 1. Create a String variable and initialize it to whatever you want
		String abc="abcdefga";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(abc.charAt(3)); 
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(abc.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		System.out.println("--4--");
		for(int i = 0; i<abc.length(); i++) {
		    System.out.println(abc.charAt(i));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		System.out.println("--5--");
		char ch='e';
		for(int i = 0; i<abc.length(); i++) {
		   if(ch==abc.charAt(i)) {
			   System.out.println("Char equals "+abc.charAt(i)+" at index "+i);
			   break;
			   
			   
		   }
		}
	}
}


