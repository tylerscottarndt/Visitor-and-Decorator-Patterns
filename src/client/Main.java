package client;

import element.AdultCat;
import element.BabyCat;
import element.Element;
import visitor.Visitor;
import visitor.Zookeeper;
import visitor.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Visitor Pattern

        // list of zoo staff members
        List<Visitor> zooStaff = new ArrayList<>();
        zooStaff.add(new Zookeeper("Joe Exotic"));
        zooStaff.add(new Zookeeper("Doc Antel"));
        zooStaff.add(new Zookeeper("Carole Baskin"));
        zooStaff.add(new Zookeeper("Tim Stark"));
        zooStaff.add(new Worker("Kelci Saffery"));
        zooStaff.add(new Worker("John Finlay"));
        zooStaff.add(new Worker("Erik Crowe"));
        zooStaff.add(new Worker("John Reinke"));

        // list of big cats
        List<Element> bigCats = new ArrayList<>();
        bigCats.add(new AdultCat("Shere Kahn"));
        bigCats.add(new AdultCat("Aslan"));
        bigCats.add(new AdultCat("Tigger"));
        bigCats.add(new AdultCat("Mufasa"));
        bigCats.add(new AdultCat("Cecil the Lion"));
        bigCats.add(new BabyCat("Simba"));
        bigCats.add(new BabyCat("Nala"));
        bigCats.add(new BabyCat("Kovu"));

        // randomize lists
        Collections.shuffle(zooStaff);
        Collections.shuffle(bigCats);

        // match big cats with zoo staff members
        int i = 0;
        while(i < zooStaff.size() && i < bigCats.size()){
            Visitor staffMember = zooStaff.get(i);
            Element cat = bigCats.get(i);
            cat.accept(staffMember);
            System.out.println(cat.getName() + " has been visited by " +
                    staffMember.getName() + " and is now " + cat.getMood() + ".\n");
            i++;
        }
    }
}
