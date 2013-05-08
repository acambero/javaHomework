package tests;

import codes.Account;
import codes.AccountHolder;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.*;


public class AccountHolderTest {
    private AccountHolder accountHolder;
    private List<Account> accountsOwned;
    private Account a1,a2,a3;
    private Integer i1,i2,i3;
    private int amount$1000;
    private int amount$200;

    @Before
    public void setUp(){
        accountHolder = new AccountHolder();
        accountsOwned = new ArrayList<Account>();
        a1 = new Account();
        a2 = new Account();
        a3 = new Account();
        amount$1000 = 1000;
        amount$200 = 200;
    }

    @Test
    public void testItShouldAddAccounts(){
//        accountsOwned.add(a1);
//        accountsOwned.add(a2);
//        accountsOwned.add(a3);
        assertTrue(accountsOwned.size() == 3);
    }

    @Test
    public void testItShouldGetCurrentBalanceOfAnAccount(){
//        accountsOwned.add(a1);
        accountHolder.addBalance(amount$1000);
        assertTrue(accountHolder.getBalance() == amount$1000);
    }

    @Test
    public void testItShouldGetCurrentBalanceAllAccount(){
        accountHolder.addBalance(amount$1000);
        accountHolder.addBalance(amount$1000);
        accountHolder.addBalance(amount$1000);
        assertEquals(accountHolder.getBalanceAllAccount(), amount$1000 *3);
    }

    @Test
    public void testItShouldWithdrawMoney(){
        accountHolder.addBalance(amount$1000);
        assertTrue(accountHolder.setAmount(amount$200).withdrawMoney());
        assertTrue(accountHolder.getBalance() == 800);
        assertFalse(accountHolder.setAmount(amount$1000).withdrawMoney());
        assertTrue(accountHolder.getBalance() == 800);
    }

    @Test
    public void testItShouldTransferMoney(){
        accountHolder.addBalance(amount$1000);
        assertTrue(accountHolder.setAmount(amount$1000).transferMoneyTo(a2));
        assertTrue(accountHolder.getBalance() == amount$1000 - amount$200);
        assertTrue(accountHolder.getBalance() == amount$200);
        assertFalse(accountHolder.setAmount(amount$1000).transferMoneyTo(a2));
        assertTrue(accountHolder.getBalance() == amount$1000 - amount$200);
    }

}
