package carWithTiresTest;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("�ڵ����� ���� ���� ���� ���ϼ���.");
		
		Scanner scanner = new Scanner(System.in);		
		
		int runCounter = Integer.parseInt(scanner.nextLine());
				
		for(int i=0; i<runCounter; i++) {					
			switch(mycar.run()) {
			
			case 1 : System.out.println("-------"+mycar.frontLeftTire.location + "������ ���峵���ϴ�.-------");
			mycar.frontLeftTire = new KumhoTire (15, mycar.frontLeftTire.location);
			System.out.println(mycar.frontLeftTire.location + "������ �� ������ ���ҽ��ϴ�.");
			break;
			
			case 2 : System.out.println("-------"+mycar.frontRightTire.location + "������ ���峵���ϴ�.-------");
			mycar.frontRightTire = new KumhoTire (14, mycar.frontRightTire.location);
			System.out.println(mycar.frontRightTire.location + "������ �� ������ ���ҽ��ϴ�.");
			break;
			
			case 3 : System.out.println("-------"+mycar.backLeftTire.location + "������ ���峵���ϴ�.-------");
			mycar.backLeftTire = new KumhoTire (13, mycar.backLeftTire.location);
			System.out.println(mycar.backLeftTire.location + "������ �� ������ ���ҽ��ϴ�.");
			break;
			
			case 4 : System.out.println("-------"+mycar.backRightTire.location + "������ ���峵���ϴ�.-------");
			mycar.backRightTire = new KumhoTire (15, mycar.backRightTire.location);
			System.out.println(mycar.backRightTire.location + "������ �� ������ ���ҽ��ϴ�.");
			break;	
			
			case 0 : System.out.println("------------�ڵ����� �����Դϴ�.-------------");
			}
			
			
		}	
		
	}
}
