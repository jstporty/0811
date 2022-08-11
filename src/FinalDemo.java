/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * <li><b>Final Variable</b> : 자바의 상수</li>
 * <li><b>Final Method</b> : Override의 금지</li>
 * <li><b>Final Class</b> : 상속의 금지</li>
 * 
 * </ul>
 * 
 * @author 승현
 * @version 1.1
 * @since 2022-08-11
 * 
 */
public class FinalDemo extends Parent {
	private final double PI = Math.PI; // 멤버 상수
	private static final boolean FALG = true; // 스테틱 상수

	public static void main(String[] args) {
		final String NAME = "한지민"; // 지역상수

	}

	public final void display() {
		System.out.println("나는 부모의 메소드");
	}
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//		
//	}
}

final class Parent {
	public final void display() {
		System.out.println("나는 부모의 메소드");
	}
}
//abstract class Super{
//	public final void display() {System.out.println("나는 부모의 메소드");}  //재정의 금지
//		public abstract void print(); 
//		
//	}
