import java.io.*;
public class ShoeSalon
{
	//Auto number
	public static String generate_id() throws IOException
  {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	FileOutputStream out;
    	PrintStream p;
	String ID=null;
	int a = 1;
	String Record;
	try
		{
			FileInputStream FI = new FileInputStream("ID.txt");
    			DataInputStream DI = new DataInputStream(FI);
			out = new FileOutputStream("ID.txt", true);
            p = new PrintStream(out);
			while(DI.available()!=0)
			{
				Record = DI.readLine();
				a+=1;
			}
			ID=String.valueOf(a);
            //write in file
            p.println(ID);
            p.close();
            }
                catch (Exception e)
                {
                        System.err.println ("Error writing ID");
                }

           return ID;
  }

//Add Function
public static void Add() throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	FileOutputStream out;
    PrintStream p;
	String transc, ELast, EFirst,Sname, Ssize, qty;
	try
		{
			out = new FileOutputStream("myFile.txt", true);
            p = new PrintStream( out );
            System.out.print("Transaction Number: ");
            transc = "00" + generate_id();
      		System.out.println(transc);
            System.out.print("Enter Last Name: ");
            ELast = input.readLine();
            System.out.print("Enter First Name: ");
            EFirst = input.readLine();
            System.out.print("Shoe Name: ");
            Sname = input.readLine();
            System.out.print("Shoe Size: ");
            Ssize = input.readLine();
            System.out.print("Quantity: ");
            qty = input.readLine();

            //write in file
            p.println(transc);
            p.println(ELast);
            p.println(EFirst);
            p.println(Sname);
            p.println(Ssize);
            p.println(qty);
            p.close();
            }

                catch (Exception e)
                {
                        System.err.println ("Error writing to file");
                }

}


//SearchDelete
public static void Delete() throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	try
		{
			FileInputStream FI = new FileInputStream("myfile.txt");
    		DataInputStream DI = new DataInputStream(FI);

    		FileOutputStream out;
    		PrintStream p;
    		out = new FileOutputStream("temp.txt");
            p = new PrintStream( out );
    		String transc, Record, Choice;
    		int Found =0;

    		System.out.print("Enter Transaction Number: ");
    		transc = input.readLine();
    		while(DI.available()!=0)
    			{
    				Record = DI.readLine();
    				if(transc.equals(Record))
    				{
    					System.out.println("Record found. Delete?[Y/N]?");
    					Choice = input.readLine();
    					Choice = Choice.toUpperCase();
						if(Choice.equals("Y"))
						{
      						DI.readLine();
      						DI.readLine();
      						DI.readLine();
      						DI.readLine();
      						DI.readLine();
      						Found = 1;
						}
						else
							p.println(Record);
    				}
    				else
    				{
    				p.println(Record);
    				}
    			}
    			if(Found <=0)
    			{
    				System.out.println("No Record");
    			}
    		p.close();
    		DI.close();

    		//delete old file
    			File file = new File("myFile.txt");
    			file.delete();
    		//saving edited file
    			File oldFile = new File("temp.txt");
    			oldFile.renameTo(new File("myFile.txt"));
  		}
  	catch(Exception e)
  		{
    		System.out.println("File input error");
    	}
}

//Edit Function

