package iftest;

public class IfTest04 {

	public static void main(String[] args) {
		// 주사위 굴리기
		//double dice_Number = Math.random() 0.0~0.999
		//double dice_Number = Math.random() * 6
		int dice_Number = (int)(Math.random() * 6) +1;
		Math.random(); // 0이상 ~ 1미만 임의의 실수
		
	   if(dice_Number==1) {
		System.out.println("1번이 나왔습니다");
	   }else if(dice_Number == 2) {
		System.out.println("2번이 나왔습니다");
	   }else if(dice_Number == 3) {
		System.out.println("3번이 나왔습니다");
	   }else if(dice_Number == 4) {
		System.out.println("4번이 나왔습니다");
	   }else if(dice_Number == 5) {
		System.out.println("5번이 나왔습니다");
	   }else if(dice_Number == 6) {
		System.out.println("6번이 나왔습니다");
	   }

	}

}
