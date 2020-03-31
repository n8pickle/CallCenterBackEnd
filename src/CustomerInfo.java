public class CustomerInfo {

    private int ccid;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private double creditCardNumber;
    private double creditCardBalance;

    public CustomerInfo( int ccid, String firstName, String lastName, String address, String phoneNumber, double creditCardNumber, double creditCardBalance)
    {
        this.ccid = ccid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.creditCardBalance = creditCardBalance;
    }

    public int getCcid(){
        return ccid;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getCreditCardNumber(){
        return creditCardNumber;
    }
    public double getCreditCardBalance(){
        return creditCardBalance;
    }

    public void setCcid(int ccid){
        this.ccid = ccid;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumberName(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCreditCardNumber(double creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }
    public void setCreditCardBalance(double creditCardBalance){
        this.creditCardBalance = creditCardBalance;
    }

}
