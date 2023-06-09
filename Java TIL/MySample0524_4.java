package sstStudy;

class Car{
	
	String color;
	String gearType;
	int door;
	
	//생성자
	/*첫번째 예제
	Car(){
		
	}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
		
	}
*/
	Car(){
//		this.color = "white";
//		this.gearType = "auto";
//		this.door = 4;
		this("white", "auto", 4);
		System.out.println("매개변수 없음");
	}

	Car(String color){
//		this.color = color;
//		this.gearType = "auto";
//		this.door = 4;		
		this("blue", "auto", 4);
		System.out.println("매개변수 1개 color.");
	}
	Car(String color, String gearType){
//			this.color = color;
//			this.gearType = gearType;
//			this.door = 2;
			this(color, gearType, 2); //메서드 처럼 Car(color, gearType, 2);이 안되기 떄문
			//다른 생성자 호출하는 원칙 -> 반드시 생성자의 첫번째 줄에 와야함

			System.out.println("매개변수 2개 color, gearType.");
	}
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType = gearType;
		this.door = door;

		System.out.println("매개변수 3개 최종.");//여기서는 sysout문과 this들의 코드 순서는 상관없다
	}
//this. 인스턴스변수에 붙여준다
	//만약지역변수와 인스턴스 변수가 이름이 같을 때 구분하기 위해 인스턴스 변수앞에 this.을 붙여준다
}



public class MySample0524_4 {

	public static void main(String[] args) {
		//생성자
/*첫번재 예제
		Car c1 =new Car(); //c1과  c2는 집이 다름
		c1.color ="white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 =new Car("blue" , "auto", 2);
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType + ", door="+ c2.door);
*/
		
		//두번째 예제
		System.out.println("main 시작 c1 생성");//흐름 파악위해 출력
		Car c1 = new Car();
		System.out.println("main 시작 c2 생성");
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType + ", door="+ c2.door);
			
	}
}
