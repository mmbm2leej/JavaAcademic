import java.io.File; 
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ReadfromFile { 
	
	public static void main(String[] args) throws Exception { 
		//pass the path to the file as a parameter 
		File file = new File("C:\\Users\\owner\\eclipse-workspace\\EmailParser\\src\\attendance.txt"); 
	    Scanner sc = new Scanner(file); 
	    ArrayList<Email> emailcollection = new ArrayList<Email>();
	  
	    while (sc.hasNextLine()) {
	    	Email currentem = new Email(sc.nextLine());
	    	emailcollection.add(currentem);
	    	//System.out.println("Current Email object Company is: " + currentem.parseCompanyName()); 
	    	//System.out.println("Current Email object name is: " + currentem.parseEmailName()); 
	    	//System.out.println("Current Email object Extension is: " + currentem.parseExtension() + "\n"); 
	    	

	    }
	    //System.out.print("\n\n\n\n");
	    
    	Collections.sort(emailcollection);
	    
	    int SecondCol = 10;
	    int diff = 0;
    	
    	for (int i=0; i<emailcollection.size(); i++) {
	    	System.out.print(emailcollection.get(i).parseCompanyName());
	    	diff = SecondCol - (emailcollection.get(i).parseCompanyName()).length();
	    	while (diff > 0) {
	    		System.out.print(" ");
	    		diff--;
	    	}
	    	System.out.println(emailcollection.get(i).parseEmailName());
	    	
    	}
	    
	    
	    
	    
		    
    	sc.close();
	} 
  

} 
