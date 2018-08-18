package main.java.recursion.BinaryTreeHeight;

public class BinaryTreeHeight {
	
	
		public static class Node{
			int value;
			Node leftChild;
			Node rightChild;
			
			public Node(int value){
				this.value = value;
				this.leftChild = null;
				this.rightChild = null;
			}
		}
		
		public static void main(String args[]) {
			
			Node rootNode = getRandomTree();
			int height = recursiveBinaryTreeHeight(rootNode);
			System.out.println(height);
		}
		
		private static Node getRandomTree() {
			return null;
		}

		public static int recursiveBinaryTreeHeight(Node rootNode) {
			
			if(rootNode == null) {
				return 1;
			}
			
			return Math.max(recursiveBinaryTreeHeight(rootNode.leftChild),recursiveBinaryTreeHeight(rootNode.rightChild));
		}

		
		
		
}
