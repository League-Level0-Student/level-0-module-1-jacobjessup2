//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String JacobJ = "Teleportation";
String JacobP = "To succ people and gain their abilities";
String Derek = "The power of god and anime";
String Keller = "Telekinesis";
String Sanchitha = "To read peoples minds";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String name= JOptionPane.showInputDialog("Enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("JacobJ")){
	JOptionPane.showMessageDialog(null, "Your power is "+ JacobJ);}
if(name.equals("JacobP")){
	JOptionPane.showMessageDialog(null, "Your power is "+ JacobP);}
if(name.equals("Derek")){
	JOptionPane.showMessageDialog(null, "Your power is "+ Derek);}
if(name.equals("Keller")){
	JOptionPane.showMessageDialog(null, "Your power is "+ Keller);}
if(name.equals("Sanchitha")){
	JOptionPane.showMessageDialog(null, "Your power is "+ Sanchitha);}

	
	
	
	
	}
}

