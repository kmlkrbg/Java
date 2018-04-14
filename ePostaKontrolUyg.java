import java.util.Scanner;
/*
 * 
 * @author kemalkarabag
 * 
 * kullanýcýnýn girdiði e-posta adresinin uygunluðunu kontrol eden ve doðru giriþi alýncaya kadar isteyen java kodu
 * 
 */
public class ePostaKontrolUyg {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		while (true) {
			System.out.print("E-posta adresiniz giriniz : ");
			String ePosta = giris.next();
			
			// E-posta adresinde (@ . c) karakterleri yoksa geçersiz sayýlýyor ve tekrar giriþ isteniyor.
			if ((ePosta.indexOf("@") == -1) || ePosta.indexOf(".") == -1 || (ePosta.indexOf("c") == -1)) {
				System.out.println("Hatalý giriþ yaptýnýz !");
			} else {
				System.out.println("GEÇERLÝ");
				break;
			}
		}
		giris.close();
	}
}
