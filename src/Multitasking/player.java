package Multitasking;


public class player {
	private int hp = 100;
	private int numberOfBullets = 0;
	private int damage = 0;
	private String name;
	private int stamina = 100;
	
	private static int fistdamage = 5;
	
	
	/**
	 * 
	 */
	public Player(String name) {
		this.name = name;
	}
	/**
	 * Returns the name of the player
	 * @returns String name
	 */
	
	public String getName() {
		return this.name;
		
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	public int getFistDamage() {
		return fistdamage;
		
	}
	public void setFistDamage(int fistDamage) {
		Player.fistdamage = fistdamage;
		
	}
}