package testingDates;
import static org.junit.Assert.*;

import org.junit.Test;

public class DateSetDateTest {
	Date testDate = new Date(3, 8, 2025);
	
	@Test
	public void LegalTest1() {
		testDate.setDate("June", 6, 2025);
		assertEquals(new Date("June", 6, 2025), testDate);
	}
	
	@Test
	public void LegalTest2() {
		testDate.setDate("March", 15, 2025);
		assertEquals(new Date("March", 15, 2025), testDate);
	}
	
	@Test
	public void LegalTest3() {
		testDate.setDate("April", 1, 2024);
		assertEquals(new Date("April", 1, 2024), testDate);
	}
	
	@Test
	public void IllegalTest1() {
		testDate.setDate("March", 32, 2025);
		assertEquals(new Date("March", 8, 2025), testDate);
	}
	
	@Test
	public void IllegalTest2() {
		testDate.setDate("March", 8, -1);
		assertEquals(new Date("March", 8, 2025), testDate);
	}
	
	@Test
	public void IllegalTest3() {
		testDate.setDate("February", 30, 2025);
		assertEquals(new Date("March", 8, 2025), testDate);
	}
}
