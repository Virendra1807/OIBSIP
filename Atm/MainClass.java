package OasisInfoProjects.Atm;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin = 101010;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.print("Enter Atm Number : ");
        int atmnum = sc.nextInt();
        System.out.print("Enter Atm Pin : ");
        int pin = sc.nextInt();
        
        if(atmnumber == atmnum && atmpin == pin){
            System.out.println("Validation Process Completed");
            while(true){
                System.out.println("1 - Available Balance \n2 - Withdraw Amount");
                System.out.println("3 - Deposite Amount\n4 - View Ministatemet\n5 - Exit");
                System.out.print("Select An Optioon : ");
                int uch = sc.nextInt();
                switch(uch){
                    case 1: 
                            op.viewBalance();
                            break;
                    case 2:   
                            System.out.print("Enter Amount to Withdraw : ");
                            double withdrawAmount = sc.nextDouble();
                            op.withdrawAmount(withdrawAmount);
                            break;
                    case 3: 
                            op.depositeAmount();
                            break;
                    case 4:   
                            op.viewMiniStatement();
                            break;
                    case 5:
                        System.out.println("Collect Your ATM Card\nThanks For Using our ATM");
                        System.exit(0);
                    default:
                        System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm number or Atm Pin");
            System.exit(0);    
        }

        sc.close();
    }
}
