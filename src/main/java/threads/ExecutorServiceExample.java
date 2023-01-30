package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> numbers = prepare(1000); // lista tysiąca integerów
//        executeTasks(numbers);

        var result = executeTasks(numbers);
        System.out.println("Przetworzono: " + result.size() + " liczb.");

        var events = result.stream().filter(f -> {
            try {
                return f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        System.out.println("Parzystych liczb: " + events.size());

        // atomic integerem policzymy te liczby, które nie są parzyste
        // Atomici są bezpieczne wielowątkowo i możemy się do nich dostać z wielu wątków lub strumieni

        AtomicReference<Integer> oddCount = new AtomicReference<>(0);
        result.stream().filter(f -> {
            Boolean isEven = false;
            try {
                isEven = f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            if (!isEven) {
                oddCount.getAndSet(oddCount.get() + 1);
            }
            return isEven;
        }).toList();
        System.out.println("Nieparzystych liczb: " + oddCount);

    }

    private static List<Future<Boolean>> executeTasks(List<Integer> numbers) throws InterruptedException, ExecutionException {
        List<Callable<Boolean>> tasks = new ArrayList<>();
        for (Integer num : numbers) {
            tasks.add(createTask(num));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Boolean>> result = executorService.invokeAll(tasks);
        executorService.shutdown();
        return result;

    }

    /*
    private static void executeTasks(List<Integer> numbers) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (Integer num : numbers) {
            tasks.add(createTask(num));
        }
        // na 10 wątkach będzie pracował mój ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // teraz chcę, aby ExecutorService wywoał wszystkie taski
//        executorService.invokeAll(tasks);
        List<Future<Integer>> result = executorService.invokeAll(tasks);
        executorService.shutdown();
//        System.out.println(result);
        System.out.println(result.get(0).get());
        System.out.println(result.size());
    }
     */

    private static Callable<Boolean> createTask(Integer number) {
        // zwrócenie implementacji interface'u Callable przy użyciu wyrażenia Lambda
        return () -> {
            if (isEven(number)) {
                System.out.println("Liczba parzysta! " + number);
                return true;
            }
            return false;
        };
    }

    /*
    private static Callable<Integer> createTask(Integer number) {
        // zwrócenie implementacji interface'u Callable przy użyciu wyrażenia Lambda
        return () -> {
            if (isEven(number)) {
                System.out.println("Liczba parzysta! " + number);
            }
            return null;
        };
    }
     */

    /*
    private Callable<Integer> createTask(Integer number) {
        return new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                if (isEven(number)) {
                    System.out.println("Liczba parzysta! " + number);
                }
                return null;
            }
        };
    }
     */

    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    private static List<Integer> prepare(int range) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            numbers.add((int) (Math.random() * (range * 10)));
        }
        return numbers;
    }


}
