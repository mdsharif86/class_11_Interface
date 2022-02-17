package Quiz_02;

public class Rectangle implements Shape {

	private double height;
	private double width;

	void setHeight(double height) {
		this.height = height;
	}

	double getHeight() {
		return this.height;
	}

	void setWidth(double width) {
		this.width = width;
	}

	double getWidth() {
		return this.width;
	}

	@Override
	public double getArea() {
		return (this.height * this.width);
	}

	@Override
	public double getPerimeter() {
		return (2 * (this.height + this.width));
	}

}
