public class Lesson2
{
	public static void main (String [] args) throws Exception
	{
	char char1, char2;
	System.out.print("Enter a character: ");
	char1=(char) System.in.read();
	System.in.read();System.in.read();
	System.out.print("\nEnter another character: ");
	char2=(char) System.in.read();
	System.in.read();System.in.read();
	System.out.print("\nThe Character entered are " +char1 +" & " +char2);
	}
}