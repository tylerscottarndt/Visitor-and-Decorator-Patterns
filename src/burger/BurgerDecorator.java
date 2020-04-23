package burger;

import java.math.BigDecimal;

public abstract class BurgerDecorator implements BurgerComponent {
    private BurgerComponent tempBurger;

    public BurgerDecorator(BurgerComponent tempBurger){
        this.tempBurger = tempBurger;
    }

    @Override
    public String getDescription(){ return tempBurger.getDescription(); }

    @Override
    public BigDecimal getCost(){ return tempBurger.getCost(); }
}
