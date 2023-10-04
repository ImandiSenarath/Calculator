public class Calculator {
    private double result ;


    public void Addition(double a, double b) {

        System.out.println("Result of addition = "+(a+b));
    }

    public void Subtraction(double a, double b ) {

        System.out.println("Result of subtraction = "+(a-b) );
    }

    public void Multiplication(double a, double b) {

        System.out.println("Result of multiplication = "+(a*b) );
    }

    public void Division(double a, double b) {
        if (a != 0) {

            System.out.println("Result of division = "+(a/b));
        } else {
            System.out.println("Error: Division by zero.");
        }
    }
}