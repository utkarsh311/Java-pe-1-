package com.stackroute.test;


import com.stackroute.demo.UnspecifiedNum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUnspecified {

	@Test
	public void test() {
		//fail("Not yet implemented");
		UnspecifiedNum junit=new UnspecifiedNum();
		int res=junit.func("14 15 46");
		assertEquals(16,res);
	}

}
