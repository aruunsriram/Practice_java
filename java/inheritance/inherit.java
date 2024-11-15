package samp;

class Animal{
	String name;
	int age;
	
	void makeSound()
	{
		System.out.println("Animal makes sound");
	}
	
}

class Dog extends Animal{
	String breed;
	
	@Override
	void makeSound() 
	{
		System.out.println("Dog Barks");
	}
	
	void fetch() 
	{
		System.out.println("Dog is fetching");
	}
	
}

class Cat extends Animal{
	String color;
	
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
	
	void climb() {
		System.out.println("Cat is climbing");
	}
}

public class News {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
		c1.climb();
		 
		
		
	}

}
