package main.java.NumOfPaths;

public class NumOfPaths {
	  public int numOfPathsToDest(int n) {
		int i=0;
		int j=0;
		return recursiveNumOfPathsToDes( i,  j,  n);
	  }
	  
	  public int recursiveNumOfPathsToDes(int i, int j, int n) {
		  //Constraints to stop recursion.

		  //Reached Goal Constraint;
		  if(i == n-1 && j == n-1) {
			  return 1;
		  }
		  
		  //Wrong Path Constraint;
		  if(i >= n || i < 0) {
			  return 0;
		  }
		  
		  if(j >= n || j < 0) {
			  return 0;
		  }
		  
		  if(i < j) {
			  return 0;
		  }
		  
		return recursiveNumOfPathsToDes(i+1,j, n) + recursiveNumOfPathsToDes(i,j+1,n);
	  }
}
