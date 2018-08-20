package main.java.SalesPath;

public class SalesPath {
	
	public int getMinimumSalesPath(Node rootNode) {
		int n = rootNode.children.length;
		if(n == 0) {
			return rootNode.cost;
		}
		
		int minCost = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			minCost = Math.min(minCost, getMinimumSalesPath(rootNode.children[i]));
		}
		
		return minCost + rootNode.cost;
	}
}
