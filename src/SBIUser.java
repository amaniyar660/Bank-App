import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    //Attributes/Variables
   private String name;
   private String accountNo;
   private double balance;
   private String password;
   private double rateOfIntrest;// rate of interest is static coz we dont want to varry
//to write a construtor ALT+Insert
    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
//we have to write rate of intrest constoctor by our won coz bank will decide
        this.rateOfIntrest = 6.5;
        //we have to create randon account no unique so we have to use UUID
        //and String.valueOf-used to chenge one deta type to another
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    // ALT+Insert for getter and setter for change deta type

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "App Ka New Balance Hai..."+ balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        //Conditions-To Compare
        if(Objects.equals(enteredpassword,password)){
            if(amount>balance){
                return "Insufficient Money";
            }
            else{
                balance = balance-amount;
                return "Paisa Hi Paisa";
            }
        }
        else{
            return "Worong password";
        }

    }

    @Override
    public double calculateParameter(int years) {
        return (balance*years*rateOfIntrest)/100;//Formula For Interest

    }
    // private attributes can acess by getters and setters


}
