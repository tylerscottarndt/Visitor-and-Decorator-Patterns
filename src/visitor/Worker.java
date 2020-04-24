package visitor;

import element.AdultCat;
import element.BabyCat;

public class Worker implements Visitor{
    private String name;

    public Worker(String name){
        this.name = name;
    }

    @Override
    public void visit(AdultCat adultCat) {
        adultCat.setMood("fed, groomed, and healthy");
    }

    @Override
    public void visit(BabyCat babyCat) {
        babyCat.setMood("happy and playful");
    }

    @Override
    public String getName() { return name; }
}