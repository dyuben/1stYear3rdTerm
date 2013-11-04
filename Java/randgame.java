import java.util.*;
import java.io.*;
public class randgame
{
public static void main(String[]args) throws Exception
{ 
BufferedReader input=new BufferedReader (new InputStreamReader(System.in));
Random rand = new Random();
int num1 = rand.nextInt(10)+1;
int num = 0;
System.out.print("Enter number: " +num1);
num = Integer.parseInt (input.readLine());

if (num==num1)
System.out.print("WAGI KA! WINNER!");
	else if (num>num1)
	{
	System.out.println("LOWER KAYA!");
	System.out.print("Enter number: ");
	num = Integer.parseInt (input.readLine());
	
		if (num<num1)
		{
		System.out.println("HIGHER KAYA!");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER KA!");
		else
		System.out.print("WAGI KA! WINNER!");
		}
		else if (num==num1)
		{
		System.out.print("WAGI KA! WINNER!");
		}
		else if (num>num1)
		{
		System.out.println("LOWER KAYA!");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER KA!");
		else
		System.out.print("WAGI KA! WINNER!");
		}
		else if (num==num1)
		{
		System.out.print("WAGI KA! WINNER!");
		}
	}

	else if (num<num1)
	{
	System.out.println("HIGHER KAYA!");
	System.out.print("Enter number: ");
	num = Integer.parseInt (input.readLine());
	
		if (num>num1)
		{
		System.out.println("LOWER KAYA!");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER KA!");
		else
		System.out.print("WAGI KA! WINNER!");
		}
		else if (num==num1)
		{
		System.out.print("WAGI KA! WINNER!");
		}
		
		else if (num<num1)
		{
		System.out.println("HIGHER KAYA!");
		System.out.print("Enter number: ");
		num = Integer.parseInt (input.readLine());
		if(num!=num1)
		System.out.println("LOSER KA!");
		else
		System.out.print("WAGI KA! WINNER!");
		}
		else if (num==num1)
		{
		System.out.print("WAGI KA! WINNER!");
		}
	}
}
}