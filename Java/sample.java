import java.io.*;
import java.util.*;

public class sample
{
	public static void main(String args[])throws Exception
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int[] grades = new int [5];
		for (int x = 0;x<5;x++)
		{
			System.out.print("Enter a number: ");
			grades[x]=Integer.parseInt(input.readLine());
		}
		for(int y = 0;y<5;y++)
		{
			System.out.println("numbers are: "+grades[y]);
		}
	}
}