/*
 * Node class - used in Board class, represents tile positions in the Game
 */

import java.awt.Image;// imports library necessary to provide an image for the Game tile
import java.awt.Point;// imports the library necessary to use a Point to represent the Game tile position
import java.util.ArrayList;// imports library necessary to use ArrayList for the Connections associated with each Node

public class Node {
	private Point tile;// represents the position of the Game tile in the Game space
	private Image image;// represents the image of the entity occupying the Game tile
	private boolean occupied;// represents the cost associated with moving across the Game tile
	private ArrayList<Connection> connections;// represents the Connections to other Game tiles
	private String occupant;// represents the object that is currently at the node
	
	// Node constructor - no parameters, creates an empty Node
	public Node() {
		this.occupied = false;// assigns a cost of -1, used as a marker value
	}// Node() constructor
	
	// Node constructor - position of the tile, image of entity, cost to cross, Connections to other tiles
	public Node (Point tile, Image image, boolean occupied, String occupant) {
		this.tile = tile;// sets the position to that provided
		this.image = image;// sets the image to that of the entity occupying the tile
		this.occupied = occupied;// sets the cost to cross the tile
		this.connections = null;// sets to null, gets connections later
		this.occupant = occupant;
	}// Node (Point, Image, int, ArrayList<Connection>
	
	//getTile method - allows the position of the tile to be accessed
	public Point getTile() {
		return this.tile;// returns the position of the tile
	}// getTile() method
	
	//getImage method - allows the image of the tile to be accessed
	public Image getImage() {
		return this.image;// returns the image of the tile
	}// getImage() method
	
	//setImage method - allows the image of the tile to be set to a specified image
	public void setImage(Image image) {
		this.image = image;// sets the image of the tile to that specified
	}// setImage(Image) method
	
	//getCost method - allows the cost of the tile to be accessed
	public boolean isOccupied() {
		return this.occupied;// returns the cost of the tile
	}// getCost() method
	
	//getConnections method - allows the connections of the tile to be accessed
	public ArrayList<Connection> getConnections() {
		return this.connections;// returns the connections of the tile
	}// getConnections() method
	
	// setOccupant method - allows the occupant variable to be modified
	public void setOccupant(String occupant) {
		this.occupant = occupant;// sets the occupant to that specified
	}// setOccupant(String) method
	
	// getOccupant method - allows the occupant variable to be accessed
	public String getOccupant() {
		return occupant;// returns the occupant variable
	}// getOccupant() method
}// Node class