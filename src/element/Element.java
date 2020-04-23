package element;

import visitor.Visitor;

public interface Element {
    void accept(Visitor v);
    void setStatus(String status);
    String getMood();
    String getName();
}