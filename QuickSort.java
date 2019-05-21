import java.util.Random; 

class QuickSort {
	
	public static void swap(int[] arr, int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
		
	}
	
	public static int partition(int[] arrToPass, int start, int end) {
		
		int[] arr = arrToPass;
		int pivot = arr[end];
		int pIndex = start;
		
		for (int i = 0; i < end-1; ++i) {
			
			if (arr[i] <= pivot) {
				swap(arr, arr[i], arr[pIndex]);
				pIndex++;
			}
		
		}

		return pIndex;
	}
	
	public static void quickSort(int[] arrToPass, int start, int end) {
		
		int[] newArr = arrToPass;
		if (start < end) {
			int pIndex = partition(newArr, start, end);
			quickSort(newArr, start, pIndex-1);
			quickSort(newArr, pIndex+1, end);
		}

		
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
		
		quickSort(myArray, 0, myArray.length-1);
		System.out.println("\n\nArray after bubblesort: ");
		for(int i = 0; i < myArray.length; i++) {
			
			System.out.print(myArray[i] + " | ");
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
