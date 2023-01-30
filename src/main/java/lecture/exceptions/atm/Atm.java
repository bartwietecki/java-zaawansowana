package lecture.exceptions.atm;

import lombok.Setter;

import static lecture.exceptions.atm.ExceptionMessages.NOT_ENOUGH_MONEY_IN_ATM;
import static java.lang.String.format;

/**
 * Klasa reprezentująca bankomat
 */
@Setter
public class Atm {
    private Double cash;
    private Double capacity = 10_000d; // maksymalna suma pieniędzy

    // robimy własny konstruktor dla cash
    public Atm(Double cash) {
        this.cash = cash;
    }

    /**
     * Metoda odpowiedzialna za wpłatę pieniędzy
     * @param amount wpłacana kwota
     */
    public void makeDeposit(Double amount) {
        if(cash + amount > capacity) {
            var maxDeposit = capacity - cash;
            throw new TooMuchMoneyException(maxDeposit);
        }
            this.cash = this.cash + amount; // this.cash += amount
    }

    public void withdraw(Double amount) {
        if(cash - amount <= 0){
            throw new OutOfMoneyException(format(NOT_ENOUGH_MONEY_IN_ATM.getMessage(), cash));
        }
        cash -= amount;
    }


//    public void withdraw(Double amount) {
//        Double cash = this.cash;
//        if(cash - amount <= 0){
//            throw new OutOfMoneyException("W bankomacie jest za mało pieniędzy, maksymalnie można wypłacić: " + cash);
//        }
//        this.cash -= amount;
//    }

    public String getBalance() {
        return this.cash.toString();
    }
}
