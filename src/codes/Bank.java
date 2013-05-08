package codes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public class BankManager{
        private List<AccountHolder> accountHolderList;
        public BankManager(){
            accountHolderList = new ArrayList<AccountHolder>();
        }

        public List<AccountHolder> getAccountHolderList() {
            return accountHolderList;
        }

        public void addAccountHolder(AccountHolder accountHolder) {
            accountHolderList.add(accountHolder);
        }
    }
}
