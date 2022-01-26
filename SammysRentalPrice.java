import java.util.*;

public class SammysRentalPrice{

	public static void main(String[] args){
	// Company Logo with Ss pattern
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println("s                                              S");
		System.out.println("S     Sammy's makes it fun in the sun.         s");
		System.out.println("s                                              S");
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
	// Borrowed code to enter multiple inputs Credit Javatpoint.com
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
	System.out.print("Enter how many items you rented ie.  beach chairs, canoes, etc ");
	int a= sc.nextInt();
	System.out.print("How many hours did you rent the equipment? ");
	int b= sc.nextInt();
	System.out.print("Number of minutes if under and hour ie.  5 mins? ");
	int c= sc.nextInt();
	int d= a*b*60;
	int e= d+c;
System.out.println("Total= $" +e );
	}
}





