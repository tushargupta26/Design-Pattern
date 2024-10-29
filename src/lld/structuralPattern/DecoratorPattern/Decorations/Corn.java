package lld.structuralPattern.DecoratorPattern.Decorations;

import lld.structuralPattern.DecoratorPattern.Decorator.BasePizza;

public class Corn extends Toppings{

    BasePizza basePizza;

    public Corn(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int Cost() {
        return basePizza.Cost() + 40;
    }
}
