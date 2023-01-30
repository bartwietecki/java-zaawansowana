package lecture.threads;

public class SDAThread extends Thread {

    private String name;

    public SDAThread(String name) {
        this.name = name;
    }

    // alt + insert -> override dla metody run
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()); // każde wywołanie metody run będzie wyświetlać nazwę wątku
        System.out.println("Thread name: " + Thread.currentThread().getName() + " person name: " + name);
    }
}
