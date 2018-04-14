/*
 * 
 * @author kemalkarabag
 * 
 * 1 den 10 a kadar olan sayýlarýn çarpým tablosunu oluþturan java kodu 
 * 
 */
package deneme;

public class carpimTablosu {
	public static void main(String[] args) {
		int sonuc;
		sonuc = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				sonuc = i * j;
				System.out.print(i + "*" + j + "=" + sonuc +"\t");
			}
			System.out.println("");
		}
	}

}
