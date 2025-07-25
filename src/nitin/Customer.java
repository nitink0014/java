package nitin;

public class Customer {

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("11223","Nitin Kumar");

        bankAccount.deposit(200);
        System.out.println(bankAccount.withdraw(100));
        System.out.println(bankAccount.withdraw(0));
        System.out.println(bankAccount.withdraw(70));
        bankAccount.deposit(0);
        System.out.println(bankAccount.withdraw(-1));
        System.out.println(bankAccount.availableBalance());

    }
}

