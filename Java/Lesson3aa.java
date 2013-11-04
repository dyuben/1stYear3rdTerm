import java.io.*;

public class Lesson3aa
{
	public static void main(String[] args)throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	double num1;
	System.out.print("Enter a number: ");
	num1 = Double.parseDouble(input.readLine());
	System.out.print("\nThe number entered is: " +num1);
	}
}