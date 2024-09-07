package DecoratorPattern.Decorations;

import DecoratorPattern.Decorator.BasePizza;

public class Mushroom extends Toppings{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int Cost() {
        return basePizza.Cost() + 60;
    }
}
