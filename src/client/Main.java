package client;

import element.AdultCat;
import element.BabyCat;
import element.Element;
import visitor.Visitor;
import visitor.Zookeeper;
import visitor.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // visitor pattern

    public static void main(String[] args){
        List<Visitor> zooStaff = new ArrayList<>();
        zooStaff.add(new Zookeeper("Joe Exotic"));
        zooStaff.add(new Zookeeper("Doc Antel"));
        zooStaff.add(new Zookeeper("Carole Baskin"));
        zooStaff.add(new Zookeeper("Tim Stark"));
        zooStaff.add(new Worker("Kelci Saffery"));
        zooStaff.add(new Worker("John Finlay"));
        zooStaff.add(new Worker("Erik Crowe"));
        zooStaff.add(new Worker("John Reinke"));

        List<Element> cats = new ArrayList<>();
        cats.add(new AdultCat("Shere Kahn"));
        cats.add(new AdultCat("Aslan"));
        cats.add(new AdultCat("Tigger"));
        cats.add(new AdultCat("Mufasa"));
        cats.add(new AdultCat("Cecil the Lion"));
        cats.add(new BabyCat("Simba"));
        cats.add(new BabyCat("Nala"));
        cats.add(new BabyCat("Kovu"));

        int i = 0;
        while(i < zooStaff.size() && i < cats.size()){
            Visitor staffMember = zooStaff.get(i);
            Element cat = cats.get(i);
            cat.accept(staffMember);
            System.out.println(cat.getName() + " has been visited by " +
                    staffMember.getName() + " and is now " + cat.getMood() + ".\n");
            i++;
        }
    }
}
