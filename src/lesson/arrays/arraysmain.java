package lesson.arrays;

public class arraysmain {

	public static void main(String[] args) {
		//deklarerar
		int[] intArray;
		//antal positioner
		intArray = new int[20];
		
		intArray[0] = 21;
		
		System.out.println("position 1: " + intArray[0]);
		System.out.println("position 2: " + intArray[1]);
		
		intArray[5] = 123123;
		
		intArray[10] = 13;
		
		byte[] anArrayBytes = new byte [3];
		
		String[] stringArray = new String[20];
	}
}
