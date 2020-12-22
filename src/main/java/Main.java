import homework6.CheckingAccount;
import homework6.CreditAccount;
import homework6.SavingAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount();
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        savingsAccount.addMoney(100);

        checkingAccount.addMoney(70);
        System.out.println("savingsAccount");
        savingsAccount.showValue();
        System.out.println("creditAccount");
        creditAccount.showValue();
        System.out.println("checkingAccount");
        checkingAccount.showValue();
        System.out.println(" ");
        checkingAccount.transfer(savingsAccount, 20);
        System.out.println(" ");
        savingsAccount.transfer(creditAccount, 20);
        System.out.println(" ");
        checkingAccount.showValue();
        savingsAccount.showValue();
        creditAccount.showValue();
        System.out.println(" ");
    }
}
