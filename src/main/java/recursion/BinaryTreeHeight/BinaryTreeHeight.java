package main.java.recursion.BinaryTreeHeight;

public class BinaryTreeHeight {
	
		public int binaryTreeHeight(Node rootNode) {
			return recursiveBinaryTreeHeight(rootNode);
		}

		public int recursiveBinaryTreeHeight(Node rootNode) {
			
			if(rootNode == null) {
				return -1;
			}
			return Math.max(recursiveBinaryTreeHeight(rootNode.left),recursiveBinaryTreeHeight(rootNode.right)) + 1;
		}
}
