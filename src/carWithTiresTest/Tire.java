package carWithTiresTest;

public class Tire {
	public int maximumRotation;
	String location;
	public int accumulatedRotation = 0;
	//필드생성
	
	
	public Tire (int maximumRotation, String location) {
	this.maximumRotation = maximumRotation;
	this.location = location;
	}
	// 생성자
	
	
	boolean roll() {
		accumulatedRotation++;
		System.out.println(location + " 바퀴 수명 : " + (maximumRotation-accumulatedRotation) + "회");
		if(accumulatedRotation < maximumRotation) {
			return true;
		}
		else { 
			System.out.println(location + " 바퀴가 멈췄습니다."); 
			return false;
		}
	}
	//메소드
	
	
}
