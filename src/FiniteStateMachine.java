/*
 * FiniteStateMachine class - a general representation of a Finite State Machine
 */
import java.util.ArrayList;

public class FiniteStateMachine {
	ArrayList<State> states;// represents the states used with the finite state machine
	State initialState;// represents the initial state of the object using the state machine
	State currentState = initialState;// represents the current state of the object using the state machine
	
	// FiniteStateMachine constructor - sets the states, the initial state, and the current state
	public FiniteStateMachine(ArrayList<State> states, State initialState) {
		this.states = states;// sets the states to those specified
		this.initialState = initialState;// sets the initial state to that specified
		this.currentState = initialState;// initially sets the current state to the initial state
	}// FiniteStateMachine(Arrayist<State>, State) constructor
	
	// update method - updates the state of the object
	public ArrayList<String> update() {
		Transition triggeredTransition = null;// will hold the transition, if one is triggered
		ArrayList<String> actions = new ArrayList<String>();// will hold the actions resulting from the update
		
		for (Transition transition : currentState.getTransitions()) {// loops through all potential transitions
			if (transition.isTriggered()) {// checks if the current transition is triggered
				triggeredTransition = transition;// the triggered transition is set to that triggered
				break;// breaks if a transition has been found
			}// if (triggered)
		}// for (transitions)
		
		if (triggeredTransition != null) {// checks to see if a transition was triggered
			State targetState = triggeredTransition.getTargetState();// gets the target state of the triggered transition
			
			actions.add(currentState.getExitAction());// adds the exit action of the current state to the list to be returned
			actions.add(triggeredTransition.getAction());// adds the action of the current state to the list to be returned
			actions.add(targetState.getEntryAction());// adds the entry action of the current state to the list to be returned
			
			currentState = targetState;// sets the target state of the triggered transition to the current state
			return actions;// returns the actions associated with the update
		}// if (triggered transition)
		
		actions.add(currentState.getAction());// adds the action of the current state to the list returned
		return actions;// returns the actions
	}// update() method
	
	// getCurrentState method - allows the current state of the fsm to be accessed
	public State getCurrentState() {
		return currentState;// returns the currentState of the fsm
	}// getCurrentState() method
}// FiniteStateMachine class
