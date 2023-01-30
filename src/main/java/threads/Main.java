package threads;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var names = List.of("Bartek", "Adam", "Maria", "Julia", "Karol", "Jan",
                "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan","Bartek", "Adam", "Maria", "Julia", "Karol", "Jan",
                "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan", "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan",
                "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan", "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan",
                "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan", "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan",
                "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan", "Bartek", "Adam", "Maria", "Julia", "Karol", "Jan");
        String hi = "Cześć! ";

        for (int i = 0; i < names.size(); i=i+2) {
            var thread0 = new SDAThread(hi + names.get(i));
            var thread1 = new SDAThread(hi + names.get(i+1));
            thread0.start();
            thread1.start();
        }





    }

}









//        SDAThread sdaThread = new SDAThread("Bartek");
//        sdaThread.start();
//        SDAThread sdaThread1 = new SDAThread("Dawid");
//        sdaThread1.start();
//        SDAThread sdaThread2 = new SDAThread("Kuba");
//        sdaThread2.start();
//        SDAThread sdaThread3 = new SDAThread("Kamil");
//        sdaThread3.start();
//        SDAThread sdaThread4 = new SDAThread("Julia");
//        sdaThread4.start();
//        SDAThread sdaThread5 = new SDAThread("Tomek");
//        sdaThread5.start();

        // każdy watęk jest obsługiwany przez inny wątek procesora


