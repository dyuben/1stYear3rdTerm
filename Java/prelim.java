import java.io.*;
import java.util.*;
	
public class prelim
{
	public static void main(String[] args)throws Exception
	{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	
	int thou, fhund, hund, fifty, twenty, tens, five, peso;
	double twentyf;
	float money;
	
	System.out.print("Enter cash: ");
	money = Float.parseFloat(input.readLine());
	
	thou = (int)money/1000;
	money = money%1000;
	fhund = (int)money/500;
	money = money%500;
	hund = (int)money/100;
	money = money%100;
	fifty = (int)money/50;
	money = money%50;
	twenty = (int)money/20;
	money = money%20;
	tens = (int)money/10;
	money = money%10;
	five = (int)money/5;
	money = money%5;
	peso = (int)money/1;
	money = money%1;
	twentyf = money/0.25;
	money = money%(float)0.25;
	
	System.out.println("1000: " +thou);
	System.out.println("500: " +fhund);
	System.out.println("100: " +hund);
	System.out.println("50: " +fifty);
	System.out.println("20: " +twenty);
	System.out.println("10: " +tens);
	System.out.println("5: " +five);
	System.out.println("1: " +peso);
	System.out.println(".25: "+(int)twentyf);
	}
}