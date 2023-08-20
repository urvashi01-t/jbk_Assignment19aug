package Inheritence;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
Manager m = new Manager();
Developer d= new Developer();

Scanner sc = new Scanner(System.in);
System.out.println("enter name of manager");
m.name=sc.nextLine();
System.out.println("enter department of manager");
m.department=sc.nextLine();

System.out.println("enter id of manager");
m.id=sc.nextInt();


Scanner st = new Scanner(System.in);
System.out.println("enter name of developer");

d.name=st.nextLine();
System.out.println("enter language of developer");

d.language=st.nextLine();

System.out.println("enter id of developer");

d.id=st.nextInt();

m.displayManager();	
d.displayDev();
	
	
	}

}
