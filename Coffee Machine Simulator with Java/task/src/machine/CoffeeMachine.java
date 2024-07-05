package machine;

import static java.lang.System.out;


public class CoffeeMachine {
    static int money;
    static int water;
    static int milk;
    static int coffeeBeans;
    static int disposableCups;

    protected CoffeeMachine(int money, int water, int milk, int coffeeBeans, int disposableCups) {
        CoffeeMachine.money = money;
        CoffeeMachine.water = water;
        CoffeeMachine.milk = milk;
        CoffeeMachine.coffeeBeans = coffeeBeans;
        CoffeeMachine.disposableCups = disposableCups;
    }

    protected static void displayMachineState() {
        out.println("The coffee machine has:");
        out.println(water + " ml of water");
        out.println(milk + " ml of milk");
        out.println(coffeeBeans + " g of coffee beans");
        out.println(disposableCups + " disposable cups");
        out.println("$" + money + " of money");
    }
}