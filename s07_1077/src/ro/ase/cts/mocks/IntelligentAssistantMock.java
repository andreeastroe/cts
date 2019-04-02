package ro.ase.cts.mocks;

import ro.ase.cts.exceptions.InvalidNumberOfSeatsException;
import ro.ase.cts.models.IntelligentAssistant;

public class IntelligentAssistantMock implements IntelligentAssistant {

	private int emptySeats;
	
	@Override
	public int smartMonitorinfOfEmptySeats(String planeID) {
		
		return emptySeats;
	}

	public void setEmptySeats(int emptySeats) {
		this.emptySeats = emptySeats;
	}
	
	
}
