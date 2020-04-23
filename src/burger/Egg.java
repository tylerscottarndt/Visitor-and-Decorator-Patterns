package burger;

import java.math.BigDecimal;

public class Egg extends BurgerDecorator {
    public Egg(BurgerComponent tempBurger) {
        super(tempBurger);
        System.out.println("Adding egg...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", egg";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.00));
    }
}
