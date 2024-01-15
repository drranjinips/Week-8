package program5;
class Circle extends Shape{
	private double radius;

	 Circle(double radius) {
	    this.radius = radius;
	  }
	 public void draw() {
		    System.out.println("Drawing a circle");
		  }
	 @Override
	  public double calculateArea() {
	    return Math.PI * radius * radius;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
