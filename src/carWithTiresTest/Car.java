package carWithTiresTest;

public class Car {

	Tire frontLeftTire = new Tire(3, "앞왼쪽");
	Tire frontRightTire = new Tire(5, "앞오른쪽");
	Tire backLeftTire = new Tire(4, "뒤왼쪽");
	Tire backRightTire = new Tire(6, "뒤오른쪽");
	
	//필드  Tire라는 클래스에서 여러개의 타이어(객체)를 만들었음. 그리고 이 클래스 또한 다른 객체를 만들기 위한 클래스임.
			
	//생성자
	
	int run() {
		boolean fltr = frontLeftTire.roll();
		boolean frtr = frontRightTire.roll();
		boolean bltr = backLeftTire.roll();
		boolean brtr = backRightTire.roll();
				
		
		if (fltr == false) {
			stop();
			return 1;
		}
		if (frtr == false) {
			stop();
			return 2;
		}
		if (bltr == false) {
			stop();
			return 3;
		}
		if (brtr == false) {
			stop();
			return 4;
		}
		return 0;
	}
	// 바퀴가 네 개이고, 각자 다른 값을 호출하기 위함. 메인 클래스에서 모두 메소드로 표현하면 복잡하므로, 여기서 리턴값으로 미리 분류해둠.
	
	void stop() {
		System.out.println("자동차가 멈췄습니다.");
	}
	//메소드
}
