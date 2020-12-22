package homework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertTrue(res);
    }

    @Test
    void pay() {
        int amount = 16;
        checkingAccount.setValue(31);

        checkingAccount.pay(amount);
        int expectedValue = checkingAccount.getValue();

        Assertions.assertEquals(15, expectedValue);
    }

    @Test
    void payNegative() {
        int amount = 15;
        checkingAccount.setValue(31);

        checkingAccount.pay(amount);
        int expectedValue = checkingAccount.getValue();

        Assertions.assertNotEquals(15, expectedValue);
    }

    @Test
    void transfer() {
        creditAccount.setValue(-60);

        int amount = 15;
        checkingAccount.setValue(43);
        checkingAccount.transfer(creditAccount, amount);

        Assertions.assertEquals(28, checkingAccount.getValue());
    }

    @Test
    void transferZeroCreditValue() {
        creditAccount.setValue(0);

        int amount = 15;
        checkingAccount.setValue(43);
        checkingAccount.transfer(creditAccount, amount);

        Assertions.assertNotEquals(28, checkingAccount.getValue());
    }

}