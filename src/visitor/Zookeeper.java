package visitor;

import element.AdultCat;
import element.BabyCat;

public class Zookeeper implements Visitor {
    private String name;

    public Zookeeper(String name){
        this.name = name;
    }

    @Override
    public void visit(AdultCat adultCat){
        adultCat.setStatus("hungry and angry");
    }

    @Override
    public void visit(BabyCat babyCat){
        babyCat.setStatus("annoyed and frightened");
    }

    @Override
    public String getName(){ return name; }
}