import AccountType.Account_type;
import expections.InSufficientBalance;
import expections.miniBalanceExpection;

import java.math.BigDecimal;

public class ICICI_BANK extends Account implements bankAccount{


    public ICICI_BANK(String ownerName, BigDecimal balance, Account_type account_type) throws miniBalanceExpection, InSufficientBalance {
        super(ownerName, balance,account_type);
        super.setMiniBalance(BigDecimal.valueOf(5000));
        super.setOverDraftLimit(BigDecimal.valueOf(.20));
    }

    @Override
    public void withdraw(BigDecimal amount) throws InSufficientBalance {
        super.withdraw(amount);
        System.out.println("Withdraw from ICICI Bank");
        System.out.println("After Withdraw Total Amount in Your ICICI Bank : "+this.getBalance()+"Rs");
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("Deposit to ICICI Bank");
        System.out.println("After deposit Total Amount in Your ICICI Bank:"+this.getBalance()+"Rs");
    }

}
