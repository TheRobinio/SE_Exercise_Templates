package de.uni.koeln.sse.se;

public interface Visitor {

    public void visit(Furniture furniture);
    public void visit(Electronic electronic);
    public void visit(Glass glass);
}
