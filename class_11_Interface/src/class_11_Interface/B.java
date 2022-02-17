package class_11_Interface;

public class B implements A, C {

	@Override
	public void method1() {
		System.out.println("method1 in Class B");
	}

	@Override
	public void method2() {
		System.out.println("method2 in Class B");
		
	}

	@Override
	public int method3() {
		System.out.println("method3 in Class B");
		return 50;
	}
	//Inheritance use extends keyword
	// interface use Implements keyword

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method6() {
		// TODO Auto-generated method stub
		return 0;
	}
}
