public class Grades {
	  private int[] values;
	
	  Grades() {
		  
		  
	  };
		  
	  Grades(int[] myArray) {
		  values = myArray;
	  }
	  
	  // set values declaration
	  public void setValues(int[] arr) {
		  values = arr;
	  }
	  
	  public int[] getValues() {
		  int[] arr = values;
		  return arr;
	  }
	  
	  public int highest(int[] arrCopy) {
		  int highest = 0;
		  for (int i = 0; i < arrCopy.length; ++i) {
			  if (highest < arrCopy[i]) highest = arrCopy[i];
		  }
		  return highest;
	  }
	  public int lowest(int[] arrCopy) {
		  int lowest = 100;
		  for (int i = 0; i < arrCopy.length; ++i) {
			  if (lowest > arrCopy[i]) lowest = arrCopy[i];
		  }
		  return lowest;
	  }
	  public int numOfGrades(int[] arrCopy) {
		  return arrCopy.length;
	  }
	  public double average(int[] arrCopy) {
		  int sum = 0;
		  for (int i = 0; i < arrCopy.length; ++i) {
			  sum += arrCopy[i];  
		  }
		  
		  return (sum/arrCopy.length);
	  }
	  
	  //returns the number of values in the array that are less than input value, gradeValue 
	  public int numOfFailingGrades(int[] arrToCheck, int passMark) { 
		  int failCount = 0;
		  for (int i = 0; i < arrToCheck.length; ++i) {
			  if (arrToCheck[i] < passMark) failCount++;
		  }
		  return failCount;
	  }
	  
	  
	  //prints the histogram of grades
	  public void histogram(int[] arrToShow) { 
		  int counttopten = 0, count80to89 = 0, count70to79 = 0, count60to69 = 0, countbelow60 = 0;
		  for (int i = 0; i < arrToShow.length; ++i) {
			  if (arrToShow[i] >= 90) counttopten++;
			  else if (arrToShow[i] >= 80) count80to89++;
			  else if (arrToShow[i] >= 70) count70to79++;
			  else if (arrToShow[i] >= 60) count60to69++;
			  else countbelow60++;  
		  }
		  System.out.print("90 - 100  |  ");
		  for (int i = 0; i < counttopten; ++i) System.out.print("*");
		  
		  System.out.print("\n80 - 89   |  ");
		  for (int i = 0; i < count80to89; ++i) System.out.print("*");
		  
		  System.out.print("\n70 - 79   |  ");
		  for (int i = 0; i < count70to79; ++i) System.out.print("*");
		  
		  System.out.print("\n60 - 69   |  ");
		  for (int i = 0; i < count60to69; ++i) System.out.print("*");
		  
		  System.out.print("\n< 60      |  ");
		  for (int i = 0; i < countbelow60; ++i) System.out.print("*");
		  
	  } 
	


}



/*

Design and implement a class called Grades that stores an array of int (grades). The class will contain the following methods/operations:

  1) highest - returns the highest grade
  2) lowest - returns the lowest grade
  3) number of grades - returns the number of grades in the array
  4) average - returns the average of all the grades
  5) number of failing grades – takes in a grade value and returns the number of grades below the input grade value.
  6) histogram – creates a histogram that allows you to visually inspect the frequency distribution of grades.
	90 – 100 | ****
	80 – 89  | **********
	70 – 79  | ********
	60 – 69  | ****
	< 60     | **

Write a main method to test out this object. In the main program, allow the user to enter the grades into the array.  Since you would need to know the size of the array beforehand, you would prompt the user to first enter the number of grades and then prompt the user to enter each grade.  Valid grade values are 0 – 100 inclusive.


	For Example:
		Enter the number of grades to input: 5
		Enter grade 1:  90
		Enter grade 2:  80
		Enter grade 3:  70
		Enter grade 4:  85
		Enter grade 5:  95

Class definition:

class Grades {

  private int[] values;

  Grades () {…};
  Grades (int[] myArray) {…};
  public void setValues(int[] myArray) { // set values declaration };
  public int[] getValues() { // returns values array};
  public int highest() {// returns the highest value in array };
  public int lowest() {// returns the lowest value in array };
  public int numOfGrades() {// returns the number of grades in array };
  public double average() { // returns the average of array };
  public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue };
  public void histogram() { // prints the histogram of grades };

}  









*/
