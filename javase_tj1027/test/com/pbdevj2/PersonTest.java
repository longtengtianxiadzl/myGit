package com.pbdevj2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pbdevj.oop.Person;

public class PersonTest {
	@SuppressWarnings("unused")
	private static Person person=new Person() {
		
		@Override
		public void jumping() {
			// TODO Auto-generated method stub
			
		}
	};
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
