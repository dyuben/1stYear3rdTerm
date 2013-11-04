import java.io.*;

public class Activity1

{
	public static void main(String[] args)throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int sum, product,diff,num1,num2;
	double quotient;
	System.out.print("Enter first number: ");
	num1 = Integer.parseInt(input.readLine());
	System.out.print("\nEnter second number: ");
	num2 = Integer.parseInt(input.readLine());

	sum = num1 + num2;
	diff = num1 - num2;
	product = num1 * num2;
	quotient = (double)num1 / (double)num2;

	System.out.print("\n\nThe sum of two numbers is: " +sum);
	System.out.print("\n\nThe difference of two numbers is: " +diff);
	System.out.print("\n\nThe product of two numbers is: " +product);
	System.out.print("\n\nThe quotient of two numbers is:" +quotient);
	
	}
}
	