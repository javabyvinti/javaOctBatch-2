import java.util.Scanner;

class ScannerInput{


	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);	//constructor
	
	System.out.println("Enter your first value");
	int value1 = obj.nextInt();
	
	//String --> obj.next(); Long--> obj.nextLong();

	System.out.println("Enter your second value");

	int value2 = obj.nextInt();
	int result = value1 + value2;
	
	System.out.println("Result is= "+result);

	}

}