package iftest;

public class IfTest04 {

	public static void main(String[] args) {
		// �ֻ��� ������
		//double dice_Number = Math.random() 0.0~0.999
		//double dice_Number = Math.random() * 6
		int dice_Number = (int)(Math.random() * 6) +1;
		Math.random(); // 0�̻� ~ 1�̸� ������ �Ǽ�
		
	   if(dice_Number==1) {
		System.out.println("1���� ���Խ��ϴ�");
	   }else if(dice_Number == 2) {
		System.out.println("2���� ���Խ��ϴ�");
	   }else if(dice_Number == 3) {
		System.out.println("3���� ���Խ��ϴ�");
	   }else if(dice_Number == 4) {
		System.out.println("4���� ���Խ��ϴ�");
	   }else if(dice_Number == 5) {
		System.out.println("5���� ���Խ��ϴ�");
	   }else if(dice_Number == 6) {
		System.out.println("6���� ���Խ��ϴ�");
	   }

	}

}
