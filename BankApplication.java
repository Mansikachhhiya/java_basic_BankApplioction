import AccountType.Account_type;
import exceptions.InSufficientBalance;
import exceptions.miniBalanceExcepction;
import java.math.BigDecimal;

public class BankApplication {
    public static void main(String[] args) throws miniBalanceExcepction, InSufficientBalance {
        ICICI_BANK mansiAccount = new ICICI_BANK("mansi",BigDecimal.valueOf(9000),Account_type.CURRENT);
        mansiAccount.print_details();
        System.out.println("_______________________________________________________");
        HDFC_BANK deptiAccount = new HDFC_BANK("depti", BigDecimal.valueOf(5000),Account_type.CURRENT);
        deptiAccount.print_details();
//        deptiAccount.withdraw(BigDecimal.valueOf(200));
        UPI mansiUPI = new UPI(mansiAccount,1234311);
        UPI deptiUPI = new UPI(deptiAccount,1234321);
        System.out.println("______________________________________________________");
        deptiUPI.transfer(BigDecimal.valueOf(5000),mansiUPI);
        System.out.println("______________________________________________________");
        mansiUPI.transfer(BigDecimal.valueOf(1000),deptiUPI);
    }
}