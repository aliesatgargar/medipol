import java.math.*;
import java.util.*;

public class Hesaplama {
	
	public static String topla(String sayi1, String sayi2) {
		try {
			BigDecimal bigDecimal1 = new BigDecimal(sayi1);
			BigDecimal bigDecimal2 = new BigDecimal(sayi2);
			return bigDecimal1
					.add(bigDecimal2)
					.toPlainString();
		} catch(Exception e) {
			return "undefined";
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner konsolOku = new Scanner(System.in);
		
		System.out.print("Sayi 1 giriniz: ");
		String sayi1 = konsolOku.nextLine();
		System.out.print("Sayi 2 giriniz: ");
		String sayi2 = konsolOku.nextLine();
		
		String sonuc = Hesaplama.topla(sayi1, sayi2);
				
		System.out.printf("%s + %s = %s", sayi1, sayi2, sonuc);

	}

}
