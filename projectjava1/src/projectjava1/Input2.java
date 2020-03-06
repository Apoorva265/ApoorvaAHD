package projectjava1;
import java.util.Scanner;

public class Input2 
{
	public static void main(String args[])
	{
	  int num;
	  String str;
	  Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Patient's name: ");
	str = in.nextLine();
	System.out.println("Patient's name: " + str);
	
	System.out.println("Enter Patient's age:");
	num = in.nextInt();
	System.out.println("Patient's age: " + num);
	
	int x=0;
	if (x>60) {
		System.out.println("Senior Citizen");
	}
	else {
		System.out.println("Not Senior Citizen");
	}
	
	System.out.println("Hello " + str);
	in.close();
	}
}