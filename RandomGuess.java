//Filename RandomGuess.java
//Written by Eric Johnson
//Written on 5-3-21
/* This is my first attempt at a random guess dialog box.*/

public class RandomGuess 
{
    public static void main(String [] args)
    {
	JOptionPane.showMessageDialog(null, "Guess a number between 1-10")
        JOptionPane.showMessageDialog(null,"The number is "+
        (1 + (int)(Math.random() * 10))); 
    }
}








