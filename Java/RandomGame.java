import java.io.*;
import java.util.*;


public class RandomGame
{
	public static void main(String[]args)throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();
	int num1 = rand.nextInt(10)+1;
	int num2 = 0;
	
	
	System.out.print("Enter a number: " +num1);
	num2 = Integer.parseInt(input.readLine());
	

if (num==num1)
System.out.print("WINNER!");
	else if (num>num1)
	{
	System.out.println("LOWER");
	System.out.print("Enter number: ");
	num = Integer.parseInt (input.readLine());
	
		if (num<num1)
		{
		System.out.println("HIGHER");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER");
		else
		System.out.print("WINNER");
		}
		else if (num==num1)
		{
		System.out.print("WINNER");
		}
		else if (num>num1)
		{
		System.out.println("LOSER");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER");
		else
		System.out.print("WINNER");
		}
		else if (num==num1)
		{
		System.out.print("WINNER");
		}
	}

}