public static void Edit() throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	try
		{
			FileInputStream FI = new FileInputStream("myfile.txt");
    		DataInputStream DI = new DataInputStream(FI);

    		FileOutputStream out;
    		PrintStream p;
    		out = new FileOutputStream("temp.txt");
            p = new PrintStream( out );
    		String transc, Record, Choice, transc2, ELast, EFirst, Sname, Ssize, qty;
    		int Found =0;

    		System.out.print("Enter Transaction Number: ");
    		transc = input.readLine();
    		while(DI.available()!=0)
    			{
    				Record = DI.readLine();
    				if(transc.equals(Record))
    				{
    					System.out.println("Record found. Edit?[Y/N]?");
    					Choice = input.readLine();
    					Choice = Choice.toUpperCase();
						if(Choice.equals("Y"))
						{
			System.out.println("Transaction Number: " + transc);
            System.out.print("Enter Last Name: ");
            ELast = input.readLine();
            DI.readLine();
            System.out.print("Enter First Name: ");
            EFirst = input.readLine();
            DI.readLine();
            System.out.print("Shoe Name: ");
            Sname = input.readLine();
            DI.readLine();
            System.out.print("Shoe Size: ");
            Ssize = input.readLine();
            DI.readLine();
            System.out.print("Quantity: ");
            qty = input.readLine();
            DI.readLine();

            //write in file
            p.println(transc);
            p.println(ELast);
            p.println(EFirst);
            p.println(Sname);
            p.println(Ssize);
            p.println(qty);
      						Found = 1;
						}
						else
							p.println(Record);
    				}
    				else
    				{
    				p.println(Record);
    				}
    			}
    			if(Found <=0)
    			{
    				System.out.println("No Record");
    			}
    		p.close();
    		DI.close();

    		//delete old file
    			File file = new File("myFile.txt");
    			file.delete();
    		//saving edited file
    			File oldFile = new File("temp.txt");
    			oldFile.renameTo(new File("myFile.txt"));
  		}
  	catch(Exception e)
  		{
    		System.out.println("File input error");
    	}
}

//ViewRecord
public static void View() throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	int a=0;
	try
		{
			FileInputStream FI = new FileInputStream("myfile.txt");
    		DataInputStream DI = new DataInputStream(FI);

    		while(DI.available()!=0)
    			{
    				System.out.println("Transaction Number: " + DI.readLine());
    				a+=1;
    				System.out.println("Last Name: " + DI.readLine());
    				a+=1;
    				System.out.println("First Name: " + DI.readLine());
    				System.out.println("Shoe Name: " + DI.readLine());
    				System.out.println("Shoe Size: " + DI.readLine());
    				System.out.println("Quantity: " + DI.readLine());
    				System.out.println("");
    			}
		if(a<=1)
		{
			System.out.println("No record");
		}
    		DI.close();
  		}
  	catch(Exception e)
  		{
    		System.out.println("File input error");
    	}
}

//Main Menu Function
public static void MainMenu() throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	String Choice;
	int choose = 0;
	do
	{
	System.out.println("\nAdd   [A] \n\nEdit  [E] \n\nView  [V] \n\nDelete[D]  \n\n\n\t\t\t\t\t\t\t\tEXIT[X] ");
	System.out.print("Choose:  ");
	Choice = input.readLine();
	 Choice = Choice.toUpperCase();
		if(Choice.equals("A"))
		{
		System.out.println("Adding");
		Add();
		}
		else if(Choice.equals("E"))
		{
		System.out.println("Editing");
		Edit();
		}
		else if(Choice.equals("V"))
		{
		System.out.println("Viewing");
		View();
		}
		else if(Choice.equals("D"))
		{
		System.out.println("Deleting");
		Delete();
		}
		else if(Choice.equals("X"))
		{
		System.out.println("\n\n\nTHANK YOU!");

		choose = 1;
		}
		else
		{
			System.out.println("Error");
		}
	}while(choose<=0);
System.in.read();
}


//Main Function
public static void main(String[] args) throws Exception
{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));
	String Username;
	String Password;

	int choose=1;
	do
	{
	System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t\t*SHOE SALON*\n\n\n\n");

	System.out.print("Username: ");
	Username = input.readLine();
	System.out.print("\nPassword: ");
	Password = input.readLine();
	if((Username.equals("Admin")) && (Password.equals("123456")))
	{
		System.out.println("\t\t\tWELCOME!");
		MainMenu();
	}
	else if ((Username.equals("")) && (Password.equals("")))
	{
		System.out.println("\n\nWRONG INPUT!");
		choose = 0;
	}
	else
{
		System.out.println("WRONG INPUT PLEASE RE LOGIN");
System.in.read();
}
System.in.read();
	}while(choose>=1);
}
}