package oop6.abstractc;

public class testAbstract {
	public static void main(String[] args) {
		Animal animal = new Dog("doggy");
		animal.eat();
		animal.breath();
		
		Bird bird = new Parrot("parrot");
		bird.eat();
		bird.breath();
		bird.fly();
	}

}
