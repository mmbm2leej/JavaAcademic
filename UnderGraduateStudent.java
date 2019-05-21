class UnderGraduateStudent extends Student {
   public char getLetterGrade() {
	  double studentAvg = calcAvg();
      char letterGrade;
	  
	  //Grade Criteria
	  if (studentAvg >= 90) letterGrade = 'A';
	  else if (studentAvg >= 80) letterGrade = 'B';
	  else if (studentAvg >= 70) letterGrade = 'C';
	  else if (studentAvg >= 60) letterGrade = 'D';
	  else letterGrade = 'F';

      return letterGrade;
   }
}


/*

For the UnderGraduateStudent, the lowest passing grade in the getLetterGrade() is a ‘D’.
90-100 =A
80-89 = B
70-79 =C
60-69 = D
<60 =F

*/
