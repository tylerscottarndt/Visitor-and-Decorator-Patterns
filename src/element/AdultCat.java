package element;

import visitor.Visitor;

public class AdultCat implements Element {
    private String name;
    private String mood = null;

    public AdultCat(String name){
        this.name = name;
    }

    @Override
    public void accept(Visitor v){ v.visit(this); }

    @Override
    public void setMood(String mood){ this.mood = mood; }

    @Override
    public String getMood(){ return mood; }

    @Override
    public String getName(){ return name; }
}