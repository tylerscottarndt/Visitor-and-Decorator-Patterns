package visitor;

import element.AdultCat;
import element.BabyCat;
import org.junit.Assert;
import org.junit.Test;

public class ZookeeperTest {
    private Zookeeper zookeeper = new Zookeeper("Tyler");
    private AdultCat adultCat = new AdultCat("adult cat");
    private BabyCat babyCat = new BabyCat("baby cat");

    @Test
    public void visitAdultCat(){
        String expected = "hungry and angry";
        zookeeper.visit(adultCat);
        String actual = adultCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void visitBabyCat(){
        String expected = "annoyed and frightened";
        zookeeper.visit(babyCat);
        String actual = babyCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Tyler";
        String actual = zookeeper.getName();
        Assert.assertEquals(expected, actual);
    }
}