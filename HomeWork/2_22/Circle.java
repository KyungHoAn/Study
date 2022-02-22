public class Circle extends Shape{
	private double radius;

	public Circle(){
		super();
	}
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void calculationArea(){
		System.out.print("원의 면적은");
	}
	public void print(){
		System.out.println(getRadius()*getRadius()*3.141592);
	}

}