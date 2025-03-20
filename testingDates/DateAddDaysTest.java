package testingDates;
import static org.junit.Assert.*;

import org.junit.Test;

public class DateAddDaysTest {
	Date testDate = new Date("March", 8, 2025);
	
	@Test
	public void stayInSameMonth() {
		assertEquals(new Date("March", 9, 2025), testDate.addDay(5));
	}
	
	@Test
	public void crossMonth() {
		assertEquals(new Date("April", 7, 2025), testDate.addDay(30));
	}
	
	@Test
	public void crossYear() {
		assertEquals(new Date("March", 8, 2026), testDate.addDay(365));
	}
}
