import java.util.Scanner;


public class HelloUser 
{
	public static String userName;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		Scanner scanIn = new Scanner(System.in);
	    userName = scanIn.nextLine();
	    scanIn.close();
	    greetUser();
	}
	
	public static void greetUser()
	{
		System.out.println("Hello " + userName + "!");	
	}

}
