package machine;

import java.util.Scanner;
import static java.lang.System.out;

import static machine.MakeCoffee.makeCoffee;

public class BuyDrink {
    static void buyDrink() {
        Scanner s = new Scanner(System.in);
        out.println("What do you want to buy?");

        for (DrinkType drinkType : DrinkType.values()) {
            out.println(drinkType.getCode() + " - " + drinkType.getName());
        }

        out.println("back - to main menu:");
        String choice = s.nextLine();

        if (choice.equals("back")) {
            return;
        }

        int drinkCode = Integer.parseInt(choice);

        for (DrinkType drinkType : DrinkType.values()) {
            if (drinkType.getCode() == drinkCode) {
                makeCoffee(drinkType);
                return;
            }
        }
        out.println("Invalid choice!");
    }
}
