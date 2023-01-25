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

        getArea();
        getCircuit();

    }
    static Circle circle = new Circle();
    static double r = circle.getRadius();

    static void getArea(){
        double circleArea = 3.14159 * r * r;
        System.out.println("Area: " + circleArea);
    }

    static void getCircuit(){
        double circleCircuit = 2 * 3.14159 * r;
        System.out.println("Circuit: " + circleCircuit);
    }

}