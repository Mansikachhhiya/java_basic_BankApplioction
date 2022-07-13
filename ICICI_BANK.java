import AccountType.Account_type;
import exceptions.InSufficientBalance;
import exceptions.miniBalanceExcepction;

import java.math.BigDecimal;

public class ICICI_BANK extends Account implements bankAccount{


    public ICICI_BANK(String ownerName, BigDecimal balance, Account_type account_type) throws miniBalanceExcepction, InSufficientBalance {

        super(ownerName, balance,account_type);
        super.setMiniBalance(BigDecimal.valueOf(5000));
        super.setOverDraftLimit(BigDecimal.valueOf(.20));

    }

    @Override
    void print_details() {
        System.out.println(getOwnerName()+" ICICI Bank Details");
        super.print_details();
    }


    @Override
    public void withdraw(BigDecimal amount) throws InSufficientBalance {
        try {
            super.withdraw(amount);
            System.out.println("Withdraw from ICICI Bank");
            System.out.println(getOwnerName()+": After Withdraw Total Amount  ICICI Bank : " + this.getBalance() + " Rs");
        }catch (InSufficientBalance e){
            //System.out.println(e.getMessage());
            throw new InSufficientBalance("Insufficient Balance in your Account");
        }
    }

    @Override
    public BigDecimal deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("Deposit to ICICI Bank");
        System.out.println(getOwnerName()+": After deposit Total Amount in Your ICICI Bank: "+this.getBalance()+" Rs");
        return amount;
    }

}
