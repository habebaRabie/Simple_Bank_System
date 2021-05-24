/**
 * This class Account is used to store the data of user's account
 *
 * @author  Habeba Rabie Hassan
 * @version 1.0
 * @since 30-4-2021
 */

public class Account
{

    /**
     * This class has 2 parameters
     * @param balance used to store the money of the user
     * @param accountNumber used to store the account number of user
     */

    private double balance;
    private int accountNumber;

    /**
     * Default constructor used to set the default values of this class with zeroes
     */

    public Account(){
        balance = 0.0;
        accountNumber =0;
    }

    /**
     * Parameterized constructor used to set the values of the class
     * @param balance used to store the money of the user
     * @param accountNumber used to store the account number of user
     */

    public Account(double balance, int accountNumber) { //parameterized constructor
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    /**
     * setter for the balance
     * @param balance used to store the money of the user
     */
    public void setBalance (double balance) { //set the balance
        this.balance = balance;
    }
    /**
     * getter for the balance
     * @return balance, a double contains the balance value
     */
    public double getBalance () { //get the balance
        return balance;
    }
    /**
     * setter for the balance
     * @param accountNumber used to store the account number of user
     */
    public void setAccountNumber (int accountNumber) { //set the account number
        this.accountNumber = accountNumber;
    }

    /**
     * getter for the balance
     * @return accountNumber, a number contains the account number
     */
    public int getAccountNumber () { //get the account number
        return accountNumber;
    }


    /**
     * @return string which describes the balance and the account number of the user
     */

    @Override
    public String toString(){//overriding the toString() method
        return "The account number is " + accountNumber +" and balance is equals "+ balance;
    }

    /**
     *
     * @param withdrawMoney which is the money that the user want to take from his balance
     * there is if condition which check if the money that the user want to take is available in his balance
     *  if it's available he can take the money
     *   if it is not we print that his account doesn't have enough money
     */

    public void withdraw(double withdrawMoney){ //take money
        if (balance-withdrawMoney >= 0){
            balance = balance-withdrawMoney;
        }
        else{
            System.out.println("Your account doesn't have enough money");
        }
    }

    /**
     *
     * @param depositMoney which is the money that the user want to add to his account
     *  and we add it to his balance
     */
    public void deposit(double depositMoney){ // put money
        balance = balance+depositMoney;
    }

}