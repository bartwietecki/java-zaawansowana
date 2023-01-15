package homework.first;

public class CircleApp {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        double r = circle.getRadius();
//
//        double circleArea = 3.14159 * r * r;
//        double circleCircuit = 2 * 3.14159 * r;
//
//        System.out.println("Area: " + circleArea);
//        System.out.println("Circuit: " + circleCircuit);

        circleAreaCalculation();
        circleCircuitCalculation();

    }
    static Circle circle = new Circle();
    static double r = circle.getRadius();

    static void circleAreaCalculation(){
        double circleArea = 3.14159 * r * r;
        System.out.println("Area: " + circleArea);
    }

    static void circleCircuitCalculation(){
        double circleCircuit = 2 * 3.14159 * r;
        System.out.println("Circuit: " + circleCircuit);
    }

}