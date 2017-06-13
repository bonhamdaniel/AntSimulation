# AntSimulation
Simple Java game simulating an ant colony using finite state machines.

- Description: 		Simulation Game
  - A game simulating the behaviour of ants, using a finite state machine implementation.  The ants’ purpose is to collect food and bring it back to their home, the ant hill, which causes an additional ant to be added to the colony.  After an ant has successfully brought a piece of food back to the ant hill, they become thirsty, and head back out to their environment to look for water.  When they find water and quench their thirst, they go back to look for another piece of food, re-starting the cycle.  As the ants try to fulfill this cycle, they move randomly in the environment when collecting food and water, but follow the A* algorithm to travel the shortest path home when carrying food.  Additionally, they must avoid poison which is found at random positions in the environment, but can walk safely on terrain, water, and food. 
- Usage Instructions:	The user is in charge of placing the ant hill and choosing the starting # of ants.
  - The ant hill is placed by clicking on any empty tile on the game board.  After the ant hill has been placed, one additional ant will be added to the starting size of the ant colony for every click on the ant hill.  Once you have placed the ant hill and all desired ants, pressing execute will randomize the setup for the rest of the board and start the simulation.
  - There are two buttons:
  - “Blank”		Stops the simulation, allows the user to setup a new scenario.
  - “Execute”	Begins the simulation.
- Compilation:	javac Ant.java AStar.java Board.java Connection.java FiniteStateMachine.java Game.java Graph.java Heuristic.java Node.java NodeRecord.java State.java Transition.java
- Execution:		java Game (command line) or FSM.jar executable included in submission
- Bugs/Problems:		n/a
