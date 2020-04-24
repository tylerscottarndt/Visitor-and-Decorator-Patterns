package element;

import visitor.Visitor;

public interface Element {
    void accept(Visitor v);
    void setMood(String mood);
    String getMood();
    String getName();
}