import AccountType.Account_type;
import expections.InSufficientBalance;

import java.math.BigDecimal;

public class UPI {
    private Account account;
    private int Upi_id;
    private Account_type account_type;

    public UPI(Account account, int Upi_id) {
        this.account = account;
        this.Upi_id = Upi_id;
    }

    public void transfer(BigDecimal amount, UPI destination) throws InSufficientBalance {
        if (this == destination) {
            System.out.println("Can't transfer to same Account");
        } else{
            this.account.withdraw(amount);
            destination.account.deposit(amount);
        }

    }

//    public BigDecimal receive(BigDecimal amount, UPI destination) {
//      return destination.account.deposit(amount);
//
//    }

}
