package lesson.live.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {

	private int playerX;
	private int playerY;
	
	private boolean moveLeft = false;
	private boolean moveRight = false;
	private boolean moveUp = false;
	private boolean moveDown = false;
	
	private int speedY = 0;
	private int speedX = 0;

	private Color cubeColor;

	// Bredd och höjd för kuberna
	private int rectWidth = 32;
	private int rectHeight = 32;
	

	// Detta gör det möjligt att röra den RÖDA kvadraten åt sidorna (X) och upp
	// & ner (Y)
	private void movePlayerX() {
		if (isMoveRight() == true)
			speedX = 6;
		else if (isMoveLeft() == true)
			speedX = -6;
		else 
			speedX = 0;
	}

	private void movePlayerY() {
		if (isMoveUp() == true)
			speedY = -6;
		else if (isMoveDown() == true)
			speedY = 6;
		else 
			speedY = 0;
	}

	public Player(int x, int y, Color color) {
		init(x, y);
		this.cubeColor = color;
	}

	public void init(int x, int y) {
		playerX = x;
		playerY = y;
	}

	public void update() {
		movePlayerX();
		movePlayerY();
		playerX += speedX;
		playerY += speedY;
	}

	public void draw(Graphics g) {
		g.setColor(cubeColor);
		g.fillRect(playerX, playerY, rectWidth, rectHeight);
		
	}

	public boolean isMoveRight() {
		return moveRight;
	}

	public void setMoveRight(boolean moveRight) {
		this.moveRight = moveRight;
	}

	public boolean isMoveLeft() {
		return moveLeft;
	}

	public void setMoveLeft(boolean moveLeft) {
		this.moveLeft = moveLeft;
	}

	public boolean isMoveUp() {
		return moveUp;
	}

	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

	public boolean isMoveDown() {
		return moveDown;
	}

	public void setMoveDown(boolean moveDown) {
		this.moveDown = moveDown;
	}

	

}