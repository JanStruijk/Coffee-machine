package machine;

import static java.lang.System.out;

import static machine.BuyDrink.buyDrink;
import static machine.CoffeeMachine.displayMachineState;
import static machine.FillSupplies.fillSupplies;
import static machine.TakeMoney.takeMoney;

class ProcessInput {
    protected static void processInput(String input) {
        switch (input) {
            case "buy" -> buyDrink();
            case "fill" -> fillSupplies();
            case "take" -> takeMoney();
            case "remaining" -> displayMachineState();
            default -> out.println("Invalid action!");
        }
    }
}
