import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculatertest.Calculater;

public class CalculaterTest {
	
	Calculater cal;
	
	@Before
	public void setup() {
		cal =new Calculater();
		
	}
	
	@Test
	public void addTwoNumbers() {
		assertEquals(20, cal.add(10, 10));
	}

	
	@Test
	public void subtractTwoNumbers() {
		assertEquals(10, cal.sub(20, 10));
	}
	
	@Test
	public void mulTwoNumbers() {
		assertEquals(50, cal.mul(5, 10));
	}

	
	@Test
	public void devideTwoNumbers() {
		assertEquals(2, cal.div(20, 10));
	}

}
