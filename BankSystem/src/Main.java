import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();
//        int ac_no = 1000;
        list.add(new Account("Sai", "Berhampur" , 5000));
        list.add(new Account("Ram", "Delhi", 6000));
        list.add(new Account("Anil", "Jammu", 1000));

        System.out.println("Select Operations to perform: ");
        System.out.println("1. Open Account ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Balance Enquiry ");
        System.out.println("5. List All Accounts ");
        System.out.println("6. Exit");
        int choice;
        int amt, ac_no;
        String name, city;
        boolean found;
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----Open Account-----");
                    System.out.print("Enter name : ");
                    name = sc.next();
                    System.out.print("Enter city : ");
                    city = sc.next();
                    System.out.print("Enter amount : ");
                    amt = sc.nextInt();


                    Account ac = new Account(name, city, amt);
                    list.add(ac);
                    System.out.println("---Account Created Successfully----");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-----Deposit Account-----");
                    found = false;
                    System.out.println("Enter Account Number");
                    ac_no = sc.nextInt();
                    for (Account s : list) {
                        if (ac_no == s.getCustomer_Acc_No()) {
                            found = true;
                            System.out.println("Customer Account Number: " + s.getCustomer_Acc_No());
                            System.out.println("Customer Name: " + s.getCustomer_Name());
                            System.out.println("Customer City: " + s.getCustomer_Address());
                            System.out.println("Customer Balance: " + s.getCustomer_Balance());

                            // enter amount to deposit
                            System.out.print("Enter the amount to deposit: ");
                            amt = sc.nextInt();
                            s.setCustomer_Balance(s.getCustomer_Balance() + amt);
                            System.out.println("Amount deposit successfully");
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("-----Withdraw Account-----");
                    found = false;
                    System.out.println("Enter Account Number");
                    ac_no = sc.nextInt();
                    for (Account s : list) {
                        if (ac_no == s.getCustomer_Acc_No()) {
                            found = true;
                            System.out.println("Customer Account Number: " + s.getCustomer_Acc_No());
                            System.out.println("Customer Name: " + s.getCustomer_Name());
                            System.out.println("Customer City: " + s.getCustomer_Address());
                            System.out.println("Customer Balance: " + s.getCustomer_Balance());

                            // enter amount to deposit
                            System.out.print("Enter the amount to Withdraw: ");
                            amt = sc.nextInt();
                            s.setCustomer_Balance(s.getCustomer_Balance() - amt);
                            System.out.println("Amount Withdraw successfully ");
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("-----Balance Enquiry-----");
                    found = false;
                    System.out.println("Enter Account Number to check Balance: ");
                    ac_no = sc.nextInt();
                    for (Account s : list) {
                        if (ac_no == s.getCustomer_Acc_No()) {
                            found = true;
                            System.out.println("Total Balance is: " + s.getCustomer_Balance());
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println("-----List of Accounts-----");
                    for (Account s : list) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 6);
    }
}