import java.io.*;
public class project {

// Login Menu
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in ));

        String Username = "";
        String password = "";
        String choose="";
        String shop="";
        String buy="";
        String cont="";
        int shopping=0;
        int login=0;
        int stillshopping=0;
        int products=0;

        while (login==0){
            System.out.print("Username: ");
            Username = input.readLine();
            System.out.print("Password: ");
            password = input.readLine();
            if (Username.equals("Admin") && password.equals("joevenxx")){
                login=1;
            }
            else{
               System.out.println("Access Denied");
               login=0;
            }
        }
        while(stillshopping==0){
        stillshopping=0;
        System.out.println("Choose [1] Shop [2] About Us [3] FaQ [4] Delete [other] Exit");
            System.out.print("Enter: ");
            choose = input.readLine();
            if (choose.equals("1") || choose.equals("2") || choose.equals("3")choose.equals("4")){
                shopping=0;
                

                if (choose.equals("1")){
                    while(shopping==0){
                    System.out.println("Choose: \n [1] Panic in the disco\n Prize 520php \n [2] Fall"
                            + "Out Boy \n Prize:520php \n [3] Paramore \n Prize: 600php \n [4] Meg and Dia "
                            + "\n Prize: 570php \n [5] Back to Main Menu");
                    System.out.print("Enter: ");
                    shop = input.readLine();

                        if (shop.equals("1") || shop.equals("2") || shop.equals("3") || shop.equals("4")){
                            System.out.print("Buy? [y/n]");
                            buy = input.readLine();
                            if (buy.equals("y")){
                                //add to cart
                                if (shop.equals("1")){
                                    products=products+520;
                                }else if(shop.equals("2")){
                                    products=products+520;
                                }else if(shop.equals("3")){
                                    products=products+600;
                                }else{
                                    products=products+570;
                                }
                                System.out.println("Total Prize: "+products+"php");
                                shopping=0;
                            }
                            else{
                               shopping=0;
                            }
                        }
                        else if(shop.equals("5")) {
                            shopping=1;
                            stillshopping=0;
                        }
                        else{
                            System.out.println("Wrong Input");
                            stillshopping=0;
                        }
                    }
                }
            else if(choose.equals("2")){
                System.out.println("Astrid Clothing Inc. \n WHY WE LOVE WHAT WE DO? \n"
                        + "Astrid Clothing Inc. is a clothing company that\n"
                        + "was made by a group of friends who just loves to\n"
                        + "sell Band Shirts Online.\n"
                        + "With the use of their IT Skills they manage to create\n"
                        + "a website that will sell Band Shirts from the Artists of\n"
                        + "PureVolume.\n \n Back? Choose yes to Back to Main Menu,\n"
                        + "otherwise the program will Exit.[y/n]");

                        cont = input.readLine();
                        if(cont.equals("y")) {
                            stillshopping=0;
                        }
                        else{
                            System.out.println("Thankyou");
                            stillshopping=1;
                        }
            }
            else if(choose.equals("3")){
                System.out.println("How Do I Place An Order? \n"
                        + "Ordering throug our shop is easy and safe. Once you have found the item you would like to purchase."
                        + "Follow the directions through the checkout process to complete your order");
                System.out.println("Payment & Shipping \n"
                        + "We gladly accept all major credit cards. Product shipping is absolutely free of charge.");
                System.out.println("Secure and Ordering \n"
                        + "Astrid Clothing Inc. ensures our customers details are secure and will not be released to any other party.");
                System.out.println("Returns & Refunds \n"
                        + "Our returns and refunds policy is limited to products purchased directly our Astrid Clothing Inc.");
                System.out.println("\n \n Back? Choose yes to Back to Main Menu,\n"
                        + "otherwise the program will Exit.[y/n]");
                        cont = input.readLine();
                        if(cont.equals("y")) {
                            stillshopping=0;
                        }
                        else{
                            System.out.println("Thankyou");
                            stillshopping=1;
                        }
            }
            else{
                System.out.println("Thankyou");
                shopping=1;
                stillshopping=1;
            }
          }
          else{
                System.out.println("Thankyou");
                shopping=1;
                stillshopping=1;
            }
        
        }
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
