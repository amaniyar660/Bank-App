public interface BankInterface {
    double checkBalance();
    String addMoney(int ammount);
    String withdrawMoney(int amount,String password);
    double calculateParameter(int years);

}
