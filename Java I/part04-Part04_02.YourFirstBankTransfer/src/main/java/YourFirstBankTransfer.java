
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mathewsAccount = new Account("Matthews account", 1000.00);

        Account myAccount = new Account("My Account", 0);

        mathewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);

        System.out.println(mathewsAccount);
        System.out.println(myAccount);
    }
}
