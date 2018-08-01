package com.stackroute.test;
import com.stackroute.demo.LowerUpperCase;
import static org.junit.Assert.*;

import org.junit.Test;

public class LUcase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		LowerUpperCase junit=new LowerUpperCase();
		String res=junit.check("N");
		assertEquals("UpperCase",res);
	}

}
