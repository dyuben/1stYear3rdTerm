import java.io.*;

public class Lesson3a
{
	public static void main(String[] args)throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int num1;
	System.out.print("Enter a number: ");
	num1 = Integer.parseInt(input.readLine());
	System.out.print("\nThe number entered is: " +num1);
	}
}