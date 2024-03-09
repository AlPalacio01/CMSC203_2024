import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	private GradeBook gradebook1, gradebook2;
	

	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		gradebook1.addScore(99.9);
		gradebook1.addScore(88.8);
		gradebook1.addScore(77.7);
		gradebook1.addScore(66.6);
		gradebook1.addScore(55.5);
		
		gradebook2.addScore(90.1);
		gradebook2.addScore(80.2);
		gradebook2.addScore(70.3);
		gradebook2.addScore(60.4);
		gradebook2.addScore(50.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradebook1.toString().equals("99.9 88.8 77.7 66.6 55.5 "));
		assertTrue(gradebook2.toString().equals("90.1 80.2 70.3 60.4 50.5 "));
	}

	@Test
	void testSum() {
		
		assertEquals(388.5, gradebook1.sum());
		assertEquals(351.5, gradebook2.sum());
	}

	@Test
	void testMinimum() {

		assertEquals(55.5, gradebook1.minimum());
		assertEquals(50.5, gradebook2.minimum());
		
	}

	@Test
	void testFinalScore() {
		
		assertEquals(333.0, gradebook1.finalScore());
		assertEquals(301.0, gradebook2.finalScore());
	}

}
