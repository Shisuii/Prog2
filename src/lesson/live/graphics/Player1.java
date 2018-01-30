package lesson.live.graphics;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player1 extends Player implements KeyListener {

	public Player1(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			setMoveRight(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			setMoveLeft(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			setMoveUp(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			setMoveDown(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			setMoveRight(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			setMoveLeft(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			setMoveUp(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			setMoveDown(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}