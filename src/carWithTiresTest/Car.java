package carWithTiresTest;

public class Car {

	Tire frontLeftTire = new Tire(3, "�տ���");
	Tire frontRightTire = new Tire(5, "�տ�����");
	Tire backLeftTire = new Tire(4, "�ڿ���");
	Tire backRightTire = new Tire(6, "�ڿ�����");
	
	//�ʵ�  Tire��� Ŭ�������� �������� Ÿ�̾�(��ü)�� �������. �׸��� �� Ŭ���� ���� �ٸ� ��ü�� ����� ���� Ŭ������.
			
	//������
	
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
	// ������ �� ���̰�, ���� �ٸ� ���� ȣ���ϱ� ����. ���� Ŭ�������� ��� �޼ҵ�� ǥ���ϸ� �����ϹǷ�, ���⼭ ���ϰ����� �̸� �з��ص�.
	
	void stop() {
		System.out.println("�ڵ����� ������ϴ�.");
	}
	//�޼ҵ�
}
