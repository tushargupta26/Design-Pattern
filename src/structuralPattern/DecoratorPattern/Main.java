package structuralPattern.DecoratorPattern;

import structuralPattern.DecoratorPattern.Decorations.Corn;
import structuralPattern.DecoratorPattern.Decorations.Mushroom;
import structuralPattern.DecoratorPattern.Decorator.BasePizza;
import structuralPattern.DecoratorPattern.Decorator.MargertihaPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Corn((new Mushroom(new MargertihaPizza())));
        System.out.println("Cost is " + basePizza.Cost());
    }
}
