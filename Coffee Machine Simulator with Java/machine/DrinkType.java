package machine;

enum DrinkType {
    ESPRESSO(1, "Espresso", 250, 0, 16, 4),
    LATTE(2, "Latte", 350, 75, 20, 7),
    CAPPUCCINO(3, "Cappuccino", 200, 100, 12, 6),
    COFFEE(4, "Coffee", 200, 0, 12, 6),
    WATER(5, "Water", 200, 0, 0, 2);

    private final int code;
    private final String name;
    private final int waterNeeded;
    private final int milkNeeded;
    private final int coffeeBeansNeeded;
    private final int cost;

    DrinkType(int code, String name, int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int cost) {
        this.code = code;
        this.name = name;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
        this.cost = cost;
    }

    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    int getWaterNeeded() {
        return waterNeeded;
    }

    int getMilkNeeded() {
        return milkNeeded;
    }

    int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }

    int getCost() {
        return cost;
    }
}