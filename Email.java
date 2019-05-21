public class Email implements Comparable<Email> {

	 private String emailStr;

	Email() {  }

	Email(String str) {
			emailStr = str;
	 }

	public String parseEmailName() {
		//grab everything before the @ 
	
		String name;
		int pos = emailStr.indexOf('@');

		name = emailStr.substring(0,pos);

		return name;

	}

	public String parseCompanyName() {
		//grab everything between @ and .
	
		String company;
		int pos = emailStr.indexOf('@');
		int dot = emailStr.lastIndexOf('.');

		company = emailStr.substring(pos+1, dot);
		return company;

	}

	public String parseExtension() {
		String ext;
		int dot = emailStr.lastIndexOf('.');

		ext = emailStr.substring(dot+1,emailStr.length());
		return ext;
	}
	
	public int compareTo(Email m) 
    { 
		if (	(this.parseCompanyName().compareTo(m.parseCompanyName()))	 !=		 0		)
			return this.parseCompanyName().compareTo(m.parseCompanyName()); 
		else return this.parseEmailName().compareTo(m.parseEmailName());
    } 


}
