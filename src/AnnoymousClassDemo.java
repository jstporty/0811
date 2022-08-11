
public class AnnoymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void display() {
				System.out.println("나는 재정의된");
			}
			public void print(){
				System.out.println("나는 새로운 메소드");
			}
		};// 매우 주의할것
		d.display();
		//d.print();     //재정의하려는 클래스의 멤버가 아니기 때문에 즉, 정의되어있지 않기 때문임 ㅋ
	}
}

class Demo {
	public void display() {
		System.out.println("나는 원형 메소드");

	}
}