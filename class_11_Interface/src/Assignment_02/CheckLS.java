package Assignment_02;

public class CheckLS implements LargeSmall {

	@Override
	public void large(int a, int b) {
		if (a > b) {
			System.out.println("Larger number is= " + a);
		} else {
			System.out.println("Larger number is= " + b);
		}
	}

	@Override
	public void small(int a, int b) {
		if (a > b) {
			System.out.println(" smaller number is=" + b);
		} else
			System.out.println("smaller number is=" + a);

	}

}
