package atm;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {


		        
				int pin = 1234;
				int balance = 10000;
				
				int AddAmount = 0;
				int TakeAmount = 0;   
				
				String name;

				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter your pin number");
				int password = scanner.nextInt();
				
				if(password==pin)
				{
				System.out.println("Enter your name");
				name = scanner.next();
				System.out.println("Welcome"+ name);
				
				while(true) 
				{
					System.out.println("press 1 to check your balance");
					System.out.println("press 2 to add amount");
					System.out.println("press 3 to take amount");
					System.out.println("press 4 to take receipt");
					System.out.println("press 5 to EXIT");
					
					int opt = scanner.nextInt();
					switch(opt)
					{
					case 1:
					   System.out.println("your current balance is" + balance);
					   break;
					
					case 2:
					   System.out.println("How much amount did you want to ADD to your account");
					   AddAmount = scanner.nextInt();
					   System.out.println("successfully credited");
					   balance = AddAmount + balance;
				       break;
				       
					case 3:
					   System.out.println("How much amount did you want to take");
					   TakeAmount = scanner.nextInt();
					   if(TakeAmount>balance)
					   {
						   System.out.println("successfully taken");
						   balance = balance - TakeAmount;
						   
					   }
					   else {System.out.println("your balace is less than" +balance);
					   
					   }
					  break;
					  
					  
					   
					   
					case 4:
						System.out.println("Welcome to All in one mini ATM");
						System.out.println("Avaliable balance is" + balance);
						System.out.println("Amount deposited"     + AddAmount);
						System.out.println("Amount taken"         +TakeAmount);
						break;	   
						
					}
					
					if(opt == 5) {
						System.out.println("Thankyou");
						break;
					}
					
				}
				}
				
				else {
					System.out.println("wrong pin number");
				}
			}
			

		

	}


