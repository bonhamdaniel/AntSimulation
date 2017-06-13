/*
 * AStar class - implements the A* Pathfinding Algorithm on a provided Graph and with a provided Heuristic.
 */

import java.util.ArrayList;// imports library necessary for using the ArrayList to hold NodeRecord lists

public class AStar {
	private static ArrayList<NodeRecord> openList;// represents the list of Nodes that have not been searched
	private static ArrayList<NodeRecord> closedList;// represents the list of Nodes that has been searched
	
	// pathFindAStar method - graph, start, end, and heuristic; finds the minimum path
	public static ArrayList<Connection> pathFindAStar(Graph graph, int start, int end, Heuristic heuristic) {
		NodeRecord startRecord = new NodeRecord(start, null, 0, heuristic.estimate(start));// creates NodeRecord for start Node
		
		openList = new ArrayList<NodeRecord>();// creates the list for nodes not yet searched
		openList.add(startRecord);// adds the start node record to the open list
		closedList = new ArrayList<NodeRecord>();// creates the list for nodes already searched
		
		NodeRecord current = new NodeRecord();// creates a node record for the next node
		ArrayList<Connection> connections;// will be used to hold the connection associated with the current node
		int endNode;// will be used to hold the end node of the connection
		int endNodeCost;// will be used to hold the cost of the end node of the connection
		NodeRecord endNodeRecord;// will be used to hold the node record of the end node of the connection
		int endNodeHeuristic;// will be used to hold the estimated cost from the end node to the goal node
		while (openList.size() > 0) {// cycles through the open list of nodes
			current = getSmallestElement();// gets the node with the smallest estimated total cost
			
			if (current.getNode() == end) {// breaks if the current node is the goal node
				break;
			} else {// if the current node is not the goal node, gets the connections for the node
				connections = graph.getConnections(current.getNode());
			}// if (endNode)
			
			for (Connection connection : connections) {// loops through the connections for the current node
				endNode = connection.getToNode();// gets the endNode for the current connection
				endNodeCost = current.getCostSoFar() + connection.getCost();// gets the cost for the endNode of the current connection
				
				if (listContains(closedList, endNode)) {//  checks to see if the endNode is in the closedList
					endNodeRecord = findNode(closedList, endNode);// gets the NodeRecord from the closedList
					
					if (endNodeRecord.getCostSoFar() <= endNodeCost)// checks to see if the cost so far in the record is smaller than currently calculated
						continue;// continues if there is no point in continuing to check current node, already has a smaller cost path
					
					closedList.remove(endNodeRecord);// removes the endNode record from the closedList
					
					endNodeHeuristic = endNodeRecord.getEstimatedTotalCost() - endNodeRecord.getCostSoFar();// gets the estimated cost for the current end node
				} else if (listContains(openList, endNode)) {// checks if the end node is in the openList
					endNodeRecord = findNode(openList, endNode);// retrieves the record for the end node from the openList
					
					if (endNodeRecord.getCostSoFar() <= endNodeCost)// checks if the cost in the record is smaller than that being calculated
						continue;// continues if the record has a smaller cost than currently being calculated
					
					endNodeHeuristic = endNodeRecord.getEstimatedTotalCost() - endNodeRecord.getCostSoFar();// gets the cost for the endNode of the current connection
				} else {// if the node record is not in either the open or closed list
					endNodeHeuristic = heuristic.estimate(endNode);// gets the cost estimate for the node
				}// if (listContains)
				
				endNodeRecord = new NodeRecord(endNode, connection, endNodeCost, endNodeCost + endNodeHeuristic);// creates record for current node
				
				if (!listContains(openList, endNode))// checks if the openList does not contain the node record
					openList.add(endNodeRecord);// adds the node record to the openList
			}// for (connection)
			
			openList.remove(current);// removes the current node record from the openList
			closedList.add(current);// adds the current node record to the closedList
		}// while (openList)
		
		if (current.getNode() != end) {// checks if the current node is not the goal node
			return null;// return null, no path has been found
		} else {// if a path has been found
			ArrayList<Connection> path = new ArrayList<Connection>();// will be used to hold the path
			
			while (current.getNode() != start) {// while there are more nodes in the path
				path.add(current.getConnection());// adds the current connection to the path
				int currentNode = current.getConnection().getFromNode();// gets the from node from the current connection
				for (NodeRecord nodeRecord : closedList) {// cycles through the closedList
					if (nodeRecord.getNode() == currentNode)// checks the node records for the current node
						current = nodeRecord;// sets the node record if found for the current node
				}// for (closedList)
			}// while (!start)
			
			return reverse(path);// class method to get path in correct order
		}// if (end)
	}// pathFindAStar(Graph, int, int, Heuristic) method
	
	// getSmallestElement method - no parameters, gets the node with the smallest estimated cost
	private static NodeRecord getSmallestElement() {
		NodeRecord smallestElement = openList.get(0);// gets first node record from the openList
		for (NodeRecord nodeRecord : openList) {// cycles through the node records in the openList
			if (nodeRecord.getEstimatedTotalCost() < smallestElement.getEstimatedTotalCost())// checks if current record has lower estimate
				smallestElement = nodeRecord;// gets record for smallest estimate node
		}// for (openList)
		return smallestElement;// returns the nodeRecord for the node with the smallest estimate
	}// getSmallestElement() method
	
	// listContains method - list and node, checks if the given list contains the given node
	private static boolean listContains(ArrayList<NodeRecord> list, int node) {
		for (NodeRecord listNode : list) {// loops through the list
			if (listNode.getNode() == node)// checks for the given node
				return true;// returns true if the node is found
		}// for (list)
		return false;// returns false if the node is not found
	}// listContains(ArrayList<NodeRecord>, int) method
	
	// findNode method - list and node, finds a node record for a given node from a given list
	private static NodeRecord findNode(ArrayList<NodeRecord> list, int node) {
		for (NodeRecord listNode : list) {// loop through the list
			if (listNode.getNode() == node)// checks the current list element against the node
				return listNode;// returns the node record when found
		}// for (list)
		return null;// returns null if the node is not found
	}// findNode(ArrayList<NodeRecord>, int) method
	
	// reverse method - search path, reverses the path provided 
	private static ArrayList<Connection> reverse(ArrayList<Connection> path) {
		ArrayList<Connection> reverse = new ArrayList<Connection>();// will hold the reversed path
		for (int i = path.size() - 1; i >= 0; i--)// loops through the connection in the path
			reverse.add(path.get(i));// adds each connection to the reverse path
		return reverse;// returns the reverse version of the path
	}// reverse(ArrayList<Connection>)
}// AStar class
