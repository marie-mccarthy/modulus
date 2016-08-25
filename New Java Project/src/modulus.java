import java.util.Scanner;

public class modulus
	{	
		public static void main(String[] args)
			{
		//	exercise1();
		//	exercise2();
			exercise3();
	//		exercise4();
			}
		public static int exercise1()
			{
			System.out.println("Input a number and I will tell you if it is odd or even");
			Scanner userInput2= new Scanner(System.in);
			int number1 = userInput2.nextInt();	
			if(number1%2==1)
				{
					System.out.println("odd");
				}
			else
				{
					System.out.println("even");
				}
			return number1;
			}
		public static int exercise2()
			{
			System.out.println("Input a year and I will tell you if it is a leap year or not.");
			Scanner userInput= new Scanner(System.in);
			int year = userInput.nextInt();	
			if (year%4==1)
				{
					System.out.println("not a leap year");
				}
			else
				{
					System.out.println("a leap year");
				}
			return year;
			}
		public static int exercise3()
			{
				int [] array = new int [13];
				
			}
	}