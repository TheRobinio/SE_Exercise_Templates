package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	Elv_States ev = Elv_States.IDLE;
	

	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		if(go()) {
			System.out.println("You arrived at the destination floor");
		} else {
			System.out.println("Elevator failure. Please contact admin.");
		}

	}

	private boolean go() {
		try {Thread.sleep(1000);} catch (InterruptedException e) {};
		if (current_Floor == dest_Floor && ev == Elv_States.IDLE) {
			return exit();
		};

		System.out.println("You are on floor:"+current_Floor);

		if(current_Floor < dest_Floor) {
			ev = Elv_States.MOVING_UP;
			current_Floor += ev.elevate();
		} else if (current_Floor > dest_Floor) {
			ev = Elv_States.MOVING_DOWN;
			current_Floor += ev.elevate();
		} else if (current_Floor == dest_Floor && ev != Elv_States.IDLE) {
			ev = Elv_States.IDLE;
		}
		return go();
	}

	private boolean exit() {
		return true;
	}
}
