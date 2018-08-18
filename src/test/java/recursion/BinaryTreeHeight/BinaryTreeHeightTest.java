package test.java.recursion.BinaryTreeHeight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.recursion.BinaryTreeHeight.BinaryTreeHeight;
import main.java.recursion.BinaryTreeHeight.BinaryTreeHeight.Node;

class BinaryTreeHeightTest {
	
	   @Test
	   public void testNullHeight() {
		   
		   //A null tree has a height of 0.
		   
		   int height = 0;
		   assertEquals(height, BinaryTreeHeight.recursiveBinaryTreeHeight(null));
	   }
	   
	   @Test
	   public void testRootNodeHeight() {
		   
		   //A tree with one node has a height of 1.
		   
		   Node rootNode = new BinaryTreeHeight.Node(9);
		   int height = 1;
		   assertEquals(height, BinaryTreeHeight.recursiveBinaryTreeHeight(rootNode));
	   }

}
