/*
 * Game class - main method runs the Ant Simulation game
 */
import java.awt.EventQueue;// imports library needed to use EventQueue
import javax.swing.JFrame;// imports library needed to useJFrame

public class Game extends JFrame {
	private static final long serialVersionUID = -7803629994015778818L;// serialization ID

	// Game() constructor - no parameters necessary, creates instance of Ant Simulation game
	public Game() {
		setContentPane(new Board());// sets the content pane to that of an instance of the Board class
		pack();// packs the contents into the JFrame
		setResizable(false);// does not allow the game to be resized
		
		setTitle("Ant Simulation");// sets title on window to "Ant Simulation"
		setLocationRelativeTo(null);// places window is center of the screen
		JFrame.setDefaultLookAndFeelDecorated(true);// uses Windows decorations
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exits the application when the window is closed
	}// Game() constructor
	
	// main method - used to run the Ant Simulation game 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Game game = new Game();// creates new Game instance
				game.setVisible(true);// sets the game instance to be visible
			}// run() method
		});// EventQueue.invokeLater(Runnable())
	}// main(String[]) method
}// Game class
