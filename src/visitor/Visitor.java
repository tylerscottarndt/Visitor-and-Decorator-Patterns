package visitor;

import element.AdultCat;
import element.BabyCat;

public interface Visitor {
    void visit(AdultCat adultCat);
    void visit(BabyCat babyCat);
    String getName();
}