import java.io.*;
import java.util.*;

	public class prelim2
	{
		public static void main(String[] args)throws Exception
		{
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			
			int even = 0, odd = 0;
			int num, num1;
			String numx="";	
			
			System.out.print("Enter a number: ");
			num = Integer.parseInt(input.readLine());
			
			while (num>0)
			{
				//numx = numx + (num%10);
				num = num / 10;
				num1 = num % 2;
				
				if (num1==0)
				{
					odd++;
				}
				else
				{
					even++;
				}
			}
			
			
			System.out.println("Even: " +even);
			System.out.println("Odd: " +odd);
		}	
	}
