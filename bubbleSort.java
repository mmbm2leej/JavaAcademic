import java.util.Random; 

class BubbleSort {

	public static int[] bubbleSort(int[] arrToPass) {
		
		int[] newArr = arrToPass;

		for (int i = 0; i < (newArr.length); i++) {
			for(int j = 1; j < (newArr.length-i); j++){  

				if (newArr[j-1] > newArr[j]) {
					newArr[j-1] ^= newArr[j];
					newArr[j] ^= newArr[j-1];     
					newArr[j-1] ^= newArr[j];
				} 
			}
		}
		
		return newArr;
	
		
		
	}
	
	//Array Creation Method
	public static int[] createArray(int size) {
		Random rand0 = new Random(); 
		
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = rand0.nextInt(100);	//Anywhere from 0 to 100
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		//Create an array filled with 50 random integers
		int[] myArray = createArray(20);
		System.out.println("Old array: ");
		for(int i = 0; i < myArray.length; i++) {
		
			System.out.print(myArray[i] + " | ");
			
		}
		
		int[] arrSorted = bubbleSort(myArray);
		System.out.println("\n\nArray after bubblesort: ");
		for(int i = 0; i < arrSorted.length; i++) {
			
			System.out.print(arrSorted[i] + " | ");
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
