import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("CALCULATOR");

        Calculator Value = new Calculator();

        System.out.println("Enter value for value a");
        double a = userInput.nextDouble();

        System.out.println("Enter value for value b");
        double b = userInput.nextDouble();

        Value.Addition(a,b);

        if (a < b){
            System.out.println("Error! the value of a of a is greater than value of b");
        } else{
            Value.Subtraction(a,b);
        }

        Value.Multiplication(a,b);

        Value.Division(a,b);

    }
}