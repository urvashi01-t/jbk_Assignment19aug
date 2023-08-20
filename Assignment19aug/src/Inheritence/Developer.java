package Inheritence;

public class Developer extends Employee{
String language;



public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public void displayDev() {
	System.out.println("name "+name+ " id "+id+" language "+language);
	
	
}
}
