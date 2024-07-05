package machine;

import static java.lang.System.out;

import static machine.CoffeeMachine.money;

public class TakeMoney {
    protected static void takeMoney() {
        out.println("I gave you $" + money);
        money = 0;
    }
}
