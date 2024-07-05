package machine;

import static java.lang.System.out;

import static machine.CoffeeMachine.coffeeBeans;
import static machine.CoffeeMachine.disposableCups;
import static machine.CoffeeMachine.milk;
import static machine.CoffeeMachine.money;
import static machine.CoffeeMachine.water;

class MakeCoffee {
    protected static void makeCoffee(DrinkType drinkType) {
        if (water >= drinkType.getWaterNeeded() && milk >= drinkType.getMilkNeeded()
                && coffeeBeans >= drinkType.getCoffeeBeansNeeded() && disposableCups > 0) {
            out.println("I have enough resources, making " + drinkType.getName() + "!");
            money += drinkType.getCost();
            water -= drinkType.getWaterNeeded();
            milk -= drinkType.getMilkNeeded();
            coffeeBeans -= drinkType.getCoffeeBeansNeeded();
            disposableCups--;
        } else {
            out.println("Not enough resources to make " + drinkType.getName() + "!");
        }
    }
}
