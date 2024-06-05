/*
write a program in JAVA to create ATM to check the balance, deposit and withdraw money by
creating checkbalance(), withdraw() and deposit() methods
*/

import java.util.Scanner;

class ATM {
    private int balance;
    public ATM(int initialbalance){
        balance = initialbalance;
    }
    public void checkBalance() {
        System.out.println("your balance is: " + balance);
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your withdraw amount: ");
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println(withdrawAmount + " is debited from your bank account.");
            System.out.println("Now your current balance is: " + balance);
        }else {
            System.out.println("Your amount is high.");
        }
    }
    public void  deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your deposit amount: ");
        int depositAmount = sc.nextInt();
        balance = balance + depositAmount;
        System.out.println(depositAmount + " is credited to your bank account.");
        System.out.println("Now your current balance is: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your initial balance: ");
        int initialbalance = sc.nextInt();
        int password = 1234;
        System.out.print("Enter your ATM pin: ");
        int pin = sc.nextInt();
        ATM atm = new ATM(initialbalance);
        while(true){
            if (pin == password){
                System.out.print("1 == balance\n2 == withdraw balance\n3 == deposit balance\n4 == exit\n\n");
                System.out.println("Enter your option: ");
                int option = sc.nextInt();
                try{
                    if (option == 1) {
                        atm.checkBalance();
                    }
                    if (option == 2) {
                        atm.withdraw();
                    }
                    if (option == 3) {
                        atm.deposit();
                    }
                    if (option == 4) {
                        System.out.print("Thank you for coming.");
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("Wrong pin");
                break;
            }
        }
    }
}
