import AccountType.Account_type;
import expections.InSufficientBalance;
import expections.miniBalanceExpection;

import java.math.BigDecimal;

public class ICICI_BANK extends Account implements bankAccount{


    public ICICI_BANK(String ownerName, BigDecimal balance, BigDecimal miniBalance, Account_type account_type) throws miniBalanceExpection, InSufficientBalance {
        super(ownerName, balance, miniBalance,account_type);
        super.setMiniBalance(BigDecimal.valueOf(5000));
    }

    @Override
    public void withdraw(BigDecimal amount) throws InSufficientBalance {
        super.withdraw(amount);
        System.out.println("Withdraw from ICICI Bank");
        System.out.println("Withdraw Amount: "+this.getBalance()+"Rs");
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("deposit to ICICI Bank");
        System.out.println("Deposit Amount:"+this.getBalance()+"Rs");
    }

}
