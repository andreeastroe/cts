package ro.ase.cts.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;

import ro.ase.cts.exceptions.InvalidNumberOfSeatsException;
import ro.ase.cts.mocks.IntelligentAssistantMock;
import ro.ase.cts.models.IntelligentAssistant;
import ro.ase.cts.models.Plane;

public class PlaneTests {

	private Plane plane;
	private IntelligentAssistantMock intelligentAssistantMock;
	
	@Before
	public void setUp() {
		plane = new Plane("Plane0001", "Boeing 737");
		intelligentAssistantMock = new IntelligentAssistantMock();
	}
	
	@Test
	public void testIntelligentNumberOfSeats() {
		this.intelligentAssistantMock.setEmptySeats(20);
		try {
			this.plane.intelligentDetectionOfAvailableSeats(this.intelligentAssistantMock);
			assertEquals(this.intelligentAssistantMock.smartMonitorinfOfEmptySeats("Plane001"), this.plane.getAvailableSeats());
		} catch (InvalidNumberOfSeatsException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIntelligentNoSNegative() {
		this.intelligentAssistantMock.setEmptySeats(-10);
		try {
			this.plane.intelligentDetectionOfAvailableSeats(this.intelligentAssistantMock);
			fail("Number of empty seats should not be negative");
		} catch (InvalidNumberOfSeatsException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIntelligentNoSMaximumInt() {
		this.intelligentAssistantMock.setEmptySeats(Integer.MAX_VALUE);
		try {
			this.plane.intelligentDetectionOfAvailableSeats(this.intelligentAssistantMock);
			fail("Number of empty seats should not be Integer.MAX_VALUE");
		} catch (InvalidNumberOfSeatsException e) {
			e.printStackTrace();
		}
	}
}
