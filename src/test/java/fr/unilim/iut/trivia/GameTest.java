package fr.unilim.iut.trivia;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void test_goldenMaster() throws IOException{
		GoldenMaster goldenMaster = new GoldenMaster();
		goldenMaster.generateGoldenMaster();
		
		assertTrue(true);
	}

}
