package de.uni.koeln.se.state;

public enum Elv_States {
	
	MOVING_UP(1),
	MOVING_DOWN(-1),
	IDLE(0);

	private final int change;

	Elv_States(int change) {
		this.change = change;
	}

	public int elevate() {
		return this.change;
	}
}
