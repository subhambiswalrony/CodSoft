/* write a program in JAVA to create ATM to check the balance, deposit and withdraw money */

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;
        System.out.print("Enter your ATM pin: ");
        int pin = sc.nextInt();
        int balance = 5000;
        boolean breakLoop = false;
        while(! breakLoop){
            if (pin == password) {
                System.out.print("1 == balance\n2 == withdraw balance\n3 == deposit balance\n4 == exit\n\n");
                try {
                    System.out.print("Please enter your choice: ");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.println("your balance is: " + balance);
                        break;
                    }
                    if (option == 2) {
                        System.out.print("Enter your withdraw amount: ");
                        int withdrawAmount = sc.nextInt();
                        balance = balance - withdrawAmount;
                        System.out.println(withdrawAmount + " is debited from your bank account.");
                        System.out.println("Now your current balance is: " + balance);
                        break;
                    }
                    if (option == 3) {
                        System.out.print("Enter your deposit amount: ");
                        int depositAmount = sc.nextInt();
                        balance = balance + depositAmount;
                        System.out.println(depositAmount + "is credited to your bank account.");
                        System.out.println("Now your current balance is: " + balance);
                        break;
                    }
                    if (option == 4) {
                        breakLoop = true;
                    }
                }
                catch (Exception e) {
                        System.out.print("Please enter your valid option.");
                }
            }
            else {
                System.out.println("Wrong pin");
                break;
            }
        }
    }
}