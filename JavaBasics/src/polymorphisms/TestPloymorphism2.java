package polymorphisms;
class Shape{
	void draw() {
		System.out.println("drawing...");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle...");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle...");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("drawing triangle...");
	}
}
class TestPloymorphism2 {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();//Reference variable of Parent class refers to a Child class--upcasting
		s.draw();//drawing rectangle...
		s = new Circle();
		s.draw();//drawing circle...
		s = new Triangle();
		s.draw(); //drawing triangle...
	}

}
