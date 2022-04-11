import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assembly {
    public static void assemblyFunction() throws IOException {
        for (; ; ) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int numOne = Integer.parseInt(input.next());
            System.out.println("Enter number 2: ");
            int numTwo = Integer.parseInt(input.next());

            Action action = new Action(numOne, numTwo);
            BufferedReader choiceSymbol = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter SYMBOL");
            String selectActTwo = choiceSymbol.readLine();

            action.whichActionNumbers(selectActTwo);
        }
    }
}
