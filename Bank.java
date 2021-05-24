import java.util.ArrayList;

/**
 * This class Bank is used to store the data of Bank and to display accounts and clients
 * @author  Habeba Rabie Hassan
 * @version 1.0
 * @since 30-4-2021
 */
public class Bank {

    /**
     * This class has 3 parameters
     * @param name used to store the name of the bank
     * @param address used to store the address of bank
     * @param phone used to store the phone of the bank
     * This class has also 2 ArrayLists
     * type of the first list is client and called clients which used to store the clients of the bank and to contain all the clients in the bank
     *type of the second list is account and called accounts which used to store the accounts of the bank and to contain all the accounts of those clients in the bank
     *
     */
    private String name;
    private String address;
    private String phone;
    private ArrayList<Client> clients; //this array contains all the clients in the bank
    private ArrayList<Account> accounts; //this array contains all the accounts of those clients in the bank

    /**
     * setter for the name
     * @param name used to store the name of the bank
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for the address
     * @param address used to store the address of the bank
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * setter for the phone
     * @param phone used to store the phone of the bank
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * getter for the name
     * @return name , a string contains the name value
     */
    public String getName() {
        return name;
    }

    /**
     * getter for the address
     * @return address, a string contains the address value
     */
    public String getAddress() {
        return address;
    }

    /**
     * getter for the phone
     * @return phone, a string contains the phone value
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Parameterized constructor used to set the values of the class
     * @param name used to store the name of bank
     * @param address used to store the address of bank
     * @param phone used to store the phone of bank
     *
     */
    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        clients = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    /**
     *
     * @param NewAccount which is the NewAccount that the user want to add in list of account in this bank
     */
    public void addNewAccount(Account NewAccount){
        accounts.add(NewAccount);
    }

    /**
     *
     * @param NewClient which is the NewClient that the user want to add in list of Client in this bank
     */
    public void addNewClient(Client NewClient){
        clients.add(NewClient);
    }

    /**
     * function called displayData which doesn't have a parameter and print all  clients of list
     */

    public void displayData() {
        System.out.println(clients);
    }

    /**
     * there is  function called displayAccounts which doesn't have a parameter and print all accounts of list
     */
    public void displayAccounts() {
        System.out.println(accounts);
    }
}
