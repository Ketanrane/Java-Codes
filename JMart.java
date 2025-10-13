
//Created By Ketan Rane

import java.util.Scanner;
import java.util.ArrayList;

class JMart
{
	static Scanner sc = new Scanner(System.in);
	static String username ; //null
	static String contact ;  //null
	static String password ; //null
	static String address;   //null
	static ArrayList<String> cart = new ArrayList<>();
	static double totalBill; // 0.0

	public static void main(String[] args) 
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println
			("      *!*!*!*😊  Welcome To JMart  😊*!*!*!*  ");
			System.out.println();
			System.out.println("1. Existing Account");
			System.out.println("2. Create Account");
			System.out.println();
			System.out.print("Enter Option : ");
			int option = sc.nextInt();

			switch(option)
			{
				case 1: {
					loginPage();
					break;
				}
				case 2: {
					createAccountpage();
					break;
				}
				default: {
					System.out.println("Wrong Option Entered !!");
					break;
				}
			}
		}	
	}
	public static void loginPage()
	{
		if(username != null)
		{
			for (int i = 1; i <= 3 ;i++ ) 
			{
				System.out.println();
				System.out.println("*!*!*  Login Module  *!*!*");
				System.out.println();
				System.out.print("username / contact : ");
				sc.nextLine();
				String username2 = sc.nextLine();
				System.out.print("Password : ");
				String password2 = sc.nextLine();
				if(((username.equals(username2)) 
					|| (contact.equals(username2))) 
					&& (password.equals(password2)))
				{
					System.out.println();
					System.out.println("Login Successful !!");
					homepage();
				}
				else
				{
					System.out.println();
					System.out.println("Wrong CRED Entered");
					return;
				}	
			}
		System.out.println();
		System.out.println("Never Visit Again !!");
		}

	}
	public static void createAccountpage()
	{
		System.out.println();
		System.out.println("Create Account Module !!");
		System.out.println();
		System.out.print("Enter username : ");
		sc.nextLine();
		username = sc.nextLine();

		System.out.print("Enter Your Contact : ");
		contact = sc.next();

		System.out.print("Enter Your password : ");
		password = sc.next();

		System.out.print("Enter your Address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		System.out.println("Account created Successfully !!");
		System.out.println();
	}
	public static void homepage()
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" *!*!* Home Page *!*!*");
			
			System.out.println("1. Electronic ");
			System.out.println("2. Clothing ");
			System.out.println("3. FootWeare ");
			System.out.println("4. Cart ");
			System.out.println("5. Logout ");
			System.out.println();
			System.out.println("Enter Your Option !!");
			int option = sc.nextInt();


			switch(option)
			{
				case 1 : {
					electronicsPage();
					break;
				} 
				case 2 : {
					clothingPage();
					break;
				} 
				case 3 : {
					footwearePage();
					break;
				}	
				case 4 : {
					cartPage();
					break;
				}	
				case 5 : {
					System.exit(0);
				}
				default : {
					System.out.println("Wrong option Entered !! ");
					break;
				}
			}
		}
	}
	public static void electronicsPage()
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" ----Electronic----");
			System.out.println();
			System.out.println("1. Mobile (101)");
			System.out.println("2. Laptop (102)");
			System.out.println("3. SmartWatch (103)");
			System.out.println("4. Camera (104)");
			System.out.println("5. Homepage (0)");
			System.out.println();
			System.out.print("Enter the Product Id : ");
		    int productId =  sc.nextInt();

		    switch (productId) 
		    {
		    	case 101 : {
		    		cart.add("Mobile : 40000/-");
		    		totalBill += 40000;
		    		System.out.println("Mobile Added Inside the cart !!");
		    		break;
		    	}
		    	case 102 : {
		    		cart.add("Laptop : 80000/-");
		    		totalBill += 80000;
		    		System.out.println("Laptop Added Inside the cart !!");
		    		break;
		    	}
		    	case 103 : {
		    		cart.add("SmartWatch : 10000/-");
		    		totalBill += 10000;
		    		System.out.println("SmartWatch Added Inside the cart !!");
		    		break;
		    	}
		    	case 104 : {
		    		cart.add("Camera : 150000/-");
		    		totalBill += 150000;
		    		System.out.println("Camera Added Inside the cart !!");
		    		break;
		    	}
		    	case 0 : {
		    		return;
		    	}
		    	default: {
		    		System.out.println("Please Enter the correct ProductId !");
		    		break;
		    	}
		    }
		}
	}
	public static void clothingPage()
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" ---- Clothing ----");
			System.out.println();
			System.out.println("1. Shirt (105)");
			System.out.println("2. Jacket (106)");
			System.out.println("3. Hoodie (107)");
			System.out.println("4. Jeans (108)");
			System.out.println("5. Homepage (0)");
			System.out.println();
			System.out.print("Enter the Product Id : ");
		    int productId =  sc.nextInt();

		    switch (productId) 
		    {
		    	case 105 : {
		    		cart.add("Shirt : 2000/-");
		    		totalBill += 2000;
		    		System.out.println("Shirt Added Inside the cart !!");
		    		break;
		    	}
		    	case 106 : {
		    		cart.add("Jacket : 10000/-");
		    		totalBill += 10000;
		    		System.out.println("Jacket Added Inside the cart !!");
		    		break;
		    	}
		    	case 107 : {
		    		cart.add("Hoodie : 1500/-");
		    		totalBill += 1500;
		    		System.out.println("Hoodie Added Inside the cart !!");
		    		break;
		    	}
		    	case 108 : {
		    		cart.add("Jeans : 5000/-");
		    		totalBill += 5000;
		    		System.out.println("Jeans Added Inside the cart !!");
		    		break;
		    	}
		    	case 0 : {
		    		return;
		    	}
		    	default: {
		    		System.out.println("Please Enter the correct ProductId !");
		    		break;
		    	}
		    }
		}
	}
	public static void footwearePage()
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" ---- FootWeare ----");
			System.out.println();
			System.out.println("1. Sneakers (109)");
			System.out.println("2. RunningShoes (110)");
			System.out.println("3. LoferShoes (111)");
			System.out.println("4. Crocks (112)");
			System.out.println("5. Homepage (0)");
			System.out.println();
			System.out.print("Enter the Product Id : ");
		    int productId =  sc.nextInt();

		    switch (productId) 
		    {
		    	case 109 : {
		    		cart.add("Sneakers : 25000/-");
		    		totalBill += 25000;
		    		System.out.println("Sneakers Added Inside the cart !!");
		    		break;
		    	}
		    	case 110 : {
		    		cart.add("RunningShoes : 15000/-");
		    		totalBill += 15000;
		    		System.out.println("RunningShoes Added Inside the cart !!");
		    		break;
		    	}
		    	case 111 : {
		    		cart.add("LoferShoes : 8000/-");
		    		totalBill += 8000;
		    		System.out.println("LoferShoes Added Inside the cart !!");
		    		break;
		    	}
		    	case 112 : {
		    		cart.add("Crocks : 1500/-");
		    		totalBill += 1500;
		    		System.out.println("Crocks Added Inside the cart !!");
		    		break;
		    	}
		    	case 0 : {
		    		return;
		    	}
		    	default: {
		    		System.out.println("Please Enter the correct ProductId !");
		    		break;
		    	}
		    }
		}
	}
	public static void cartPage()
	{
		ArrayList<String> cart1 = new ArrayList<>(cart);

		for (; ; ) 
		{
			System.out.println();
			System.out.println("---- Cart ----");
			System.out.println("---- Your Purchased ----");
			for (String product : cart1) 
			{
				System.out.println(product);		
			}
			System.out.println();
			System.out.println(username + "Your Total Bill is : "+totalBill);
			System.out.println();
			System.out.println("Do You Want To Remove Some Product (yes/no)");
			String opt1 = sc.next();

			if(opt1.equals("yes"))
			{
				System.out.println("Enter the Product Name : ");
				String productName = sc.next();
				int indx = 0;
				for (String product : cart ) 
				{
					String [] arr = product.split(" ");
					if(arr[0].equalsIgnoreCase(productName))
					{
						cart.remove(indx);
						totalBill -= Double.parseDouble(arr[2]);
						System.out.println();
						System.out.println("Removed "+productName+" From Your cart ");
						System.out.println();
					}
					indx++;
					
				}
			}
			System.out.println();
			System.out.println("Do You Want To Check Out (yes/no");
			String opt = sc.next();
			if(opt.equals("yes"))
			{
				System.out.println("ThankYou Visit Again !!");
			}
			else
			{
				return;
			}
		}
	}
}
