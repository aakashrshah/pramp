package test.java.recursion.BinaryTreeHeight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.recursion.BinaryTreeHeight.BinaryTreeHeight;
import main.java.recursion.BinaryTreeHeight.Node;

class BinaryTreeHeightTest {
	
	   BinaryTreeHeight b = new BinaryTreeHeight();
	   
	   @Test
	   public void testNullHeight() {
		   
		   //A null tree has a height of 0.
		   int height = -1;
		   assertEquals(height, b.binaryTreeHeight(null));
	   }

	   @Test
	   public void testRootHeight() {
		   
		   Node rootNode = new Node(4);
		   int height = 0;
		   assertEquals(height, b.binaryTreeHeight(rootNode));
	   }
	   
	   @Test
	   public void testOneNodeHeight() {
		   Node rootNode = new Node(4);
		   rootNode.left = new Node(2);
		   int height = 1;
		   assertEquals(height, b.binaryTreeHeight(rootNode));
	   }
	   
	   @Test
	   public void testTwoNodeHeight() {
		   Node rootNode = new Node(4);
		   rootNode.left = new Node(2);
		   rootNode.right = new Node(2);

		   int height = 1;
		   assertEquals(height, b.binaryTreeHeight(rootNode));
	   }

	   @Test
	   public void testTwoHeight() {
		   Node rootNode = new Node(4);
		   rootNode.left = new Node(2);
		   rootNode.right = new Node(2);
		   rootNode.left.left = new Node(6);
		   int height = 2;
		   assertEquals(height, b.binaryTreeHeight(rootNode));
	   }

}
