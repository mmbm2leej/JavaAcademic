public class StudentMain {
	public static void main(String[] args) {
	
	UnderGraduateStudent Kevin = new UnderGraduateStudent();
	Kevin.setFE(68);
	Kevin.setME(63);
	Kevin.setID(4023);
	
	GraduateStudent Steve = new GraduateStudent();
	Steve.setFE(62);
	Steve.setME(66);
	Steve.setID(7231);
	
	System.out.println("Student with ID: " + Kevin.getID() + " has an average grade of " + Kevin.calcAvg() + "And has a letter grade of " + Kevin.getLetterGrade());
	System.out.println("But Student ID: " + Steve.getID() + " has the same grade, and he is a graduate student, so his letter grade is " + Steve.getLetterGrade());
	

		
		
		
	}

}
