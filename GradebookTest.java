import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTest {
	Gradebook g1;
	Gradebook g2;
	@BeforeEach
	void setUp() throws Exception {
		
		 g1 = new Gradebook(5);
		 g2 = new Gradebook(5);
		g1.addScore(67);
		g1.addScore(94);
		g1.addScore(88);
		g2.addScore(78);
		g2.addScore(56);
		g2.addScore(100);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1= null;
		g2= null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("67.0 94.0 88.0 "), "addScore fail to add a new score");
		assertEquals(g1.getScoreSize(), 3, "scoresSized it is not correct" );
	}

	@Test
	void testSum() {
		assertEquals(g1.sum(), 249, "sum does not get the correct total" );
	}

	@Test
	void testMinimum() {
		assertEquals(g1.minimum(), 67, "minimum it is incorrect" );
	}

	@Test
	void testFinalScore() {
		assertEquals(g1.finalScore() , 182, "finalScore it is incorrect" );
	}

	@Test
	void testGetScoreSize() {
	}

	@Test
	void testToString() {
	}

}
