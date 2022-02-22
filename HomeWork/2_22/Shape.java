abstract class Shape {
	double area;
	private String name;

	public Shape(){
		super();
	}
	public Shape(String name){
		this.name=name;
	}

	public abstract void calculationArea();

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void print(){
	}
}