package com.tempus.mathGame;

import org.junit.Test;

public class CountingGameTest {

	@Test
	public void testPhase1(){
		try {
			new CountingGame().phase1(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPhase2(){
		try {
			new CountingGame().phase2(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
