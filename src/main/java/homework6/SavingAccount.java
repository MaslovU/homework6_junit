package homework6;

public class SavingAccount extends Account {

    public final String name = "SavingAccount";
    protected boolean isMoreZero = true;

    public String getName() {
        return this.name;
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Try transfer " + amount + " from saving to " + account);
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
    protected void pay(int amount) {
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Try add balance " + amount + " to saving");
        this.value += amount;
        System.out.println("Now balance is "
                + this.value);
        this.setValue(this.value);
        return true;
    }

    public String toString() {
        return name;
    }
}