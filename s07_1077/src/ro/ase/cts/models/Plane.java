package ro.ase.cts.models;

import ro.ase.cts.exceptions.InvalidNumberOfSeatsException;

public class Plane {

	private String planeID;
	private String model;
	private int availableSeats;
	
	public Plane() {}
	
	public Plane(String planeID, String model) {
		super();
		this.planeID = planeID;
		this.model = model;
	}
	public String getPlaneID() {
		return planeID;
	}
	public void setPlaneID(String planeID) {
		this.planeID = planeID;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public void intelligentDetectionOfAvailableSeats(IntelligentAssistant smartAPI) throws InvalidNumberOfSeatsException {
		System.out.println("Connecting to internet...");
		System.out.println("Accessing smart system...");
		int numberOfSeats = smartAPI.smartMonitorinfOfEmptySeats(this.planeID);
		if(numberOfSeats < 0 || numberOfSeats >= Integer.MAX_VALUE) {
			throw new InvalidNumberOfSeatsException("Number of empty seats cannot be negative.");
		}
		this.availableSeats = smartAPI.smartMonitorinfOfEmptySeats(this.planeID);
	}
	
}
