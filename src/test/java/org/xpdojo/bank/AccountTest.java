package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Object Account;

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance).isEqualTo(100);
    }
}
