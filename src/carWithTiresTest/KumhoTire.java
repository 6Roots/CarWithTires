package carWithTiresTest;

public class KumhoTire extends Tire {

	//필드
	public KumhoTire (int maximumRotation, String location) {
		super(maximumRotation, location);
	}
	//생성자

	@Override
	boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maximumRotation) {
			System.out.println(location + " 금호바퀴 수명 : " + (maximumRotation-accumulatedRotation) + "회");
			return true;
		}
		else { 
			System.out.println(location + " 금호바퀴가 멈췄습니다."); 
			return false;
		}
	}
	//메소드
	
}


