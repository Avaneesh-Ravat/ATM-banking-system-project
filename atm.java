
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int pin=9876,option,entered_pin=1,count=0,amount=1;
		double balance=8765;
		int continue_transaction=1;
		
		
        System.out.println("======================Welcome to the Avaneesh Bank======================");
        while(pin!=entered_pin){
            System.out.println("Please enter your pin :");
            entered_pin=sc.nextInt();
            
            if(entered_pin!=pin){
                System.out.println("Invalid pin");
            }
            count++;
            if(count==3&& entered_pin!=pin){
                System.out.println("U have attemped all the 3 times of entry");
                System.exit(0);
            }
        }
        
        while(continue_transaction!=0){
            System.out.println("-----------------Available Transactions-----------------");
            System.out.println("1.Withdrawl");
            System.out.println("2.Deposit ");
            System.out.println("3.Check Balance ");
            System.out.println("4.Please select the option :");
            
            option=sc.nextInt();
            switch(option){
                case 1: System.out.println("Enter the amount:");
                amount=sc.nextInt();
                if(balance< amount){
                    System.out.println("Insufficient amount");
                    amount =1;
                    break;
                }
                else{
                    balance-=amount;
                    System.out.println("You have withdrawal "+ amount+"Your current balance is"+balance);
                    amount=1;
                    break;
                }
                case 2:System.out.println("Enter the amount:");
                amount=sc.nextInt();
                balance+=amount;
                System.out.println("You have deposited "+ amount+"Your current balance is"+balance);
                amount =1;
                break;
                
                case 3:System.out.println("Your balance is"+balance);
                break;
                
                default: System.out.println("Invalid option");  
                
            }
            System.out.println("Do you wish to perform another transaction ?Press 1[Yes], 0[No]");
            continue_transaction=sc.nextInt();
        }
        
	}
}
