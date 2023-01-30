package lecture.exceptions.atm;

import static lecture.exceptions.atm.ExceptionMessages.TOO_MUCH_MONEY_IN_ATM;
import static java.lang.String.format;

public class TooMuchMoneyException extends RuntimeException {

    public TooMuchMoneyException(Double amount) {
        super(format(TOO_MUCH_MONEY_IN_ATM.getMessage(), amount));
    }
}
