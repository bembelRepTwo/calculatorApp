import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Action {
    public int numOne;
    public int numTwo;
    public int result;

    public Action(int nO, int nT) {
        numOne = nO;
        numTwo = nT;
    }

    public void whichActionNumbers(String symbol) {
        switch (symbol) {
            case "+":
                result = numOne + numTwo;
                System.out.println(numOne);
                System.out.println(numTwo);
                System.out.println("Result plus: " + result);
                break;
            case "-":
                result = numOne - numTwo;
                System.out.println(numOne);
                System.out.println(numTwo);
                System.out.println("Result minus: " + result);
                break;
            case "*":
                result = numOne * numTwo;
                System.out.println(numOne);
                System.out.println(numTwo);
                System.out.println("Result multiplication: " + result);
                break;
            case "/":
                result = numOne / numTwo;
                System.out.println(numOne);
                System.out.println(numTwo);
                System.out.println("Result divide: " + result);
                break;
            case "q":
                System.out.println("exit");
                break;
        }
    }
}
