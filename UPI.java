import AccountType.Account_type;
import exceptions.InSufficientBalance;

import java.math.BigDecimal;

public class UPI {
    private final Account account;
    private final int Upi_id;
    private Account_type account_type;

    public UPI(Account account, int Upi_id) {
        this.account = account;
        this.Upi_id = Upi_id;
    }

    void transfer(BigDecimal amount, UPI destination) throws InSufficientBalance {
        try {
            if (this == destination) {
                System.out.println("Can't transfer to same Account");
            } else {
                this.account.withdraw(amount);
                receive(amount, destination);
            }
        }catch (InSufficientBalance e){
            System.out.println(e.getMessage());
        }

    }


    public BigDecimal receive(BigDecimal amount , UPI destination){
        return destination.account.deposit(amount);
    }

}
