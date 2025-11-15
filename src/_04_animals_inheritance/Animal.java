package _04_animals_inheritance;

public class Animal {
	String name;
	String furColor;
	boolean isGirl;
	
	Animal(String name, String furColor, boolean isGirl){
		this.name=name;
		this.furColor=furColor;
		this.isGirl=isGirl;
	}
	
	public void setupAnimal() {
		System.out.println("My name is " + name);
		System.out.println("Playing"); 
		System.out.println("Eating");
		System.out.println("Sleeping");
		
	}
}
