import java.util.Scanner;

public class FreqTally {
	public static void main(String[] args) {
		int[] list = new int[51];
		Scanner keyinput = new Scanner(System.in);
		int val;
		do {
			System.out.println("Enter a value between 0 and 50 [ -1 to end ]");
			val = keyinput.nextInt();
			if ((val >= 0) && (val <= 50)) {
				list[val]++;
			}
		} while (val != -1);
		
		for(int i = 0; i < list.length; ++i) {
			if (list[i] > 0) {
				System.out.println("The number " + i + " was entered " + list[i] + " times.");
			}
			
		}
		

		
		
		keyinput.close();
		
	}

}
