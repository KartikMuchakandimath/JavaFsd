package design;

public class FactoryPattern {
public static void main(String[] args) {
	ShapeFactory sf = new ShapeFactory();
	Shape shape1 = sf.getshape("Circle");
	shape1.draw();
	Shape shape2 = sf.getshape("Rectangle");
	shape2.draw();
	Shape shape3 = sf.getshape("Square");
	shape3.draw();
	
}
}
 class ShapeFactory{
	 public Shape getshape(String shapetype) {
		 switch(shapetype) {
		 case "Circle":
			 return new Circle();
		 case "Rectangle":
			 return new Rectangle();
		 case "Square":
			 return new Square();
			 
		 }
		 return null;
	 }
 }
 interface Shape{
	 void draw();
 }
 
 
 class Rectangle implements Shape {

		@Override
		public void draw() {
			System.out.println("Rectangle.draw() method..");
		}
		
	}
 
 class Square implements Shape {

		@Override
		public void draw() {
			System.out.println("Square.draw() method..");
		}
		
	}


	class Circle implements Shape {

		@Override
		public void draw() {
			System.out.println("Circle.draw() method..");
		}
		
	}