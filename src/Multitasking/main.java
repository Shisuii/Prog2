package Multitasking;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	private static ArrayList players = new ArrayList();

	public static void main(String[] args) {
		
		Scanner nameScanner = new Scanner("System.in");
		System.out.println("Enter a name for your character: ");
		Player player1 = new Player(nameScanner.nextLine());
		
		players.add(player1);
		
		Player player2 = new Player("Illidaddy");
		Player player3 = new Player("FatFurion");
		Player player4 = new Player("Tyranderp");
		Player player5 = new Player("Dadgar");
		
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);
		
		System.out.println(players.size());
		
		System.out.println(player1.getName());
		
		System.out.println(player2.getFistDamage());
		player2.setFistDamage(100);
		System.out.println(player4.getFistDamage());
		
		System.out.println();
		
		

	}

}