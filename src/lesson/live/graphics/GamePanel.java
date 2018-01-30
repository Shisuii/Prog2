package lesson.live.graphics;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements KeyListener {
	
	private static Player player1;
	private static Player player2;
	
	private int width = 1000;
	private int height = 600;
	
	
	public GamePanel(Player1 player1, Player2 player2) {
		GamePanel.player1 = player1;
		GamePanel.player2 = player2;
		init();
		Thread thread = new Thread(new Runnable() {
		
			public void run() {
				while (true) {
					GamePanel.update();
					GamePanel.this.repaint();
					try {
						Thread.sleep(1000 / 60);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}
		});
		thread.start();
	}
	public static void init() {
		player1.init(200, 200);
		player2.init(400, 400);
	}
	public static void update() {
		player1.update();
		player2.update();
	}

	/** Skapar fönstret där spelet spelas **/
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		player1.draw(g);
		player2.draw(g);
			
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.out.println("Exit program!");
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {	
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}