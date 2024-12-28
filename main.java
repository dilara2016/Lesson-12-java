import java.util.Scanner;

public class main {
    public static void main(String[] args){
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];
        int option, size = 100;


        while (infiniteLoop){
            System.out.println("Welcome to Codingal Banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.println("6-> Quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option to proceed ahead: ");
            option = sc.nextInt();

            if (option == 1){
                System.out.println("\nAdd Customer \nMenu->");

                sc.nextLine();

                System.out.println("\nEnter Customer Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("ACcount created successfully. \n");
                System.out.println("Account Details: \n");
                System.out.println("Account Number: " + size);
                System.out.println("Account Name: "+ accountName[size]);
                System.out.println("Account Balance: "+ accountBalance[size] + "$\n");
                System.out.println("==================================");

                size = size + 1;
            } else if (option == 2){
                System.out.println("\nChange Customer Name Menu");
                System.out.println("\nEnter your Account Number: ");

                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size){
                    System.out.println("Account does not Exist. ");
                    System.out.println("Terminating...");
                } else {
                    temp = accountName[accountIndex];
                    System.out.println("Enter New Name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is succesfully updated from " + temp + " to" + name + ".\n");
                } 
            System.out.println("==================================");
            } else if (option == 3){

                System.out.println("\nCheck account balance menu");
                System.out.println("\nEnter your account number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size){
                    System.out.println("Account does Not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println(accountName[accountIndex] + " your balance is " + accountBalance[accountIndex] + "$.");
                }
            System.out.println("==================================");
            } else if (option == 4){
                System.out.println("\nUpdate Account Balance Menu");
                System.out.println("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if(accountIndex > size){
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println("Enter The Amount To Be Deposited: ");
                    double amt = sc.nextDouble();

                    accountBalance[accountIndex] += amt;
                    System.out.println(accountName[accountIndex] + " your updated balance is : " + accountBalance[accountIndex] + "$. \n");
                }
                System.out.println("==================================");
            }else if (option == 5){
                System.out.println("Accounts Registered\n");

                for (int i = 100; i < size; i++){
                    System.out.println("Account number: " + i + ", Name: " + accountBalance[i] + "$. \n");
                }
            System.out.println("==================================");
            } else if (option == 6){
                System.out.println("Terminating...");
                System.out.println("Developed & Managed by Codingal");
                infiniteLoop=false;
            } else {
                System.out.println("\n invalid input");
                System.out.println("terminating...");
                System.out.println("Developed & Managed by Codingal");
                System.exit(0);
            }
        }
    }
}