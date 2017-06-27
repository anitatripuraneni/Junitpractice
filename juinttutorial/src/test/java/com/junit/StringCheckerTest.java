package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.juint.StringChecker;

public class StringCheckerTest {

	StringChecker checker;

	@Test
	public void test() {
		checker = new StringChecker();
		assertEquals("hello world", checker.checkValue());
	}

}
