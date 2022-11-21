package de.uni.koeln.sse.se;

public class PriceVisitor implements Visitor {

    public void visit(Furniture item) {
        System.out.println("Total cost of "+item.getName()+" is "+ Furniture.price *item.getWeight());
    }
    public void visit(Electronic item) {
        System.out.println("Total cost of "+item.getName()+" is "
                + (item.getFragile() ? Electronic.prices[1]*item.getWeight() : Electronic.prices[0]*item.getWeight()));
    }
    public void visit(Glass item) {
        System.out.println("Total cost of "+item.getName()+" is "+Glass.price[item.getTickness()-1]);
    }
}
