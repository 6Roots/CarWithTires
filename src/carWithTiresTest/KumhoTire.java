package carWithTiresTest;

public class KumhoTire extends Tire {

	//�ʵ�
	public KumhoTire (int maximumRotation, String location) {
		super(maximumRotation, location);
	}
	//������

	@Override
	boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maximumRotation) {
			System.out.println(location + " ��ȣ���� ���� : " + (maximumRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		else { 
			System.out.println(location + " ��ȣ������ ������ϴ�."); 
			return false;
		}
	}
	//�޼ҵ�
	
}


