package homework6;

public class CreditAccount extends Account {

    public final String name = "CreditAccount";
    protected boolean isMoreZero = false;

    @Override
    protected void transfer(Account account, int amount) {}

    @Override
    public void pay(int amount) {
        System.out.println("Try pay " + amount + " from credit");
        int result = value - amount;
        System.out.println("On " + name + " left " + amount);
        this.setValue(result);
    }

    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Try add " + amount + " money to credit");
        int result = value + amount;
        if (result > 0) {
            System.out.println("Need decrement amount for adding to "
                    + name + " and try again");
            return false;
        } else {
            System.out.println("Now balance is " + result);
            this.setValue(result);
            return true;
        }
    }

    public String toString() {
        return name;
    }
}