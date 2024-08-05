package com.jonathantippy.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jonathantippy.data.Evaluator;

class EvaluatorTests {

	@Test
	@DisplayName("1+1 = 2")
	void add1() {
		assertEquals(2, Evaluator.evaluate("1+1"), "\"1+1\" should equal 2");
	}

	@Test
	@DisplayName("1 + 1 = 2")
	void add2() {
		assertEquals(2, Evaluator.evaluate("1 + 1"), "\"1 + 1\" should equal 2");
	}

	@Test
	@DisplayName("1 + 1 + 1 = 3")
	void add3() {
		assertEquals(3, Evaluator.evaluate("1 + 1 + 1"), "\"1 + 1 + 1\" should equal 3");
	}

	@Test
	@DisplayName("1 * 1 = 1")
	void mult1() {
		assertEquals(1, Evaluator.evaluate("1 * 1"), "\"1 * 1\" should equal 1");
	}

	@Test
	@DisplayName("2 + 7 * 2 + 1")
	void order1() {
		assertEquals(17, Evaluator.evaluate("2 + 7 * 2 + 1"), "\"2 + 7 * 2 + 1\" should equal 17");
	}
	
	@Test
	@DisplayName("2 + 7 * 2 + 1 * 8")
	void order2() {
		assertEquals(24, Evaluator.evaluate("2 + 7 * 2 + 1 * 8"), "\"2 + 7 * 2 + 1 * 8\" should equal 24");
	}

	@Test
	@DisplayName("5 - 2")
	void sub1() {
		assertEquals(3, Evaluator.evaluate("5 - 2"), "\"5 - 2\" should equal 3");
	}

	@Test
	@DisplayName("5 - 3 + 2 - 2 - 7 + 8 - 9 + 7 + 2 - 1")
	void order3() {
		assertEquals(2, Evaluator.evaluate("5 - 3 + 2 - 2 - 7 + 8 - 9 + 7 + 2 - 1"), "\"5 - 3 + 2 - 2 - 7 + 8 - 9 + 7 + 2 - 1\" should equal 2");
	}

	@Test
	@DisplayName("6 / 2")
	void div1() {
		assertEquals(3, Evaluator.evaluate("6 / 2"), "\"6 / 2\" should equal 3");
	}

	@Test
	@DisplayName("45 + 74 - 13 + 11 * 18 - 77 + 33 / 11 * 2 - 8 + 3 / 3 * 2 * 9 - 3")
	void order4() {
		assertEquals(240, Evaluator.evaluate("45 + 74 - 13 + 11 * 18 - 77 + 33 / 11 * 2 - 8 + 3 / 3 * 2 * 9 - 3"), "\"45 + 74 - 13 + 11 * 18 - 77 + 33 / 11 * 2 - 8 + 3 / 3 * 2 * 9 - 3\" should equal 240");
	}

	


	/*
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(String first, String second, int expectedResult) {
		assertEquals(expectedResult, Evaluator.evaluate(first + "+" + second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	*/
}
