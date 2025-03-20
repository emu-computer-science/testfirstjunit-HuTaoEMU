package testingDates;
import static org.junit.Assert.*;

import org.junit.Test;

public class DateAddDaysTest {
	Date testDate = new Date("March", 8, 2025);
	
	@Test
	public void stayInSameMonth() {
		assertEquals(new Date("March", 9, 2025), testDate.addOneDay());
	}
	
	@Test
	public void crossMonth() {
		Date test2 = new Date("March", 31, 2025);
		assertEquals(new Date("April", 1, 2025), test2.addOneDay());
	}
	
	@Test
	public void crossYear() {
		Date test3 = new Date("December", 31, 2025);
		assertEquals(new Date("January", 1, 2026), test3.addOneDay());
	}
}
