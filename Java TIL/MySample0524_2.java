package sstStudy;


class Computer{
	void show(int a) {
		System.out.println("컴퓨터 가격은 : " + a + "원 입니다.");
	}
	void show(String a) {
		System.out.println("제품은 " + a + "입니다.");
	}
	void show(String a, int b) {
		System.out.println("구매한 제품은 : " + a + "이며," + b + "원 입니다.");
	}
	//만약 main에서 c.show
	//System.out.println(("컴퓨터", 10000)); 라면 오류!! sysout()은 만드시 리턴값이 있어야하는데 void는 리턴값 없기 때문!!
	
	 /* int show(String a, int b) {
		System.out.println("구매한 제품은 : " + a + "이며," + b + "원 입니다.");
		return a;
		이런식으로 해도 실행은 된다
		*return은 호출하는 곳과는 상관이 없기떄문 -> 메서드 입장에서는 나는 리턴값 줄거야 쓰던말던 너가 알아서해 이기 때문 
	} 
	 */	
}

class Member{
	int iv =10; //인스턴스 변수
	static int cv =20;//클래스 변수
	
	int iv2 = iv; //인스턴스 변수이기 때문에 가능
	//static int cv2 = iv; //iv는 인스턴스 변수이므로 불가능 -> iv는 인스턴스이므로 객체를 생성해줘야해서  
	//Q cv2는 
	
	
	//클래스변수와 인스턴스변수가 언제 사용되는지를 보는 예제
	
//	Member k = new Member();  클래스 영역에 객체 생성하지 않는것이 맞음
//	static int cv2 = k.iv;    이것을 한줄로 표현해놓은게 바로 밑에 줄
	//static은 jVM이 실행되는 순간 부터 생성되고 인스턴스변수는 객체가 생성되는 시점에 생기므로 생성시점이 다르기 때문에 
	//static에서는 인스턴스값 k.iv을 찾을수없어서 오류!!
	static int cv2 = new Member().iv;  //이거는 억지로 쓴거임  강제로 인스턴스변수를 쓰기 위해 쓴거임
	
	
	//static 메서드에서는 static 메서드는 호출가능, 인스턴스 메서드는 호출 불가능
	//인스턴스 메서드에서는 인스턴스 메서드 와 static 메서드 모두 호출 가능
	static void staticMethod1() {  //클래스 메서드
		System.out.println(cv);
		//System.out.println(iv);  // 인스턴스 변수라 불가능
		Member c = new Member();
		System.out.println(c.iv);
	}
	void instancMethod1() {    //인스턴스 메서드
			System.out.println(cv);
			System.out.println(iv);
		}

	
	static void staticMethod2() {
		staticMethod1();//원래 문법은 클래스명.메서드명()  Member.staticMethod2();이렇게 서야맞지만
		//같은 클래스 안에 있는 메서드를 사용할 떄는
		//클래스메서드는 같은 클래스 안에서 다른메서드를 호출 할 수 있다
		
		//instancethod1(); 이렇게하면 오류!! 객체 생성하지 않아서 클래스 메서드에서 인스턴스 메서드호출하려면 아래처럼 객체 생성해줘야함
		Member c = new Member();
		c.instancMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1(); //원칙 : 클래스명.메서드명() Member.staticMethod1()
		instancMethod1();//이렇게 할 수 있는 이유는 void instanceMethod2()가 인스턴스 메서드이기 때문,
		//또 인스턴스 메서드가 쓰이기 위해서는 이전에 객체를 생성한 상태여야하기 때문에 이미 객체가 생성된상태임 , 그렇기 떄문에 호출 가능한것임
	/*void instanceMethod2() void instancMethod1() 를 사용하려면 너가 main이든 어디든 객체를 생성하고 이걸사용해라
	 * instancMethod1()가 오류가 나지 않는 이유는 사용자가 객체를 생성하고 사용할 것이라는 가정하를 바탕으로 하기 때문임
	 */

	}
	
	
	//클래스 객체 생성할때 클래스명뒤에 (); 가 있다는 것은 매개변수
//객체를 생성할 때 매개변수로 쓰이는게 생성자임
	
	
}

public class MySample0524_2 {

	public static void main(String[] args) {
		//메서드 오버로딩
		/*메서드 명은 show
		 * 실행결과)
		 * 컴퓨터 각격은 : 10000원 입니다.
		 * 제품은 : 컴퓨터 입니다.
		 * 구매한 제품은 : 컴퓨터 이며, 10000원 입니다.
		 */
		
		Computer c = new Computer();
		c.show(10000);
		c.show("컴퓨터");
		c.show("컴퓨터", 10000);
		
	}
}
