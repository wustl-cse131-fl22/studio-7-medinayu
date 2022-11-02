package studio7;

public class Rectangle {

	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private double x;
	private double y;
	
	public Rectangle (double length, double width, double area, double perimeter, double x, double y) 
	{
		this.length = length;
		this.width = width;
		this.area = area;  // this.area = length * width;
		this.perimeter = perimeter;
		this.x = x;
		this.y = y;
		
	}
	
	public double getLength () {
		return length;	
	}
	
	public double getWidth () {
		return width;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public static void main(String[] args) {
		
		Rectangle p = new Rectangle(1.0,1.0,1.0,4.0,0.5,0.5);
		p.getArea();
		p.getPerimeter();
		
		System.out.println(p.area);
		System.out.println(p.perimeter);
//		if (length = width) {
//			
//		}
	}
	
	
}

