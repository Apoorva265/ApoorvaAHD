package projectjava1;
import java.util.Scanner;
public class Input1 
    {
	public static void main (String args[])
	{
		int num;
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		str = in.nextLine();
		System.out.println("Your name: " + str);
		
		System.out.println("Enter your age:");
		num = in.nextInt();
		System.out.println("Your age: " + num);
		in.close();
		}
	}