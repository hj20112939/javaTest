package rtti;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
	void draw(){
		System.out.println(this + ".draw()");
	}
	void rotate(){
		System.out.println(this + ".rotate()");
	}
}

class Circle extends Shape{
	public String toString(){
		return "Circle";
	}
}
class Square extends Shape{
	public String toString(){
		return "Square";
	}
}
class Triangle extends Shape{
	public String toString(){
		return "Triangle";
	}
}
class Rhomboid extends Shape{
	public String toString(){
		return "Rhomboid";
	}
}
public class Shapes {
	public static void main(String args[]){
		List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle());
		for(Shape shape : shapeList){
			shape.draw();
		}
		Shape s = new Rhomboid();
		
		Rhomboid r = (Rhomboid)s;
		r.draw();
		
		if(s instanceof Circle){
			Circle c = (Circle)s;
			c.draw();
		}
		
		if(! (s instanceof Circle)){
			s.rotate();
		}
	}
	
}
