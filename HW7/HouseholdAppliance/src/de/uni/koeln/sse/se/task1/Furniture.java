package de.uni.koeln.sse.se.task1;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int lenght;
	int width;
	int height;
	
	int weight;
	final static double price = (double) 5/20;

	
	public Furniture(String name, String type, int lenght, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}


	

//Getters and Setters



	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLength() {
		return lenght;}

	public void setLength(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;	}

	public void setWidth(int width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}



}
