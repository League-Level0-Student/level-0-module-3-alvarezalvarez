
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 6th";
		String dadsBirthday = "November 1th";
		String myBirthday = "April 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("What birthday do you want? - mom, dad, or your"); 
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, answer+ "'s birthday is...");
		// 4. if user asked for "mom"
			//print mom's birthday
		if(answer.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(answer.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(answer.equalsIgnoreCase("jc")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i dont remeber that person's birthday.");
		}
	} 
}
