package exceptions.atm;

public class AtmApp {

    private static final Atm ATM = new Atm(1000d); // statyczny ATM

    public static void main(String[] args) {
        handleWithdraw(2000d);
        makeDeposit(15_000d);

    }

    // Stworzymy metodę, która bedzie opakowywac ten nasz withdraw dodatkowym ...?, ktory cos tam zrobi i coś wyswietli..
    public static void handleWithdraw(Double amount) {
        try {
            ATM.withdraw(amount);
        } catch (OutOfMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeDeposit(Double amount) {
        try {
            ATM.makeDeposit(amount);
        } catch (TooMuchMoneyException e) {
            System.out.println(e.getMessage());
        }
    }


}
