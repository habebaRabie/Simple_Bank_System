/**
 * this class Special account extends from class account
 * has special case that allows the user to over draft till 1000 pounds
 *@author  Habeba Rabie Hassan
 *@version 1.0
 *@since 30-4-2021
 */

public class SpecialAccount extends Account{

    /**
     * Default constructor used to set the default values of this class with space value
     */

    public SpecialAccount() {
        super();
    }

    /**
     * Parameterized constructor used to set the values of the class
     * @param balance which is the balance of the user
     * @param accountNumber which is the account number of the user
     */

    public SpecialAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    /**
     *
     * @param withdrawMoney which is the money that the user want to take from his balance
     * there is if condition which check if the money that the user want to take is available in his balance
     *  if it's available he can take the money
     *   if it is not he can over draft till 1000 pounds but if he want more,we print that his account doesn't have enough money
     */

    @Override
    public void withdraw(double withdrawMoney){
        if(getBalance()-withdrawMoney  >= -1000) {
            setBalance(getBalance() - withdrawMoney);
        }else{
            System.out.println("Invalid operation you can't over draft more than 1000 pounds");
        }
    }
}
