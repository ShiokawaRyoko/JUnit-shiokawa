package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		ItemStock stock = new ItemStock();
		Item item = new Item("book", 500);
		assertEquals(0,stock.getNum(item),"エラー！");
	}
	@Test
	void test2() {
		ItemStock stock = new ItemStock();
		Item item = new Item("book", 500);
		stock.add(item);
		assertEquals(1,stock.getNum(item),"エラー！");
	}
	@Test
	void test3() {
		ItemStock stock = new ItemStock();
		Item item = new Item("book", 500);
		stock.add(item);
		assertEquals(1,stock.getNum(item),"エラー！");
	}
	@Test
	void test4() {
		ItemStock stock = new ItemStock();
		Item item = new Item("book", 500);
		stock.add(item);
		stock.add(item);
		assertEquals(2,stock.getNum(item),"エラー！");
	}
	@Test
	void test5() {
		ItemStock stock = new ItemStock();
		Item item = new Item("book", 500);
		stock.add(item);
		Item item2 = new Item("CD",1000);
		stock.add(item2);
		assertEquals(1,stock.getNum(item2),"エラー！");
	}
}
