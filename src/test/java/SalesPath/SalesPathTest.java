package test.java.SalesPath;

import org.junit.Assert;
import org.junit.Test;

import main.java.SalesPath.Node;
import main.java.SalesPath.SalesPath;

public class SalesPathTest {

	SalesPath s = new SalesPath();
	Node rootNode = new Node(6);
	
	@Test
	public void testOneLevelTree() {
		Node root = new Node(1);
		
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node3 = new Node(3);

		root.children = new Node[] {node3,node5,node6};
		int expectedSalesPath = 4;
		Assert.assertEquals(expectedSalesPath, s.getMinimumSalesPath(root));
	}
	
	@Test
	public void testTwoLevelTree() {
		Node root = new Node(1);
		
		Node node5 = new Node(5);
		Node node4 = new Node(4);
		node5.children = new Node[] {node4};
		
		Node node6 = new Node(6);
		Node node3 = new Node(3);

		root.children = new Node[] {node3,node5,node6};
		int expectedSalesPath = 4;
		Assert.assertEquals(expectedSalesPath, s.getMinimumSalesPath(root));
	}
	
	@Test
	public void testTwoLevelAgainTree() {
		Node root = new Node(1);
		
		Node node5 = new Node(5);
		Node node4 = new Node(4);
		node5.children = new Node[] {node4};
		
		Node node6 = new Node(6);
		Node node3 = new Node(3);
		Node node2 = new Node(2);
		node3.children = new Node[] {node2};
		
		root.children = new Node[] {node3,node5,node6};
		int expectedSalesPath = 6;
		Assert.assertEquals(expectedSalesPath, s.getMinimumSalesPath(root));
	}
}
