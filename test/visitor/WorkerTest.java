package visitor;

import element.AdultCat;
import element.BabyCat;
import org.junit.Assert;
import org.junit.Test;

public class WorkerTest {
    private Worker worker = new Worker("Sam");
    private AdultCat adultCat = new AdultCat("adult cat");
    private BabyCat babyCat = new BabyCat("baby cat");

    @Test
    public void visitAdultCat(){
        String expected = "fed, groomed, and healthy";
        worker.visit(adultCat);
        String actual = adultCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void visitBabyCat(){
        String expected = "happy and playful";
        worker.visit(babyCat);
        String actual = babyCat.getMood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Sam";
        String actual = worker.getName();
        Assert.assertEquals(expected, actual);
    }
}