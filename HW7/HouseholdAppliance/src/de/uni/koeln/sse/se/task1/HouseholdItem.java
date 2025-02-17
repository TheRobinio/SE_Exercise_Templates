package de.uni.koeln.sse.se.task1;

public interface HouseholdItem {

    public int getHeight();

    public void setHeight(int height);

    public int getLength();

    public void setLength(int length);
    public int getWidth();
    public void setWidth(int width);
    public String getName();
    public void setName(String name);
    public void accept(Visitor visitor);

}
