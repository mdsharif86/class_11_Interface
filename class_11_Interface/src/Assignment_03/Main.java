package Assignment_03;

public class Main {

	public static void main(String[] args) {
		Square tiles;
		tiles = new Square();

		tiles.setLength(10.1);
		System.out.println("Tiles length is = " + tiles.getLength());
		System.out.println("Tiles area is = " + String.format("%.2f", tiles.getArea()));
		System.out.println("Tiles perimeter is = " + tiles.getPermiter());

		System.out.println();

		Rectangle table;
		table = new Rectangle();
		table.setLength(10);
		table.setWidth(4);
		
		System.out.println("Table length is = " + table.getLength());
		System.out.println("Table width is = " + table.getWidth());
		
		System.out.println("Table area is = " + table.getArea());
		System.out.println("Table perimeter is = " + table.getPermiter());
		
		// AccessModifier ReturnType MethodName (can have parameter or not) {
				//Statements
		//}
	}

}
