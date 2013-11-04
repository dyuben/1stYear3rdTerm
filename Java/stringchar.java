import java.io.*;
import java.util.*;

public class stringchar
{
	public static void main(String args[])throws Exception
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		char[] name = new char [6];
		for (char x = 0;x<6;x++)
		{
			System.out.print("Enter letters: ");
			name [x] = (char)System.in.read();
			System.in.read(); System.in.read();
			
		}
		for(char y = 0;y<1;y++)
		{
			System.out.println(name);
		}
		
	}
}