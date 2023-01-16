package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tomek");
        queue.add("Kamil");
        queue.offer("Tomek");
        queue.offer("Kamil");

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        /*
        System.out.println(queue.peek()); // te metody służą do tego, aby wyciągnąć coś z kolejki
        System.out.println(queue.poll());
        // PEEK - dostajemy się do elementu
        // POLL - dostajemy się do elementu pierwszego, ale dodatkowo usuwamy go z kolejki
        */

    }
}
