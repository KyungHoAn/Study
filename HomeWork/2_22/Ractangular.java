public class Rectangular extends Shape {
	private double width;
	private double hight;

	public Rectangular() {
		super();
	}
	public Rectangular(String name, double width, double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}

	public void setHight(double hight){
		this.hight = hight;
	}
	public double getHight(){
		return hight;
	}

	public void calculationArea(){
		System.out.print("직사각형의 면적은");
	}

	public void print(){
		System.out.println(getWidth()*getHight());
	}

}