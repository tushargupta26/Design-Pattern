package lld.design.splitwise.expense;

import lld.design.splitwise.expense.split.EqualExpenseSplit;
import lld.design.splitwise.expense.split.ExpenseSplit;
import lld.design.splitwise.expense.split.PercentageExpenseSplit;
import lld.design.splitwise.expense.split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType){

        switch (splitType){
            case EQUAL -> {
                return new EqualExpenseSplit();
            } case UNEQUAL -> {
                return new UnequalExpenseSplit();
            } case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }default -> {
                return null;
            }
        }
    }
}
