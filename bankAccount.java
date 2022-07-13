import exceptions.InSufficientBalance;

import java.math.BigDecimal;

public interface bankAccount {
    void withdraw(BigDecimal amount) throws InSufficientBalance;
    BigDecimal deposit(BigDecimal amount);
    boolean checkBalance(BigDecimal amount);
}
