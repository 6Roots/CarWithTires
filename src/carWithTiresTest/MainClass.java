package carWithTiresTest;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("자동차가 굴릴 바퀴 수를 정하세요.");
		
		Scanner scanner = new Scanner(System.in);		
		
		int runCounter = Integer.parseInt(scanner.nextLine());
				
		for(int i=0; i<runCounter; i++) {					
			switch(mycar.run()) {
			
			case 1 : System.out.println("-------"+mycar.frontLeftTire.location + "바퀴가 고장났습니다.-------");
			mycar.frontLeftTire = new KumhoTire (15, mycar.frontLeftTire.location);
			System.out.println(mycar.frontLeftTire.location + "바퀴를 새 바퀴로 갈았습니다.");
			break;
			
			case 2 : System.out.println("-------"+mycar.frontRightTire.location + "바퀴가 고장났습니다.-------");
			mycar.frontRightTire = new KumhoTire (14, mycar.frontRightTire.location);
			System.out.println(mycar.frontRightTire.location + "바퀴를 새 바퀴로 갈았습니다.");
			break;
			
			case 3 : System.out.println("-------"+mycar.backLeftTire.location + "바퀴가 고장났습니다.-------");
			mycar.backLeftTire = new KumhoTire (13, mycar.backLeftTire.location);
			System.out.println(mycar.backLeftTire.location + "바퀴를 새 바퀴로 갈았습니다.");
			break;
			
			case 4 : System.out.println("-------"+mycar.backRightTire.location + "바퀴가 고장났습니다.-------");
			mycar.backRightTire = new KumhoTire (15, mycar.backRightTire.location);
			System.out.println(mycar.backRightTire.location + "바퀴를 새 바퀴로 갈았습니다.");
			break;	
			
			case 0 : System.out.println("------------자동차가 움직입니다.-------------");
			}
			
			
		}	
		
	}
}
