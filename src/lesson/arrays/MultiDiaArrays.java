package lesson.arrays;

public class MultiDiaArrays {

	public static void main(String[] args) {
		String[][] names = {
				{"Mr.", "Mrs.", "Ms. "},
				{"Jonas", "Peter", "Nada"}
				
		};
		
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][2]);
		
		System.out.println(names[0].length);
		
		for (int i = 0; i < names [0].length; i++) {
			names[0][i] = "lord";
			
		}
		System.out.println(names[0][0]);
	}

}
