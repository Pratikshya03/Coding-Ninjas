/*Problem Statement:Create a class Grand Father that has a parameterized constructor and a grand FatherName attribute.
Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.
Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a printName 
method that prints the sonName.fatherName, and grandFatherName into the format as shown below in SampleOutput 1.
You need to create the object of Son class and pass the value of sonName,fatherName,grand FatherName as 'Saurabh', 'Ramesh', and 'Suresh' 
respectively and call the printName method.
Sample Output 1:
sonname: Saurabh 
fathername: Ramesh 
grandfather: Suresh
Note:Keep all the attribute value static as above mention in sample output 1.
*/
import java.util.* ;
import java.io.*; 

// Create the classes here
class GrandFather{
	String grandFatherName;
	GrandFather(String grandFatherName){
		this.grandFatherName=grandFatherName;
	}
}
class Father extends GrandFather{
    String fatherName;
    Father(String grandFatherName,String fatherName){
		super(grandFatherName);
		this.fatherName=fatherName;
	}
}
class Son extends Father{
	String sonName;
	Son(String grandFatherName,String fatherName,String sonName){
		super(grandFatherName,fatherName);
		this.sonName=sonName;
	}
	void printName(){
		System.out.println("sonname: " + this.sonName);
		System.out.println("fathername: " + this.fatherName);
		System.out.println("grandfather: " + this.grandFatherName);
	}
}
class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Son ob=new Son("Suresh","Ramesh","Saurabh");
		ob.printName();
	}
}
