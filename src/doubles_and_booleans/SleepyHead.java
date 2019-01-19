package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation = false;
        boolean isWeekday1 = false, isVacation1 = true;
        
       
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
      int sleep =  JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
      int sleep1 =  JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);
        if(sleep==0) {
        	 isWeekday1 = true;
        	 isVacation1 = false;
        	 
        }
        if(sleep==1) {
        isWeekday1 = false;
    	 	isVacation1 = true;
        }
        if(sleep1==0) {
       	
       	 isVacation1 = true;
       	 
       }
       if(sleep1==1) {
      
   	 	isVacation1 = false;
       }
       if(isVacation1==true && isWeekday1==false) {
    	  JOptionPane.showMessageDialog(null, " Sleep in");
       }
       if(isVacation1==false && isWeekday1==true) {
    	   JOptionPane.showMessageDialog(null, "get up lazy bones");
       }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
