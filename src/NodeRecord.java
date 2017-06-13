/*
 * NodeRecord class - used in the A* Pathfinding Algorithm, represents node information.
 */
public class NodeRecord {
	private int node;// the node number
	private Connection connection;// connection that connects the node to the path
	private int costSoFar;// cost up to this node in the path
	private int estimatedTotalCost;// cost estimated from this node to the end of the path
	
	// NodeRecord constrcutor - no parameters necessary, creates blank record
	public NodeRecord() {
		this.node = 0;// sets node number to zero
		this.connection = null;// sets connection to null
		this.costSoFar = 0;// no cost so far, blank record
		this.estimatedTotalCost = 0;// no estimated cost, blank record
	}// NodeRecord() constructor
	
	// NodeRecord constructor - node #, connection to path, cost up to this node, cost from this node to end
	public NodeRecord(int node, Connection connection, int costSoFar, int estimatedTotalCost) {
		this.node = node;// sets node number to that provided
		this.connection = connection;// sets connection to path as that provided
		this.costSoFar = costSoFar;// sets costSoFar to that provided
		this.estimatedTotalCost = estimatedTotalCost;// sets estimatedTotalCost to that provided
	}// NodeRecord(int, Connection, int, int) constructor
	
	// getNode method - no parameters, returns node # of NodeRecord
	public int getNode() {
		return this.node;// returns node number associated with the NodeRecord
	}// getNode() method
	
	// getConnection method - no parameters, returns Connection to path of NodeRecord
	public Connection getConnection() {
		return this.connection;// returns path Connection associated with the NodeRecord
	}// getConnection() method
	
	// getCostSoFar method - no parameters, returns cost up to this node in the path of NodeRecord
	public int getCostSoFar() {
		return this.costSoFar;// returns cost up to this node in the path
	}// getCostSoFar() method
	
	// getEstimatedTotalCost method - no parameters, returns estimated cost from this node to end of the path
	public int getEstimatedTotalCost() {
		return this.estimatedTotalCost;// returns estimated cost from this node to end of the path
	}// getEstimatedTotalCost() method
	
	// toString method - no parameters, overwrites method in Object class, formats NodeRecord for printing
	public String toString() {
		return "Node: " + node + "Connection: " + connection + " Cost so far: " + costSoFar + " Total estimated cost: " + estimatedTotalCost;// returns formatted version
	}// toString() method
}// NodeRecord class
