import java.util.Scanner;

public class Demo{

    /**
     * This class has 2 static objects
     * user used to store the account of the user
     * client used to store the personal info of user
     * 1- create account
     * 2- operations on your account (deposit / withdraw)
     * 3- display account by account number
     * 4- display all account with there users
     * 5- exit
     * @author Habeba Rabie Hassan
     * @version 1.0
     * @since 30-4-2021
     */
    static Account user;
    static Client client;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Welcome to our Bank system");
        int accountNumber = 300;
        System.out.println("Please enter your bank name, address and phone number");
        String bankName= userInput.nextLine();
        String bankAddress = userInput.nextLine();
        String bankPhoneNumber = userInput.nextLine();
        /**
         * create new object of class bank by using the parametrized constructor
         */
        Bank bank = new Bank(bankName, bankAddress, bankPhoneNumber);

        /**
         * while loop to make continuous interactive with the user until he exit the program
         */
        while(true){
            System.out.println("1- Account menu\n2- Display all accounts in this bank\n3- Exit");
            int userChoice = userInput.nextInt();
            /**
             * account menu action
             */
            if(userChoice == 1) {
                /**
                 * while loop to make continuous interactive with the user until he exit the program
                 */
                while (true) {
                    System.out.println("Please choose from the current menu what operation you want to do\n1- Create a new account\n2- Operations on your account (deposit/ withdraw)\n3- Display your account info\n4- Exit");
                    int operationNumber = userInput.nextInt();
                    if (operationNumber == 4) {
                        break;
                    }
                    else if (operationNumber == 1) {
                        /**
                         * while loop to make continuous interactive with the user until he exit the program
                         */
                        while (true) {
                            System.out.println("Do you want to create\n1- Account\n2- Special Account( If you choose special account you will be allowed to over draft with maximum 1000L.E");
                            int accountSpecialization = userInput.nextInt();
                            if (accountSpecialization == 1) {
                                System.out.println("Do you want to create\n1- Personal account\n2- Commercial Account");
                                int accountType = userInput.nextInt();
                                if (accountType == 1) {
                                    System.out.println("Please enter your money to be added to your balance");
                                    int balance = userInput.nextInt();
                                    System.out.println("Please enter your information( name, nationalID, address and phone)");
                                    String clientName = userInput2.nextLine();
                                    String clientNationalID = userInput2.nextLine();
                                    String clientAddress = userInput2.nextLine();
                                    String clientPhoneNumber = userInput2.nextLine();
                                    /**
                                     * create new Account object(user) to store the account info of the user
                                     */
                                    user = new Account(balance, accountNumber);
                                    /**
                                     * create new Client object(client) to store the personal info of the user
                                     */
                                    client = new Client(clientName, clientNationalID, clientAddress, clientPhoneNumber, user);
                                    /**
                                     *  add new client for the array list(clients)
                                     */
                                    bank.addNewClient(client);
                                    /**
                                     * add new account for the array list(accounts)
                                     */
                                    bank.addNewAccount(user);
                                    /**
                                     * break the loop after finishing the whole action
                                     */
                                    break;
                                }
                                /**
                                 *  create (commercial account) action
                                 */
                                else if (accountType == 2) {

                                    System.out.println("Please enter your money to be added to your balance");
                                    int balance = userInput.nextInt();
                                    System.out.println("Please enter your information( name, commercialID, address and phone)");
                                    /**
                                     * String that store the name value of the user
                                     */
                                    String clientName = userInput2.nextLine();
                                    String clientCommercialID = userInput2.nextLine();
                                    String clientAddress = userInput2.nextLine();
                                    String clientPhoneNumber = userInput2.nextLine();
                                    user = new Account(balance, accountNumber);
                                    /**
                                     * create new CommercialClient object(client) to store the personal info of the user
                                     */
                                    client = new CommercialClient(clientName, clientCommercialID, clientAddress, clientPhoneNumber, user);
                                    /**
                                     * add new client for the array list(clients)
                                     */
                                    bank.addNewClient(client);
                                    /**
                                     * add new account for the array list(accounts)
                                     */
                                    bank.addNewAccount(user);
                                    /**
                                     * break the loop after finishing the whole action
                                     */
                                    break;
                                }
                            }
                            /**
                             * create (special account) action
                             */
                            else if (accountSpecialization == 2) {

                                System.out.println("Do you want to create\n1- Personal account\n2- Commercial Account");
                                int accountType = userInput.nextInt();
                                if (accountType == 1) {


                                    System.out.println("Please enter your money to be added to your balance");

                                    int balance = userInput.nextInt();
                                    System.out.println("Please enter your company's information( name, nationalID, address and phone)");
                                    String clientName = userInput2.nextLine();
                                    String clientNationalID = userInput2.nextLine();
                                    String clientAddress = userInput2.nextLine();
                                    String clientPhoneNumber = userInput2.nextLine();
                                    /**
                                     * create new Account object(user) to store the account info of the user
                                     */
                                    user = new SpecialAccount(balance, accountNumber);
                                    /**
                                     * create new Account object(user) to store the account info of the user
                                     */
                                    client = new Client(clientName, clientNationalID, clientAddress, clientPhoneNumber, user);
                                    /**
                                     *  add new client for the array list(clients)
                                     */
                                    bank.addNewClient(client);
                                    /**
                                     * add new account for the array list(accounts)
                                     */
                                    bank.addNewAccount(user);
                                    /**
                                     * break the loop after finishing the whole action
                                     */
                                    break;

                                }else if (accountType == 2) {

                                    System.out.println("Please enter your money to be added to your balance");
                                    int balance = userInput.nextInt();
                                    System.out.println("Please enter your information( name, commercialID, address and phone)");
                                    String clientName = userInput2.nextLine();
                                    String clientCommercialID = userInput2.nextLine();
                                    String clientAddress = userInput2.nextLine();
                                    String clientPhoneNumber = userInput2.nextLine();
                                    user = new SpecialAccount(balance, accountNumber);
                                    /**
                                     * create new CommercialClient object(client) to store the personal info of the user
                                     */
                                    client = new CommercialClient(clientName, clientCommercialID, clientAddress, clientPhoneNumber, user);
                                    /**
                                     * add new client for the array list(clients)
                                     */
                                    bank.addNewClient(client);
                                    /**
                                     * add new account for the array list(accounts)
                                     */
                                    bank.addNewAccount(user);
                                    /**
                                     * break the loop after finishing the whole action
                                     */
                                    break;
                                }
                                /**
                                 *  if user's choice is invalid
                                 */
                                else {
                                    System.out.println("Invalid choice please choose number from the valid menu");
                                    break;
                                }
                            }
                        }
                    }
                    /**
                     * Operations on your account (deposit/ withdraw) action
                     */
                    else if(operationNumber == 2){
                        System.out.println("Do you want to withdraw or deposit\n1- deposit\n2- Withdraw");
                        int Withdraw_deposit = userInput.nextInt();
                        /**
                         * deposit action
                         */
                        if(Withdraw_deposit == 1){
                            System.out.println("How much the money you want to deposit in your account");
                            double usersMoney = userInput.nextDouble();
                            user.deposit(usersMoney);
                            /**
                             * withdraw action
                             */
                        }else if(Withdraw_deposit == 2){
                            System.out.println("How much the money you want to withdraw in your account");
                            double usersMoney = userInput.nextDouble();
                            user.withdraw(usersMoney);
                        }
                        /**
                         * if user's choice is invalid
                         */
                        else{
                            System.out.println("Wrong choice please choose form the valid operators");
                            break;
                        }
                    }
                    /**
                     * display this account information action
                     */
                    else if(operationNumber == 3){
                        /**
                         * diplay the account information
                         */
                        System.out.println(user);
                    }
                    /**
                     * if user's choice is invalid
                     */
                    else{
                        System.out.println("Invalid choice please choose number from the valid menu");
                        break;
                    }
                    /**
                     * add 1 to the account number for the new user
                     */
                    accountNumber = accountNumber+1;
                }
            }
            /**
             * display all accounts action
             */
            else if(userChoice == 2){
                System.out.println("Do you want to\n1- Display all accounts in this bank\n2- Display all clients with there accounts");
                int displayChoice = userInput.nextInt();
                /**
                 * Display all accounts in this bank action
                 */
                if(displayChoice == 1){
                    bank.displayAccounts();
                }
                /**
                 * Display all clients in this bank action
                 */
                else if(displayChoice == 2){
                    /**
                     * Display all clients
                     */
                    bank.displayData();
                }
                /**
                 * if user's choice is invalid
                 */
                else{
                    System.out.println("Invalid choice please choose number from the valid menu");
                    break;
                }
            }
            /**
             * Exit action
             */
            else if(userChoice == 3){
                break;
            }
            /**
             * if user's choice is invalid
             */
            else{
                System.out.println("Invalid choice please choose number from the valid menu");
                break;
            }
        }
    }
}