package kadai_08;

public class Price_Chapter08 {
	public static void main(String[] args) {
		
		int[] userAge = {10,20,30,40,50,60,70,80};
		int[] serviceCost = {1000,2000,3000,4000,5000,6000,7000,8000};
		int age = 30;
		int order = 500;
		
		switch(age){
		case 10 :
			order = serviceCost[0];
			break;
		case 20 :
			order = serviceCost[1];
			break;
		case 30 :
			order = serviceCost[2];
			break;
		case 40 :
			order = serviceCost[3];
			break;
		case 50 :
			order = serviceCost[4];
			break;
		case 60 :
			order = serviceCost[5];
			break;
		case 70 :
			order = serviceCost[6];
			break;
		case 80 :
			order = serviceCost[7];
			break;
		default :
			order = 500;
			break;
			}
				System.out.println(age + "代の料金は" + order +"です");
		
	}
}
