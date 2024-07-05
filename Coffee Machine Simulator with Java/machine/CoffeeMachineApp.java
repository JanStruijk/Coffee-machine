package machine;

import java.util.Scanner;
import static java.lang.System.out;

import static machine.ProcessInput.processInput;

@SuppressWarnings("ALL") // Otherwise it'll claim that coffeeMachine isn't used - but it is. - this isn't necessary for the program to function.
public class CoffeeMachineApp {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(550, 400, 540, 120, 9);
        Scanner s = new Scanner(System.in);

        while (true) {
            out.println("Write action (buy, fill, take, remaining, exit):");
            String action = s.nextLine();

            if (action.equals("exit")) {
                break;
            }

            processInput(action);
        }
    }
}