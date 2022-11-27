package de.uni.koeln.sse.se.task2;

public interface Visitor {

    void visit(Leaf leaf);
    void visit(Composite composite);
}
