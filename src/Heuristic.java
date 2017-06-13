/*
 * Heuristic class - used in the A* Pathfinding Algorithm, implements a heuristic for the search.
 */

public class Heuristic {
	
	// Heuristic constructor - creates instance
	public Heuristic() {
	}// Heuristic() constructor
	
	// estimate method - node to get estimate for, estimates cost from node to goalNode
	public int estimate(int node) {
		// return length(new int[]{node % 40, node / 40}, new int[]{this.goalNode % 16, this.goalNode / 16});// Euclidean heuristic
		return 0;// uses 0 so that A* finds the exact minimum path
	}// estimate(int) method
	
	// Determines and returns the length of a line consisting of two given points.
	public static int length(int[] point1, int[] point2) {
		return (int)Math.round(Math.sqrt((point1[0]-point2[0])*(point1[0]-point2[0]) + (point1[1]-point2[1])*(point1[1]-point2[1])));// calculates and returns the distance
	}// length(float[] point) method
}// Heuristic class
