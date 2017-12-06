import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog("What is a tree you can carry in your hand?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer1.equals("a palm")) {
			score++;
			JOptionPane.showMessageDialog(null, "Corect!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
		}
		// 6. Add some more riddles

		String answer2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if (answer2.equals("a stamp")) {
			score++;
			JOptionPane.showMessageDialog(null, "Corect!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorect");
		}

		String answer3 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		if (answer3.equals("a coin")) {
			score++;
			JOptionPane.showMessageDialog(null, "Corect!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
		}
		String answer4 = JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die. What am I?");
		if (answer4.equals("fire")) {
			score++;
			JOptionPane.showMessageDialog(null, "Corect!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
