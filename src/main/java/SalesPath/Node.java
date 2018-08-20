package main.java.SalesPath;

public class Node {
	public int cost;
	public Node[] children;
	
	public Node(int cost){
		this.cost = cost;
		this.children = new Node[] {};
	}
}
