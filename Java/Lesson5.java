import java.util.*;

public class Lesson5
{
	public static void main(String[]arg)
	{
	
	Random rand = new Random();
	int face = rand.nextInt(2) + 1;

	if (face == 1)
	System.out.print("heads");
	else
	System.out.print("tails");
	}
}