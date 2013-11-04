import java.io.*;
public class Lesson3

{
	public static void main(String[] args) throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader (System.in));
	String name;
	System.out.print("Enter your name: ");
	name=input.readLine();
	System.out.print("\nThe name entered: " +name);
	}
}