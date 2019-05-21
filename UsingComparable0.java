public class Colors implements Comparable<Colors> {
//i implemented an interface called Comparable that lets objects(complex data types) compare and sort themselves
	
    String colorID;

    String colorName;

    Colors() {

    }

    Colors(String colorID, String colorName) {
        this.colorID = colorID;
        this.colorName = colorName;
    }
    
    public String getColorID() {
    	return this.colorID;
    }
    
    public String getColorName() {
    	return this.colorName;  	
    }
    

    //This is what i think it needs
    //I made a method that makes each color object compare each other via their IDs, but could be anything
	//public int compareTo(Colors m) { 
	//	return (this.getColorID().compareTo(m.getColorID()));	
    //} 
	
	
	
	//I have it set to the IDs, but you guys can set it to this for sorting by Color Name instead!
	//But you cant have TWO compareTo functions, something weird will happen because the 
	//Collections.sort() references the compareTo in the object that it is working with
	
	
	  public int compareTo(Colors m) {
	  
	  		return (this.getColorName().compareTo(m.getColorName()));
	  }
	 

	  //just like this ^^^
}
