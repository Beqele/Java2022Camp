
public class ClassLecture {

	public static void main(String[] args) {

		// reference type
		Functions functions = new Functions(); // classımızı tanımladık
		functions.main(args);// ordaki fonksiyonları çağırıyoruz

		System.out.println(functions.uprageTopla(3, 5, 1, 2));

		Functions functions2 = new Functions();
		functions2.main(args);

		System.out.println(functions2.uprageTopla(7, 5, 4, 2));

		// value

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		System.out.println(functions2.uprageTopla(sayi2, sayi1)); // 10+10=20 gelir

		// diziler referans tiplidir

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };

		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // referansı sayilar1 oldu ve 10 ile başlıyor
	}
}
