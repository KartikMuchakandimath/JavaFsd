package oop6.abstractc;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" fliying");
		
	}

}
