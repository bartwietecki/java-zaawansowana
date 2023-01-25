package homework.fifth;

public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        First first1 = new First();
        System.out.println(first1.first);

        Second second1 = new Second();
        System.out.println(second1.second);
    }

}