import java.util.Scanner;
class JavaKaDhaba 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String foodItems = "";
		double totalBill = 0;
		
		System.out.println("                          *** WELCOME***");
		System.out.println("                           JAVA KA DHABA");
        System.out.println("");
		
		
		//infinite loop for main menu
		for(  ;   ;  )
		{
			System.out.println("MENU   1.VEG   2.NON-VEG    3.Checkout     4.Logout");
			System.out.print("Enter your Option: ");
			int option = sc.nextInt();
			System.out.println("");
			
			//if block is for veg menu
			if(option==1){
				System.out.println("******VEG MENU*******");
				//infinite loop for veg menu loop will break if user enters 5
				for(  ;  ;  ){
					System.out.println("1.PANEER TIKKA  2.KAJU CURRY   3.VEG-BIRYANI   4.VEG KOFTA   5.MAIN MENU");
					System.out.println("");
					System.out.print("enter your Option: ");
					int option1 = sc.nextInt();
					if(option1==1)
					{
						foodItems += "Paneer Tikka : 250 ,";
						totalBill += 250;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==2)
					{
						foodItems += "Kaju Curry : 280 ,";
						totalBill += 280;
						System.out.println("your order has been added to cart.");
					}
					if(option1==3)
					{
						foodItems += "Veg Biryani : 180 ,";
						totalBill += 180;
						System.out.println("your order has been added to cart.");
					}
					if(option1==4)
					{
						foodItems += "Veg Kofta : 210 ,";
						totalBill += 210;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==5)
					{
						break; 
					}
	             }
	          
			}
			  
			else if(option==2) {
				    System.out.println("********NON-VEG MENU*********");
				
				//infinite loop for non veg menu loop will break on entering option 5
				for(  ;  ;  ){
					System.out.println("1.BUTTER CHICKEN   2.CHICKEN MASALA   3. CHICKEN BIRYANI   4.FISH   5.MAIN MENU");
				    System.out.println(" ");
					System.out.print("Enter your Option: ");
					int option1 = sc.nextInt();
					if(option1==1)
					{
						foodItems += "Butter Chicken  : 300 ,";
						totalBill += 300;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==2)
					{
						foodItems += "Chicken Masala : 270 ,";
						totalBill += 270;
						System.out.println("your order has been added to cart.");
					}
					if(option1==3)
					{
						foodItems += "Chicken Biryani : 200 ,";
						totalBill += 200;
						System.out.println("your order has been added to cart.");
					}
					if(option1==4)
					{
						foodItems += "Fish : 400 ,";
						totalBill += 400;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==5)
					{
						break; 
					}
				}
			}
					
			else if(option==3)
			{
				System.out.println("********YOUR TOTAL BILL**********.");
				System.out.println("");
				System.out.println("your purchased items below.");
				System.out.println(foodItems);
				System.out.println("Total Bill :"+ totalBill+"rs");
				if(totalBill>=2000){
					System.out.println("you got a discount of 20%.");
					System.out.println("your bill is : "+(totalBill-((totalBill/100)*20)));
				}
				else if(totalBill>=1000){
					System.out.println("you got a discount of 10%.");
					System.out.println("your bill is : "+(totalBill-((totalBill/100)*10)));
				}
				else if(totalBill>=500){
					System.out.println("you got a discount of 5%.");
					System.out.println("your bill is : "+(totalBill-((totalBill/100)*5)));
				}
		  }
			else if(option==4){
				System.out.println("THANK YOU VISIT AGAIN");
				break;
			}
			System.out.println();
				
			  
	}
						}
	}
	
	
	
	
	

