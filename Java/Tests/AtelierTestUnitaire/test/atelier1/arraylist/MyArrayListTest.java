package atelier1.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {
	static MyArrayList list;
	
	@BeforeEach
	void setupBeforeEach() {
		list = new MyArrayList();
	}
	
	
	@Test
	void add_5Numbers_makeSize5() {
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		
		assertEquals(5, list.size());
	}
	
	@Test
	void clear_afterAdding5Numbers_makesize0() {
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		
		assertEquals(5, list.size());
		
		list.clear();
		assertEquals(0, list.size());
	}
	
	@Test
	void get_5NumbersInSameOrder_returnSameNumbers() {
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < 5; i++) {
			assertEquals(i, list.get(i));
		}
	}
	
	@Test
	void contains_5AfterAdding5_returnsTrue() {
		list.add(5);
		assertTrue(list.contains(5));
	}
	
	@Test
	void contains_7AfterAdding5_returnsFalse() {
		list.add(5);
		assertFalse(list.contains(7));
	}

}
