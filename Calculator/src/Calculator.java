import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = input.nextInt();

        System.out.print("enter operator (+,-,*,/)");
        char operator = input.next().charAt(0);

        System.out.println("enter second number: ");
        int num2 = input.nextInt();

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("error: this number cant divide by zero");
                    }else{
                        result = num1 / num2;
                        System.out.println("result: " + result);
                    }
                break;
            default:
                System.out.println("Error invalid operator");
        }
        input.close();
    }
}
