package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayi= {1,2,3,4,5,6,7,8,9};
		
		int aranacakSayi=10;
		boolean varMı=false;
		for(int say: sayi) {
			if(say==aranacakSayi) {
				
				varMı=true;
				break;
			}
			
		}
		if(varMı) {
			System.out.println("Dogru buldunuz");		
			}
		else {
			System.out.println("Yanlis");
		}
	}
	

}
