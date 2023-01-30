package lecture.exceptions.atm;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    NOT_ENOUGH_MONEY_IN_ATM("W bankomacie jest za mało pieniędzy, maksymalnie można wypłacić: %s"),
    TOO_MUCH_MONEY_IN_ATM("W bankomacie byłoby za dużo pieniędzy, można maksymalnie wpłacić: %s");


    // Wiadomość musimy przetrzymywać w jakimś polu
    private final String message;

    // tworzymy konstruktor
    ExceptionMessages(String s) {
        this.message = s;
    }
}
