package burger;

import java.math.BigDecimal;

public class PlainBurger implements BurgerComponent {
    public PlainBurger(){
        System.out.println("Adding beef patty, lettuce, and tomato...");
    }

    @Override
    public String getDescription() { return "beef Patty, lettuce, tomato"; }

    @Override
    public BigDecimal getCost() { return new BigDecimal(5.00); }
}
