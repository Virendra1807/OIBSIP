package OasisInfoProjects.Atm;

import java.util.*;

public class AtmOperationImpl implements AtmOperationInterface {

    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    @Override
    public void viewBalance() {
        System.out.println("\nAvailable Balance is : " + atm.getBalance()+"\n");
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (atm.getBalance() >= withdrawAmount) {
                System.out.println(" \nCollect the Cash : " + withdrawAmount);
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("\nInsufficient Balance !\n");
            }
        }
        else{
            System.out.println("\nPlease Enter the Amount in Multipal of 500\n");
        }
    }

    @Override
    public void depositeAmount() {
        System.out.print("Enter Amount to Deposite : ");
        double depositeAmount = sc.nextDouble();
        atm.setBalance(atm.getBalance() + depositeAmount);
        System.out.println();
        ministmt.put(depositeAmount, " Amount Deposited");
        System.out.println("Amount $" + depositeAmount + " Deposited Successfully");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        System.out.println();
        for (Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        System.out.println();
    }

}
