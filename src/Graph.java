/*
 * Graph class - represents a Graph, used to represent the nodes/tiles of the Game board
 */

import java.util.ArrayList;// imports libraries necessary to use ArrayList for connections

public class Graph {
	private ArrayList<Connection> connections;// represents the connections/edges of the graph
	
	// Graph constructor - no parameters, creates an empty graph
	public Graph() {
		this.connections = new ArrayList<Connection>();// creates an empty set of connections
	}// Graph() constructor
	
	//getConnections method - no parameters, allows the Graph connections to be accessed
	public ArrayList<Connection> getConnections() {
		return this.connections;// returns the connections in the graph
	}// getConnections() method
	
	//getConnections method - fromNode, allows the Graph connections of a specified node to be accessed
	public ArrayList<Connection> getConnections(int fromNode) {
		ArrayList<Connection> connectionsFromNode = new ArrayList<Connection>();// used to hold connections from the node
		for (Connection connection : this.connections) {// loops through the graph connections
			if (connection.getFromNode() == fromNode)// checks to see if they originate at the specified node
				connectionsFromNode.add(connection);// adds connections that originate at the specified node
		}// for (connection)
		return connectionsFromNode;// returns the connections that originate from the specified node
	}// getConnections(int) method
	
	// addConnection method - connection, allows connections to be added to the graph
	public void addConnection(Connection connection) {
		this.connections.add(connection);// adds the connection provided to the graph
	}// addConnection(Connection) method
	
	// addConnections method - allows a set of connections to be added to the graph
	public void addConnections(ArrayList<Connection> connection) {
		this.connections.addAll(connection);// adds the provided connections to the graph
	}// addConnections(ArrayList<Connection> method
}// Graph class
