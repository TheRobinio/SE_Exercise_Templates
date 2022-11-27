package de.uni.koeln.sse.se.task2;

import java.util.HashSet;

public class Composite implements OlympicComponent{

    public String name;

    HashSet<OlympicComponent> nodes = new HashSet<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(OlympicComponent olympicComponent) {
        nodes.add(olympicComponent);
    }

    public void remove(OlympicComponent olympicComponent) {
        nodes.remove(olympicComponent);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
