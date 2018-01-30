package lesson.switches;

import java.util.ArrayList;

public class MainMaze {

	private final static String MAZE = "########################################\n"
									 + "S          #######       ####         ##\n"
									 + "########## # ##### ##### #### ### ### ##\n"
									 + "###        #       #####      ### ###  #\n"
									 + "### ###### ####### ##############  ### #\n"
									 + "#   ######   #####           #     ### #\n"
									 + "# ########## ############### ######### #\n"
									 + "#      #   # ###########          #### #\n"
									 + "######## #   ####        ######## #### #\n"
									 + "######## ######## ############### #### #\n"
									 + "####     ######## ####       #### #### #\n"
									 + "#### ######       #### ##### #### #### #\n"
									 + "#### ###### ## ####### #####      #### #\n"
									 + "#### ###### ##      ## ############### #\n"
									 + "####        ####### ## ############### #\n"
									 + "######################              ## #\n"
									 + "################    ############### ## #\n"
									 + "##          #### ##        ######## ## #\n"
									 + "## ############# ### ##### ######## ## #\n"
									 + "## ##            ### ##### ####     ## #\n"
									 + "## ## ########## ###    ## ###  ###### #\n"
									 + "## ##         ##   #### ## ##  ####### #\n"
									 + "## ########## #### ##   ## #  ###### # #\n"
									 + "##            #### ## ####   #       # #\n"
									 + "######## ######### ##   ###### #########\n"
									 + "##       ######    ###########         #\n"
									 + "############### ###################### #\n"
									 + "#    ########## #######             ## #\n"
									 + "# ##         ## ####### ########### ## #\n"
									 + "# ########## ##         ##       ## ## #\n"
									 + "#         ## ####### ##### ##### ## ## #\n"
									 + "######### ##         ##### #####    ## #\n"
									 + "##### ### ######### ###### ########### #\n"
									 + "##### ###     #####      #             #\n"
									 + "##### #################### #############\n"
									 + "#####        ###                       G\n"
									 + "######## ### ### ######### #############\n"
									 + "##       ###     #      ## ########### #\n"
									 + "## ####################                #\n"
									 + "########################################\n";

	private static int startX;
	private static int startY;
	
	private static int endX;
	private static int endY;
	
	private static ArrayList<ArrayList<Character>> arrayMaze;

	public static void main(String[] args) {
		System.out.println(MAZE);
		parsMaze();
		
		ArrayList<int[]> path = new ArrayList<>();
		findPath(path, startX, startY);
		
		
		drawMaze();
	}

	public static void parsMaze() {
		int x = 0;
		int y = 0;
		ArrayList<Character> row = new ArrayList<>();
		arrayMaze = new ArrayList<>();
		for (char cell : MAZE.toCharArray()) {
			switch (cell) {
			case '#':
				row.add(cell);
				x++;
				break;
			case 'S':
				row.add(' ');
				startX = x;
				startY = y;
				x++;
				break;
			case 'G':
				row.add(' ');
				endX = x;
				endY = y;
				x++;
				break;
			case ' ':
				row.add(cell);
				x++;
				break;
			case '\n':
				arrayMaze.add(row);
				row = new ArrayList<>();
				y++;
				x = 0;
				break;

			}

		}

	}
	
	public static boolean findPath(ArrayList<int[]>path, int x, int y) {
		drawMaze();
	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (x < 0 || y < 0 || x > arrayMaze.get(0).size() || y > arrayMaze.size()) {
			return false;
		}
		char cell = arrayMaze.get(y).get(x);
		
		if (cell == '#' || cell == '-')
			return false;
			
		path.add(new int[] {x, y});
		arrayMaze.get(y).set(x, '-');
		
		if (x == endX && y == endY) {
			return true;
		}
		
		if (findPath(path, x, y + 1))
			return true;
		if (findPath(path, x, y - 1))
			return true;
		if (findPath(path, x + 1, y))
			return true;
		if (findPath(path, x - 1, y))
			return true;
			
		path.remove(path.size()- 1);
		
		return false;
		
		
		
		
	}

	public static void drawMaze() {
		System.out.println("\n\n\n");
		System.out.println("\n\n\n");
		
		int[] position = path.get(0);
		int currentX = position [0];
		int currentY = position [1];
		path.remove(0);
		int y = 0;
		int x = 0;
		
	
		
		for (ArrayList<Character> row : arrayMaze) {
			for (char cell : row) {
				if (cell == '#') {
					cell = '\u2588';
				}
				if (currentX == x && currentY == y) {
					cell = "P";
					
				}
				System.out.print(cell);
				System.out.print(cell);
				x++;
			}
			System.out.println();
			y++;
		}
	}
}
