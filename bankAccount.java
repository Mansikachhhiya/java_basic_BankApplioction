import expections.InSufficientBalance;

import java.math.BigDecimal;

public interface bankAccount {
    void withdraw(BigDecimal amount) throws InSufficientBalance;
    void deposit(BigDecimal amount);
}
