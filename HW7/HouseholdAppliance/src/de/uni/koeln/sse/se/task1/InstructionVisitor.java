package de.uni.koeln.sse.se.task1;

public class InstructionVisitor implements Visitor{

    public void visit(Furniture item) {
        System.out.println(item.getName() + "should be covered with waterproof covers with area of: "+item.getWidth()+"x"+item.getLength());
    }
    public void visit(Electronic item) {
        System.out.println(item.getName()+" "+"should be covered with Polyethylene foam film and packed in a box with dimension: "
                +item.getWidth()+"x"+item.getLength()+"x"+item.getHeight());
    }
    public void visit(Glass item) {
        System.out.println(item.getName()+" "
                +"should be wrapped with Bubble wraps and packed in a Box with dimension: "
                +item.getWidth()+1+"x"+item.getLength()+1+"x"+item.getHeight()+1);
    }
}
