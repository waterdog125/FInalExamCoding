package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

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
		//FinalExam - Add some meaningful junit tests.
		assertequals(5.0, getRate(601),.1);
		assertequals(4.5, getRate(651),.1);
		assertequals(4.0, getRate(701),.1);
		assertequals(3.75, getRate(751),.1);
		assertequals(3.5, getRate(801),.1);
	}

}
