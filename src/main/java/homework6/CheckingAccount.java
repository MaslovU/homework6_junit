package homework6;

public class CheckingAccount extends Account {

    public final String name = "CheckingAccount";


    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Try transfer " + amount + " from checking to " + account.getName());
        int res = value - amount;
        if (res > 0) {
            if (account.addMoney(amount)) {
                this.setValue(res);
            } else {
                System.out.println("Cannot transfer to "
                        + account + " please decrement amount");
            }
        } else {
            System.out.println("Cannot transfer from " + name + " please decrement amount");
        }
    }

    @Override
    public void pay(int amount) {
        System.out.println("Try pay " + amount + " from checking");
        int result = value - amount;
        if (result < 0) {
            System.out.println("Need decrement amount for paying from "
                    + name + " and try again");
        } else {
            System.out.println("On " + name + " left " + value);
            this.setValue(result);
        }
    }

    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Try add " + amount + " money to checking");
        value += amount;
        System.out.println("Now balance is "
                + value);
        this.setValue(value);
        return true;
    }

    public String toString() {
        return name;
    }
}