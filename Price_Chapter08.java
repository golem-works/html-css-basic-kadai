package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
		
		
		int[] serviceCost = {1000,2000, 3000,4000,5000};
		int defaultCost = 500;
		int age = 30;
		int cost = defaultCost;
		
		
		switch(age) {
		
		case 10:
			cost = serviceCost[0]; 
		break;
		case 20:
			cost = serviceCost[1];
			break;
		case 30:
			cost = serviceCost[2];
			break;
		case 40:
			cost = serviceCost[2];
			break;
		case 50:
			cost = serviceCost[3];
			break;
		case 60: 
			cost = serviceCost[3];
			break;
		case 70:
			cost = serviceCost[3];
			break;
		case 80:
			cost = serviceCost[4];
			break;
		default :
			cost = defaultCost;
			break;
	}
	
	System.out.println(age + "代の料金は" + cost + "円");
	}
}
