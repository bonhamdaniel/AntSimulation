/*
 * Transition class - used as a part of the Finite State Machine, represents transitions between states
 */

public class Transition {
	private State targetState;// represents the state that this object transitions to
	private String action;// represents the action that is associated with the transition taking place
	private boolean condition;// represents the condition that indicates the transition is activated
	
	// Transition constructor - the action associated and the trigger condition 
	public Transition(String action, boolean condition) {
		this.targetState = null;// initially null, this is added later
		this.action = action;// sets the action to that specified
		this.condition = condition;// sets the condition to that specified
	}// Transition(String, boolean) constructor
	
	// setTriggered method - sets the trigger condition to that specified
	public void setTriggered(boolean condition) {
		this.condition = condition;// sets the trigger condition
	}// setTriggered(boolean) method
	
	// isTriggered method - returns a result indicating whether the condition has been triggered
	public boolean isTriggered() {
		return condition;// returns result
	}// isTriggered() method
	
	// setTargetState method - sets the target state to that specified
	public void setTargetState(State targetState) {
		this.targetState = targetState;// sets the targetState to that specified
	}// setTargetState(State) method
	
	// getTargetState method - allows the targetState variable to be accessed
	public State getTargetState() {
		return this.targetState;// returns the targetState
	}// getTargetState() method
	
	// getAction method - allows the action variable to be accessed
	public String getAction() {
		return this.action;// returns the action
	}// getAction() method
	
	// toString method - overwrites the method to format the object for printing
	public String toString() {
		return this.getClass() + " " + targetState + " " + action + " " + condition;// returns the formatted result
	}// toString() method
}// Transition class
