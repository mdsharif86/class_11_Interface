package Quiz_02;

public class Quiz_02_Main {

	public static void main(String[] args) {
		Rectangle table;
		table = new Rectangle();
		
		table.setHeight(20);
		table.setWidth(10);
		System.out.println("Area of Table: " + table.getArea());
		System.out.println("Perimeter of Table: " + table.getPerimeter());
	
		Circle ball;
		ball = new Circle();
		
		ball.setRadius(30);
		System.out.println("Area of ball: " + String.format("%.3f", ball.getArea()));
		System.out.println("Perimeter of a ball: " + String.format("%.2f",  ball.getPerimeter()));
		
		
	}

}
