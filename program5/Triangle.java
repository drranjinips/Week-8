package program5;

public class Triangle extends Shape{
	private double base;
	  private double height;

	  public Triangle(double base, double height) {
	    this.base = base;
	    this.height = height;
	  }
	  @Override
	  public void draw() {
	    System.out.println("Drawing a triangle");
	  }

	  @Override
	  public double calculateArea() {
	    return 0.5 * base * height;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
