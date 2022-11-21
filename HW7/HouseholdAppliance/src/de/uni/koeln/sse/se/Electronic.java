package de.uni.koeln.sse.se;

public class Electronic implements HouseholdItem{
	
	String name;
	
	int lenght;
	int width;
	int height;

	int weight;
	
	Boolean fragile;
	final static double[] prices = {(double) 5/15,(double) 5/10};
	


	public Electronic(String name, int lenght, int width, int height, int weight, Boolean fragile) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
	}

	
//Getters and Setters

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLength() {
		return lenght;}

	public void setLength(int length) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(int weight) {
		this.weight = weight;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	public Boolean getFragile() {
		return fragile;}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;}
	
	
	

}
