package kadai_08;

public class Price_Chapter08 {
	public static void main(String[] args) {
	
	int userAge = 30;
	int[] serviceCost = {1000,2000,3000,4000,5000,6000,7000,8000};
	
	
	String cost = switch(userAge) {
		case 10 -> serviceCost[0] + "円";
		case 20 -> serviceCost[1] + "円";
		case 30 -> serviceCost[2] + "円";
		case 40 -> serviceCost[3] + "円";
		case 50 -> serviceCost[4] + "円";
		case 60 -> serviceCost[5] + "円";
		case 70 -> serviceCost[6] + "円";
		case 80 -> serviceCost[7] + "円";
		default -> "別料金です";
	};
	System.out.println(userAge + "代の料金は" + cost +"です");
	}
}
