import AccountType.Account_type;
import expections.InSufficientBalance;
import expections.miniBalanceExpection;
import java.math.BigDecimal;
import AccountType.*;

public class BankApplication {
    public static void main(String[] args) throws miniBalanceExpection, InSufficientBalance {
        ICICI_BANK mansiAccount = new ICICI_BANK("mansi",BigDecimal.valueOf(9000),Account_type.CURRENT);
        System.out.println("_______________________________________________________");
        HDFC_BANK deptiAccount = new HDFC_BANK("depti", BigDecimal.valueOf(5000),Account_type.CURRENT);
//        deptiAccount.withdraw(BigDecimal.valueOf(200));
        UPI mansiUPI = new UPI(mansiAccount,1234311);
        UPI deptiUPI = new UPI(deptiAccount,1234321);
        System.out.println("______________________________________________________");
        mansiUPI.transfer(BigDecimal.valueOf(15000),deptiUPI);
//        System.out.println(mansiAccount.getBalance());

    }
}