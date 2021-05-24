/**
 * this class has special case that allows the companies to have a commertcialID instead of the nationalID
 * @author  Habeba Rabie Hassan
 */
public class CommercialClient extends Client{

    private String commercialID;

    public CommercialClient(){ //account for a company not a person
        setNationalID("00000000000000");
    }

    /**
     * This class has 5 parameters
     * @param name used to store the name of the user
     * @param commercialID used to store the commercialID of user
     * @param address used to store the address of user
     * @param phone used to store the phone of user
     * @param account used to store the account of user
     * * @param nationalID used to store the nationalID of user with value zero
     */
    public CommercialClient(String name, String commercialID, String address, String phone, Account account){
        setName(name);
        this.commercialID = commercialID;
        setNationalID("00000000000000");
        setAddress(address);
        setPhone(phone);
        setAccount(account);

    }

    /**
     * setter for the commercialID
     @param commercialID used to store the commercialID of user
     */
    public void setCommercialID(String commercialID){
        this.commercialID = commercialID;
    }

    /**
     * getter for the commercialID
     * @return commercialID, a string contains the commercialID value
     */
    public String getCommercialID(){
        return commercialID;
    }

    /**
     * @return string which describes the name, the commercialID, the address, the phone number, the account and the balance values of the user
     */
    @Override
    public String toString(){//overriding the toString() method
        return "The client's name is " + getName() +"\nHis commercial ID is equals "+ commercialID + "\nHis address is "
                + getAddress() + "\nHis phone number is " + getPhone() + "\nHis account number is "+ getAccount().getAccountNumber()
                + "\nHis accout Info is " + getAccount() + "\nHis balance is " + getAccount().getBalance() + "\n";
    }
}