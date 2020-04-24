package burger;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class BurgerTest {
    @Test
    public void plainBurgerMethods(){
        PlainBurger plainBurger = new PlainBurger();
        String expected_desc = "beef Patty, lettuce, tomato";
        String actual_desc = plainBurger.getDescription();
        Assert.assertEquals(expected_desc, actual_desc);

        BigDecimal expected_cost = new BigDecimal(5.00);
        BigDecimal actual_cost = plainBurger.getCost();
        Assert.assertEquals(expected_cost, actual_cost);
    }

    @Test
    public void EggMethods(){
        PlainBurger plainBurger = new PlainBurger();
        Egg egg = new Egg(plainBurger);
        String expected_desc = plainBurger.getDescription() + ", egg";
        String actual_desc = egg.getDescription();
        Assert.assertEquals(expected_desc, actual_desc);

        BigDecimal expected_cost = plainBurger.getCost().add(new BigDecimal(1.00));
        BigDecimal actual_cost = egg.getCost();
        Assert.assertEquals(expected_cost, actual_cost);
    }

    @Test
    public void BaconMethods(){
        PlainBurger plainBurger = new PlainBurger();
        Bacon bacon = new Bacon(plainBurger);
        String expected_desc = plainBurger.getDescription() + ", bacon";
        String actual_desc = bacon.getDescription();
        Assert.assertEquals(expected_desc, actual_desc);

        BigDecimal expected_cost = plainBurger.getCost().add(new BigDecimal(2.00));
        BigDecimal actual_cost = bacon.getCost();
        Assert.assertEquals(expected_cost, actual_cost);
    }
}