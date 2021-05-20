package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		Counter counter = new Counter();
		assertEquals(1,counter.increment(),"エラー！");
	}
	@Test
	void test2() {
		Counter counter = new Counter();
		assertEquals(2,counter.increment(),"エラー！");
	}
	@Test
	void test3() {
		Counter counter = new Counter();
		for (int i=1; i<51; i++) {
		counter.increment();
		}
		assertEquals(51,counter.increment(),"エラー！");
	}
}
