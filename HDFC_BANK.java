import AccountType.Account_type;
import expections.InSufficientBalance;
import expections.miniBalanceExpection;

import java.math.BigDecimal;

public class HDFC_BANK extends Account implements bankAccount{

    public HDFC_BANK(String ownerName, BigDecimal balance, Account_type account_type) throws miniBalanceExpection {
        super(ownerName, balance,account_type);
        super.setMiniBalance(BigDecimal.valueOf(5000));
        super.setOverDraftLimit(BigDecimal.valueOf(0.40));
    }


    @Override
    public void withdraw(BigDecimal amount) throws InSufficientBalance {
        super.withdraw(amount);
        System.out.println("Withdraw from HDFC Bank");
        System.out.println("After Withdraw Total Amount in Your HDFC Bank : "+this.getBalance()+"Rs");
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("Deposit to HDFC Bank");
        System.out.println("After deposit Total Amount in Your HDFC Bank : "+this.getBalance()+"Rs");
    }
}
