import java.util.Scanner;

public class IT24103034Lab7Q1A {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter mark four subjects :");

		System.out.print("Enter Subject Mark 1 :");
		int mark1=input.nextInt();

		System.out.print("Enter Subject Mark 2 :");
		int mark2=input.nextInt();


		System.out.print("Enter Subject Mark 3 :");
		int mark3=input.nextInt();

		
		System.out.print("Enter Subject Mark 4 :");
		int mark4=input.nextInt();
		
		int marks =mark1+mark2+mark3+mark4;
		double average=marks/4.0;

		System.out.println("Average is:"+average);

		if(average<=100 && average>=75)
		{
			System.out.print("Overall Grade is : Distinction");
		}

		else if(average<=74 && average>=50)
		{
			System.out.print("Overall Grade is : Credit");
		}

		else
		{
			System.out.print("Overall Grade is : Fail");
		}
	}
}





		

