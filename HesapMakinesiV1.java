import java.util.Scanner;
/*
 * 
 * @author kemalkarabag
 * 
 * switch case ve fonksiyonlar kullan�larak basit bir hesap makinesinin java kodu 
 * 
 */
public class HesapMakinesiV1 {
	
	static int topla(int _s1,int _s2) {
		return _s1 + _s2;
	}
	
	static int cikar(int _s1,int _s2) {
		return _s1 - _s2;
	}
	
	static int carp(int _s1,int _s2) {
		return _s1*_s2;
	}
	
	static double bol(int _s1,int _s2) {
		return (double)_s1/_s2;
	}
	
	public static void main(String [] args) {
		int sayi1 , sayi2; 
		String islem ;
		Scanner giris = new Scanner(System.in);
		System.out.print("Say� 1 giriniz : ");
		sayi1 = giris.nextInt();
		System.out.print("Yapmak istedi�iniz i�lemi giriniz (+ , - , * , /): ");
		islem = giris.next();
		System.out.print("Say� 2 giriniz : ");
		sayi2 = giris.nextInt();
		
		switch(islem){
		case "+":
			System.out.println("SONU� : " + topla(sayi1,sayi2));
			break;
		case "-":
			System.out.println("SONU� : "+ cikar(sayi1,sayi2));
			break;
		case "/":
			System.out.println("SONU� : "+ bol(sayi1,sayi2));
			break;
		case "*":
			System.out.println("SONU� : "+ carp(sayi1,sayi2));
			break;
		default:
			System.out.println("Ge�ersiz bir i�lem girdiniz !");
			break;		
		}
		giris.close();
	}

}
