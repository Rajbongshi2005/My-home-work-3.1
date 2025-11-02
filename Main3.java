import java.util.Scanner;
class Shape
{
	public void calculateArea() 
	{
		System.out.println(" this shape area is  "+"0");
	}
}
class Circle extends Shape
{
	public void calculateArea(float radius) 
	{
		System.out.println(" this circle area is  "+(3.1416*radius*radius));
	}
}
class Rectangle extends Shape
{
	public void calculateArea(int length,int width) 
	{
		System.out.println(" this rectangle area is  "+(length*width));
	}
}
class Triangle extends Shape
{
	public void calculateArea(double length,double width)
	{
		System.out.println(" this Triangle area is  "+(0.5*length*width));
	}
}
class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Circle c1=new Circle();
		c1.calculateArea();
		float redius;
		System.out.print("Enter redius: ");
		redius=in.nextFloat();
		c1.calculateArea(redius);
		
		Rectangle r1= new Rectangle();
		int length;
		System.out.print("Enter length: ");
		length=in.nextInt();
		int width;
		System.out.print("Enter width ");
		width=in.nextInt();
		r1.calculateArea();
		r1.calculateArea(length,width);
		
		Triangle t1=new Triangle();
		System.out.print("Enter length: ");
		double length1=in.nextDouble();
		System.out.print("Enter width ");
		double width1=in.nextDouble();
		
		t1.calculateArea();
		t1.calculateArea(length1,width1);

	}
}