package oop6.abstractc;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is pecking");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Breathing...");

	}
	
	public abstract void fly();
	

}
