package carWithTiresTest;

public class Tire {
	public int maximumRotation;
	String location;
	public int accumulatedRotation = 0;
	//�ʵ����
	
	
	public Tire (int maximumRotation, String location) {
	this.maximumRotation = maximumRotation;
	this.location = location;
	}
	// ������
	
	
	boolean roll() {
		accumulatedRotation++;
		System.out.println(location + " ���� ���� : " + (maximumRotation-accumulatedRotation) + "ȸ");
		if(accumulatedRotation < maximumRotation) {
			return true;
		}
		else { 
			System.out.println(location + " ������ ������ϴ�."); 
			return false;
		}
	}
	//�޼ҵ�
	
	
}
