package nitin;

public class BankAccount {

    private String AccountNumber;
    private  String AccountHolder;
    private double balance;

    public BankAccount(String AccountNumber,String AccountHolder){
        this.AccountNumber =AccountNumber;
        this.AccountHolder = AccountHolder;
    }


    public void deposit (double money){
        if(money<=0){
            System.out.println("invalid deposit");
        }else{

            balance += money;
        }



    }
    public double withdraw(double money){

       if(money<=0){
           System.out.println("Invalid Withdraw");

       }else if(balance>=money) {
           balance -= money;

       }

        return money;
    }

    public double availableBalance(){
        System.out.print("Available balance : ");
        return balance;
    }

}
