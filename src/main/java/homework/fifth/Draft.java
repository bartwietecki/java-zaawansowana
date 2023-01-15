package homework.fifth;

public class Draft <T> {
    public static void main(String[] args) {
        Draft<Integer> pair1 = new Draft<>(54, 44);
        pair1.first();

        Draft<Integer> pair2 = new Draft<>(54, 44);
        pair2.second();
    }

    T firstNumber;
    T secondNumber;

    public Draft(T firstNumber, T secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void first(){
        System.out.println(firstNumber);
    }

    public void second(){
        System.out.println(secondNumber);
    }

}


//    public static void main(String[] args) {
//        Pair pair1 = new Pair(2,2);
//        pair1.first();
//
//        Pair pair2 = new Pair(3,3);
//        pair2.second();
//    }
//
//    Integer first;
//    Integer second;
//
//    public Pair(Integer first, Integer second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public void first(){
//        System.out.println(first);
//    }
//
//    public void second(){
//        System.out.println(second);
//    }
//}