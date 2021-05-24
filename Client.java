/**
 * This class Client is used to store the data of user's Info
 *
 * @author  Habeba Rabie Hassan
 * @version 1.0
 */
public class Client {

    /**
     * This class has 5 parameters
     * @param name used to store the name of the user
     * @param nationalID used to store the nationalID of user
     * @param address used to store the address of user
     * @param phone used to store the phone of user
     * @param account used to store the account of user
     */

    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account account;

    /**
     * Default constructor used to set the default values of this class with space value
     */

    public Client(){
        name = "";
        nationalID = "";
        address = "";
        phone = "";
    }

    /**
     * Parameterized constructor used to set the values of the class
     * @param name used to store the name of the user
     * @param nationalID used to store the nationalID of user
     * @param address used to store the address of user
     * @param phone used to store the phone of user
     * @param account used to store the account of user
     */

    public Client (String name, String nationalID, String address, String phone, Account account){
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * setter for the name
     * @param name used to store the name of the user
     */
    public void setName (String name) { //set the name
        this.name = name;
    }
    /**
     * setter for the nationalID
     @param nationalID used to store the nationalID of user
     */
    public void setNationalID (String nationalID) { //set the nationalID
        this.nationalID = nationalID;
    }
    /**
     * setter for the address
     @param address used to store the address of user
     */
    public void setAddress (String address) { //set the address
        this.address = address;
    }
    /**
     * setter for the phone
     @param phone used to store the phone of user
     */
    public void setPhone (String phone) { //set the phone
        this.phone = phone;
    }
    /**
     * setter for the account
     @param account used to store the account of user
     */
    public void setAccount (Account account) { //set the account
        this.account = account;
    }

    /**
     * getter for the name
     * @return name, a string contains the name value
     */
    public String getName () { //get the name
        return name;
    }
    /**
     * getter for the nationalID
     * @return nationalID, a string nationalID the phone value
     */
    public String getNationalID () { //get the nationalID
        return nationalID;
    }
    /**
     * getter for the address
     * @return address, a string contains the address value
     */
    public String getAddress () { //get the address
        return address;
    }
    /**
     * getter for the phone
     * @return phone, a string contains the phone value
     */
    public String getPhone () { //get the phone number
        return phone;
    }
    /**
     * getter for the account
     * @return account, an Account contains the account value
     */
    public Account getAccount () { //get the account
        return account;
    }

    /**
     * @return string which describes the name, the nationalID, the address, the phone number, the account and the balance values of the user
     */
    @Override
    public String toString(){
        return "The client's name is " + name +"\nHis national ID is equals "+ nationalID + "\nHis address is "
                + address + "\nHis phone number is " + phone + "\nHis account number is "+ account.getAccountNumber()
                + "\nHis balance is " + account.getBalance() + "\n";
    }
}