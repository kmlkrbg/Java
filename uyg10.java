import java.util.Scanner;

/*
 * 
 * @author kemalkarabag
 * 
 * Kullan�c�n�n belirledi�i n kadar girilen say�n�n en k�����n� ve en b�y���n� - ilk ve son say�y� ekrana basan program  
 */
public class uyg10 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Ka� tane say� girmek istiyorsunuz : ");

		int n = giris.nextInt();
		int sayilar[] = new int[n]; // yap�lan giri� kadar say� tutacak dizi olu�turuyoruz.

		for (int i = 0; i < n; i++) { // girilen n say�s� kadar say� giri�ini diziye dolduruyoruz.
			System.out.print("Say� giriniz : ");
			sayilar[i] = giris.nextInt();
		}

		for (int i = 0; i < n; i++) { // diziyi ekrana bas�yoruz
			System.out.println("Dizinin " + (i + 1) + ".eleman� : " + sayilar[i]);
		}
		
		System.out.println("Dizinin ilk eleman� : " + sayilar[0]);
		System.out.println("Dizinin son eleman� : "+ sayilar[n-1]);

		giris.close();
	}
}
