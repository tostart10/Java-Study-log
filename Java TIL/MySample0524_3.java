package sstStudy;


class Data2{
	int value;  //클래스가 자동으로 =0으로 초기화 해줌
	//생성자 원칙1-> 메서드명이 클래스명과 같아야한다. +하나의 클래스에 매서드 명이 같은게 여러개
	//원칙 2 리턴타입 없다(앞에 리턴타입 안쓴다 문법임!)
	//3 매개변수의 개수와 타입이 다르다
	
	Data2(){ //생성자

		System.out.println("생성자 Data2() 호출");
	}
	//만약 매개변수가 없는 생성자가 없다면 main에서 객체를 생성할 때 매개변수가 있는 객체만 생성할 수 있다. 매개변수없는 객체선언하면 오류남!
	//생성자가 하나라도 있기 때문에 default 생성자를 만들어주기 않기 떄문에 매개변수 생성자가 없는 상태인거임
	
	Data2(int x){
		
		System.out.println("생성자 Data2(int x) 호출");
		value = x;  //인스턴스 변수 x 안에 값을 넣어줌
	}
}

public class MySample0524_3 {

	public static void main(String[] args) {
		//생성자
		Data2 d = new Data2();
		Data2 d2 = new Data2(10);
		
		System.out.println("d.value : " + d.value);  //0
		System.out.println("d2.value : " + d2.value); //10
	}
}
