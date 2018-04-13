import java.util.Scanner;

/*
 * 
 * @author kemalkarabag
 * 
 * Kullanýcýnýn belirlediði n kadar girilen sayýnýn en küçüðünü ve en büyüðünü - ilk ve son sayýyý ekrana basan program  
 */
public class uyg10 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Kaç tane sayý girmek istiyorsunuz : ");

		int n = giris.nextInt();
		int sayilar[] = new int[n]; // yapýlan giriþ kadar sayý tutacak dizi oluþturuyoruz.

		for (int i = 0; i < n; i++) { // girilen n sayýsý kadar sayý giriþini diziye dolduruyoruz.
			System.out.print("Sayý giriniz : ");
			sayilar[i] = giris.nextInt();
		}

		for (int i = 0; i < n; i++) { // diziyi ekrana basýyoruz
			System.out.println("Dizinin " + (i + 1) + ".elemaný : " + sayilar[i]);
		}
		
		System.out.println("Dizinin ilk elemaný : " + sayilar[0]);
		System.out.println("Dizinin son elemaný : "+ sayilar[n-1]);

		giris.close();
	}
}
