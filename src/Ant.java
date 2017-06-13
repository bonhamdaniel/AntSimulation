/*
 * Ant class - represent ants in an ant simulation using a Finite State Machine
 */
import java.awt.Image;// imports library necessary for using images
import java.util.ArrayList;// imports library necessary for the use of the ArrayList object
import javax.swing.ImageIcon;// imports library necessary for using images

public class Ant {
	private int home;// represents an ant's home ant hill location
	private int current;// represents an ant's current location
	private ArrayList<String> actions;// represents the actions that an ant has in the queue
	private Image image;// represents the image of the ant
	
	// Ant constructor - home and current locations
	public Ant(int home, int current) {
		this.home = home;// sets the home location to that specified
		this.current = current;// sets the current location to that specified
		this.actions = new ArrayList<String>();// initializes the actions list, will be used for movement
		this.image = new ImageIcon("ant.png").getImage();// sets the ant's image
	}// Ant(int, int) constructor
	
	// getHome method - allows the home variable to be accessed
	public int getHome() {
		return this.home;// returns the home variable
	}// getHome() method
	
	// setCurrent method - allows the current variable to be modified
	public void setCurrent(int current) {
		this.current = current;// sets the current to that specified
	}// setCurrent(int) method
	
	// setImage method - allows the image to be changed
	public void setImage(Image image) {
		this.image = image;// sets the image to that specified
	}// setImage(Image) method
	
	// getImage method - allows the image value to be accessed
	public Image getImage() {
		return this.image;// returns the image value
	}// getImage() method
	
	// getCurrent method - allows the current value to be accessed
	public int getCurrent() {
		return this.current;// returns the current value
	}// getCurrent() method
	
	// setActions method - allows the actions variable to be modified
	public void setActions(ArrayList<String> actions) {
		this.actions = actions;// sets the actions to those specified
	}// setActions(ArrayList<String>) method
	
	// getActions() method - allows the actions to be accessed
	public ArrayList<String> getActions() {
		return this.actions;// returns the actions
	}// getActions() method
}// Ant class
