package Chapterthree;

public class AccountTest {
    public static void main(String[] args) {
        Account.displayAccount();

    }
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }

}
