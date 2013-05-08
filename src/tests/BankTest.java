package tests;

import codes.AccountHolder;
import codes.Bank;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.*;
import static org.mockito.*;

import java.util.ArrayList;
import java.util.List;


public class BankTest{
    Bank.BankManager bankManager;
    List<AccountHolder> accoutHolderList;

    @Before
    public void setUp(){
     accoutHolderList = new ArrayList<AccountHolder>();
     bankManager = new Bank().new BankManager();
    }

    @Test
    public void testItShouldReturnAnAccountHolderList(){
        assertEquals(accoutHolderList.getClass(), bankManager.getAccountHolderList().getClass());
    }

    @Test
    public void testItShouldAddAccountHolder(){
        bankManager.addAccountHolder(new AccountHolder());
        bankManager.addAccountHolder(new AccountHolder());
        bankManager.addAccountHolder(new AccountHolder());
        assertTrue(bankManager.getAccountHolderList().size() == 3);
    }
}
