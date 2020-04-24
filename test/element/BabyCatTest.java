package element;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import visitor.Worker;
import visitor.Zookeeper;

public class BabyCatTest {

    private Zookeeper zookeeper = new Zookeeper("zookeeper");
    private Worker worker = new Worker("worker");
    private BabyCat babyCat;

    @Before
    public void createAdultCat(){
        babyCat = new BabyCat("baby cat");
    }

    @Test
    public void acceptZookeeper() {
        Assert.assertNull(babyCat.getMood());
        babyCat.accept(zookeeper);
        String expected = "annoyed and frightened";
        String actual = babyCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void acceptWorker() {
        Assert.assertNull(babyCat.getMood());
        babyCat.accept(worker);
        String expected = "happy and playful";
        String actual = babyCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "baby cat";
        String actual = babyCat.getName();
        Assert.assertEquals(expected, actual);
    }
}