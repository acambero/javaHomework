package tests;

import codes.Account;
import codes.AccountHolder;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountHolderTest {
    private AccountHolder accountHolder;
    private Map<Account,Integer> accountsOwned;
    private Account a1,a2,a3;
    private Integer i1,i2,i3;

    @Before
    public void setUp(){
        accountHolder = new AccountHolder();
        a1 = new Account();
        a2 = new Account();
        a3 = new Account();
        i1 = new Integer(1000);
        i2 = new Integer(2000);
        i3 = new Integer(3000);
    }

    @Test
    public void TestItShouldAddAccounts(){
        accountsOwned = new LinkedHashMap<Account,Integer>();
        accountsOwned.put(a1,i1);
        accountsOwned.put(a2,i2);
        accountsOwned.put(a3,i3);
    }



}
