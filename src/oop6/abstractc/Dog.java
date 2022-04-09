package oop6.abstractc;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Breathing...");
	}


	

}
