package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import queue.Node;
import queue.Queue;

public class QueueTest {

	Queue pq;
	ArrayList<Node> list;

	@Before
	public void beforeTest(){
		pq = new Queue();
		list = new ArrayList<>();

	}

	@Test
	public void testOverall() {

		pq.Insert(list,11, 16); 
		pq.Insert(list,12, 14); 
		pq.Insert(list,13, 10); 
		pq.Insert(list,14, 8); 
		pq.Insert(list,15, 7); 
		pq.Insert(list,16, 9);

		//expected value, actual value passed to the function below to check the maximum element in the list
		assertEquals(9, pq.Maximum(list));

		pq.Insert(list,17, 3); 
		pq.Insert(list,18, 2); 
		pq.Insert(list,19, 4); 
		pq.Insert(list,20, 1); 

		//expected value, actual value passed to the function below to check the list size
		assertEquals(10, list.size());

		//expected value, actual value passed to the function below to check the maximum element in the list
		assertEquals(1, pq.Maximum(list));

		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);

		//expected value, actual value passed to the function below to check the maximum element in the list
		assertEquals(16, pq.Maximum(list));

		pq.Extract_Max(list);
		//expected value, actual value passed to the function below
		assertEquals(0, list.size());

		//expected value, actual value passed to the function below to check the maximum element in the list
		assertEquals(0, pq.Maximum(list));
	}

	@Test
	public void Extract_MaxTest(){
		ArrayList<Node> list0 = new ArrayList<>();

		pq.Insert(list0, 11, 16);
		pq.Insert(list0, 12, 14);
		pq.Insert(list0, 13, 10);
		pq.Insert(list0, 14, 8);

		pq.Insert(list, 11, 16);
		pq.Insert(list, 12, 14);
		pq.Insert(list, 13, 10);
		pq.Insert(list, 14, 8);

		assertEquals(4,list.size());

		pq.Extract_Max(list);
		pq.Extract_Max(list0);

		Node keyValue=pq.Extract_Max(list);
		Node result=pq.Extract_Max(list0);

		assertEquals(result.toString(),keyValue.toString());
		assertEquals(2,list.size());
		pq.Extract_Max(list);
		assertEquals(1,list.size());

	}	
	@Test
	public void MaximumTest() {
		pq.Insert(list, 11, 16);
		assertEquals(16, pq.Maximum(list));
		pq.Insert(list, 12, 14);
		assertEquals(14, pq.Maximum(list));
		pq.Insert(list, 13, 10);
		pq.Insert(list, 14, 8);
		assertEquals(8, pq.Maximum(list));
		pq.Extract_Max(list);
		assertEquals(10, pq.Maximum(list));
	}
	@Test
	public void InsertTest(){
		pq.Insert(list, 11, 16);
		pq.Insert(list, 12, 14);
		pq.Insert(list, 13, 10);
		pq.Insert(list, 14, 8);
		assertEquals(4,list.size());
	}

	@Test
	public void sizeOfListTest() {	 
		assertEquals(0, list.size());
		pq.Insert(list, 11, 16);
		pq.Insert(list, 12, 14);
		assertEquals(2, list.size());
		pq.Insert(list, 13, 10);
		pq.Insert(list, 14, 8);
		assertEquals(4, list.size());
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		assertEquals(2, list.size());
	}

	@Test
	public void ListEmptyTest()  {
		assertTrue(list.isEmpty());
		pq.Insert(list, 11, 16);
		pq.Insert(list, 12, 14);
		assertFalse(list.isEmpty());
	}

	@Test
	public void toStringTest() {
		assertEquals(new ArrayList<>().toString(), list.toString());
	}

	@Test(timeout=100)
	public void performanceTest(){
		pq.Insert(list,11, 16); 
		pq.Insert(list,12, 14); 
		pq.Insert(list,13, 10); 
		pq.Insert(list,14, 8); 
		pq.Insert(list,15, 7); 
		pq.Insert(list,16, 9);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
		pq.Extract_Max(list);
	}

	@Test
	public void nullListTest(){
		pq.Extract_Max(list);
	}
}
