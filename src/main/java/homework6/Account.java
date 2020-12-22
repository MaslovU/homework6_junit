package homework6;

public abstract class Account {

    protected int value;

    protected abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);

    protected abstract void pay(int amount);

    public void showValue() {
        System.out.println(this.value);
    }

    protected void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    protected abstract String getName();
}