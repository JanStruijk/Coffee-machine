package machine;

import java.util.Scanner;
import static java.lang.System.out;

import static machine.CoffeeMachine.coffeeBeans;
import static machine.CoffeeMachine.disposableCups;
import static machine.CoffeeMachine.milk;
import static machine.CoffeeMachine.water;

class FillSupplies {
    protected static void fillSupplies() {
        Scanner s = new Scanner(System.in);
        out.println("Write how many ml of water you want to add:");
        water += s.nextInt();
        out.println("Write how many ml of milk you want to add:");
        milk += s.nextInt();
        out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += s.nextInt();
        out.println("Write how many disposable cups you want to add:");
        disposableCups += s.nextInt();
    }
}
