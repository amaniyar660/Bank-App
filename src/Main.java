import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create an account");
//create user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name, balance, password);//creating user
        //We called the constructors Now call the Functions

//Add amount-Written type of add money is string
        String massage = user.addMoney(100000);
        System.out.println(massage);

//Withdraw Money
        System.out.println("Enter Amount You Want To WithDrow");
        int money = sc.nextInt();
        System.out.println("Enter Password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money, pass));
        //Note- If you go to withdrawMoney and press ctrl+click on withdraw money function it will show you the implementation of function
        
        
        //Calculate Rate Of Interest
        System.out.println(user.calculateParameter(10));



    }

}