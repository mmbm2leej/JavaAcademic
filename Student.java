class Student {
   private int id;
   private int midtermExam;
   private int finalExam;
   char letterGrade = ' ';
   

	public void setFE(int finalgrade) {
		finalExam = finalgrade;
	
	}
	
	public void setME(int midtermgrade) {
		midtermExam = midtermgrade;
		
	}

	public void setID(int idnumber) {
		id = idnumber;
		
	}

	public int getID() {
		return id;
	}
	
   public double calcAvg() {
      double avg = (midtermExam + finalExam) / 2.0;
      return avg;
   }

}
