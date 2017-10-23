import java.util.Scanner;


class IfElse{

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your first value");
		int value1 = scanner.nextInt();
		

		System.out.println("Enter your second value");
		int value2 = scanner.nextInt();

		System.out.println("Enter your third value");
		int value3 = scanner.nextInt();


		if(value1 > value2 && value1 > value3)
				
			System.out.println("Value1 is greater");
			
		else if(value2 > value3)
		
			System.out.println("Value2 is greater");
		
		else if(value3 > value2)
		
			System.out.println("Value3 is greater");
		
		
		else if(value1==value2 || value1==value3 || value2==value3)
			System.out.println("Values are equal");
		

	}

}