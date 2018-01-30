package lesson.live.graphics;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 * Exercises 
 * Make 2 or more boxes move across the screen forwards and backwards,
 * like if it was obstacles you need to cross. 
 * 
 * Paint a few other types of geometric objects. 
 * 
 * Variate the colors and objects across time.
 * 
 * If an object touches another object change the color of the objects to red
 * 
 * Make the frame size:
 * width = 32 px * number of maze cell in maze row
 * height = 32 px * number of maze rows. 
 * 
 * 
 * 
 * @author jonas.andree
 *
 */
public class Maingame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		System.out.println("Create GUI and EDT?" + SwingUtilities.isEventDispatchThread());
		
		JFrame f = new JFrame("RimJob");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Player1 player1 = new Player1(200, 200, new Color(145, 207, 234 ));
		Player2 player2 = new Player2(400, 400, new Color(226, 97, 181));
		GamePanel gamePanel = new GamePanel(player1, player2);
		
		
		
		f.add(gamePanel);
		f.pack();
		f.addKeyListener(gamePanel);
		f.addKeyListener(player1);
		f.addKeyListener(player2);
		
		
		//f.setUndecorated(true);
		f.setResizable(false);
		f.setAlwaysOnTop(true);
		f.setVisible(true);
	}
}