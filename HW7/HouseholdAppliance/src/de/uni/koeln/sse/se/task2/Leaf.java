package de.uni.koeln.sse.se.task2;

public class Leaf implements OlympicComponent{

    String name;
    int numOfAthletes;
    int numOfMedals;

    public Leaf(String name, int numOfAthlete, int numOfMedals) {

        this.name = name;
        this.numOfAthletes = numOfAthlete;
        this.numOfMedals = numOfMedals;
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
