
public class Functions {

	public void main(String[] args) {
		
		
		System.out.println(topla(14, 12));
		System.out.println(uprageTopla(14, 12, 2, 35, 12, 3));

	}

	public  void mesaj() {

		String mesaj = "Are you ready!";
		System.out.println(mesaj.substring(0, 4));
		// substrig mesaj kesici olarak kullanılmaktadır
	}

	public  int topla(int sayi1, int sayi2) {
		// sadece 2 tane değişken verebiliyoruz bu şekilde
		return sayi1 + sayi2;
	}

	public  int uprageTopla(int... sayilar) {

		int toplam = 0;
		for (int sayi : sayilar) {

			toplam += sayi;
		}
		return toplam;
	}

}
