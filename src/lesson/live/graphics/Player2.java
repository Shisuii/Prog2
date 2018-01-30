package lesson.live.graphics;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player2 extends Player implements KeyListener {

	public Player2(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			setMoveRight(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			setMoveLeft(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			setMoveUp(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			setMoveDown(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			setMoveRight(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			setMoveLeft(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			setMoveUp(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			setMoveDown(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}