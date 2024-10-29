package lld.structuralPattern.DecoratorPattern;

import lld.structuralPattern.DecoratorPattern.Decorations.Corn;
import lld.structuralPattern.DecoratorPattern.Decorations.Mushroom;
import lld.structuralPattern.DecoratorPattern.Decorator.BasePizza;
import lld.structuralPattern.DecoratorPattern.Decorator.MargertihaPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Corn((new Mushroom(new MargertihaPizza())));
        System.out.println("Cost is " + basePizza.Cost());
    }
}
