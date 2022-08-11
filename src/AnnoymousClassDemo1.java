
public class AnnoymousClassDemo1 {
	public static void main(String[] args) {
		AnnoymousClassDemo1 acd = new AnnoymousClassDemo1();
		//acd.exec(acd.new MyClass());
		//acd.exec(acd.new MyMultiple());
		acd.exec(new MyInterface() {
			@Override
			public int calculate( int a, int b) {return a+b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate( int a, int b) {return a-b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate( int a, int b) {return a*b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate( int a, int b) {return a/b;}
		});

	}

	void exec(MyInterface mi) {// 멤버 메소드
		int result = mi.calculate(5, 9);
		System.out.println("Result=" + result);
	}

//	class MyMultiple implements MyInterface{
//		
//		@Override
//		public int calculate (int front, int back) {
//			return front*back;
//	}
//	}
//	class MyClass implements MyInterface { // 멤버클래스
//
//		@Override
//			public int calculate (int front, int back) {
//				return front+back;
//			}
//
//	}
}

@FunctionalInterface
interface MyInterface {
	int calculate(int front, int back);

}