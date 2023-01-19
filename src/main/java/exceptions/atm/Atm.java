package exceptions.atm;

import lombok.Setter;

@Setter
public class Atm {
    private Double cash;
    private Double capacity = 10_000d; // maksymalna suma pieniędzy

    // robimy własny konstruktor dla cash
    public Atm(Double cash) {
        this.cash = cash;
    }

    public void makeDeposit(Double amount) {
        this.cash = this.cash + amount; // this.cash += amount
    }

    public void withdraw(Double amount) {
        if(cash - amount <= 0){
            throw new OutOfMoneyException(ExceptionMessages.NOT_ENOUGH_MONEY_IN_ATM.getMessage());
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
