package DecoratorPattern;

import DecoratorPattern.Decorations.Corn;
import DecoratorPattern.Decorations.Mushroom;
import DecoratorPattern.Decorator.BasePizza;
import DecoratorPattern.Decorator.ChesseBurstPizza;
import DecoratorPattern.Decorator.MargertihaPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Corn((new Mushroom(new MargertihaPizza())));
        System.out.println("Cost is " + basePizza.Cost());
    }
}
