package smbengaLab6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	GradeBook scores1;
	GradeBook scores2;

	@Before
	public void setUp() throws Exception {
		scores1 = new GradeBook(5);
		scores2 = new GradeBook(5);
		scores1.addScore(95.0);
		scores1.addScore(75.3);
		
		scores2.addScore(86.5);
		scores2.addScore(93.2);
	}

	@After
	public void tearDown() throws Exception {
		scores1 = null;
		scores2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(scores1.toString().equals("95.0 75.3 0.0 0.0 0.0 "));
		assertTrue(scores2.toString().equals ("86.5 93.2 0.0 0.0 0.0 "));
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(2, scores1.getScoreSize());
		assertEquals(2, scores2.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(170.3, scores1.sum(), .0001);
		assertEquals(179.7, scores2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(75.3, scores1.minimum(), .001);
		assertEquals(86.5, scores2.minimum(), .001);
		
	}

	@Test
	public void testFinalScore() {
		assertEquals(95.0, scores1.finalScore(), .0001);
		assertEquals(93.2, scores2.finalScore(), .0001);
	}

	@Test
	public void testToString() {
		
	}

}
