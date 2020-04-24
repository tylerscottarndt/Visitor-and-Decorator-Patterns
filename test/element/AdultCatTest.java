package element;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import visitor.Worker;
import visitor.Zookeeper;

public class AdultCatTest {
    private Zookeeper zookeeper = new Zookeeper("zookeeper");
    private Worker worker = new Worker("worker");
    private AdultCat adultCat;

    @Before public void createAdultCat(){
        adultCat = new AdultCat("adult cat");
    }

    @Test
    public void acceptZookeeper() {
        Assert.assertNull(adultCat.getMood());
        adultCat.accept(zookeeper);
        String expected = "hungry and angry";
        String actual = adultCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void acceptWorker() {
        Assert.assertNull(adultCat.getMood());
        adultCat.accept(worker);
        String expected = "fed, groomed, and healthy";
        String actual = adultCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "adult cat";
        String actual = adultCat.getName();
        Assert.assertEquals(expected, actual);
    }
}