package homework6;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class CheckingAccountTest {
    CheckingAccount checkingAccount = new CheckingAccount();
    CreditAccount creditAccount = new CreditAccount();

    @Test
    void addMoney() {
        //given
        int amount = 10;
        //when
        boolean res = checkingAccount.addMoney(amount);
        //then
        assertThat(res, Matchers.is(true));
    }

    @Test
    void pay() {
        int amount = 16;
        checkingAccount.setValue(31);
        checkingAccount.pay(amount);

        int expectedValue = checkingAccount.getValue();

        assertThat(expectedValue, Matchers.equalTo(15));
    }

    @Test
    void payNegative() {
        int amount = 15;
        checkingAccount.setValue(10);
        checkingAccount.pay(amount);

        int expectedValue = checkingAccount.getValue();

        assertThat(expectedValue, Matchers.greaterThanOrEqualTo(10));
    }

    @Test
    void transfer() {
        creditAccount.setValue(-60);

        int amount = 15;
        checkingAccount.setValue(43);
        checkingAccount.transfer(creditAccount, amount);

        assertThat(28, Matchers.is(checkingAccount.getValue()));
    }

    @Test
    void transferZeroCreditValue() {
        creditAccount.setValue(0);

        int amount = 15;
        checkingAccount.setValue(43);
        checkingAccount.transfer(creditAccount, amount);

        assertThat(43, Matchers.is(checkingAccount.getValue()));
    }
}