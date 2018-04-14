import java.util.Scanner;
/*
 * 
 * @author kemalkarabag
 * 
 * kullan�c�n�n girdi�i e-posta adresinin uygunlu�unu kontrol eden ve do�ru giri�i al�ncaya kadar isteyen java kodu
 * 
 */
public class ePostaKontrolUyg {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		while (true) {
			System.out.print("E-posta adresiniz giriniz : ");
			String ePosta = giris.next();
			
			// E-posta adresinde (@ . c) karakterleri yoksa ge�ersiz say�l�yor ve tekrar giri� isteniyor.
			if ((ePosta.indexOf("@") == -1) || ePosta.indexOf(".") == -1 || (ePosta.indexOf("c") == -1)) {
				System.out.println("Hatal� giri� yapt�n�z !");
			} else {
				System.out.println("GE�ERL�");
				break;
			}
		}
		giris.close();
	}
}
