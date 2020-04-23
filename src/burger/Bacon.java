package burger;

import java.math.BigDecimal;

public class Bacon extends BurgerDecorator {
    public Bacon(BurgerComponent tempBurger) {
        super(tempBurger);
        System.out.println("Adding bacon...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bacon";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.00));
    }
}