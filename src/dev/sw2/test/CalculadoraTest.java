package dev.sw2.test;

import org.junit.Test;

import junit.framework.TestCase;
import dev.sw2.Calculadora;

public class CalculadoraTest extends TestCase{

	private int value1;
	private int value2;
	private Calculadora calc;

	public CalculadoraTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		value1 = 3;
		value2 = 5;
		calc = new Calculadora();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		value1 = 0;
		value2 = 0;
	}

	@Test
	public void testAdd() {
		int total = 8;
		int sum = calc.add(value1, value2);
		assertEquals(sum, total);
	}

	@Test
	public void testFailedAdd() {
		int total = 9;
		int sum = calc.add(value1, value2);
		assertNotSame(sum, total);
	}
	
	@Test
	public void testSub() {
		int total = 0;
		int sub = calc.sub(4, 4);
		assertEquals(sub, total);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDiv(){
		try{
			calc.div(value2, 0);
		}catch(ArithmeticException e){
		}
	}
}
