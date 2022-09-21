import java.util.Scanner;  

public class Main {

	public static void main(String[] args) {
	System.out.println("Hello, I'm Berkay. I'm doing the first assignment of Java Camp \n");
	
	System.out.println("Please select Project number: \n \n [1] Is our number prime or not? \n [2] Vowels \n [3] Perfect Number ");
	
	Scanner scanner = new Scanner (System.in);
	int projectNumber = scanner.nextInt();
	
	System.out.println("\n \n \n \n"); 
	if (projectNumber<4) {
	System.out.println("You selected project number"+"  "+projectNumber);
	}
	if (projectNumber==1) {
		
		System.out.println("[1] Is our number prime or not?");
		System.out.println("Enter your number");
		Scanner scanner1 = new Scanner (System.in);
		int number = scanner.nextInt();
		
		if (number==1) {
			System.out.println("Your number is NOT prime");
			return;
			
		}
		
		boolean isPrime= true; 
		for(int i=2;i<number;i++) {
				if (number%i==0) {
					
					isPrime= false; ;
			
				} }
		
		if (isPrime) {
			System.out.println("Your number is prime");
			
		} else {
			System.out.println("Your number is NOT prime");

		}
		
	
	}
		
	
	
	else if(projectNumber==2){
		System.out.println("[2] Vowels \n");
		
		char vowels[]= {'a','e','i','ı','o','ö','u','ü'}; // ingilizcede ince kalın harf var mı ki ?
		Scanner scanner2 = new Scanner (System.in);
		char c = scanner2.next().charAt(0);
		boolean ısVowel= false;
		
		for(int i=0;i<6;i++) {
			
			if (c==vowels[i]) {
				
				ısVowel=true;
				
						
			} }
		
		if (ısVowel) {
			
			System.out.println("Sesli harflidir ve ");
			
			switch(c) {
			
				case'a':
				case'ı':
				case'u':
				case'o':
					
					System.out.println("Kalın sesli harflidir");
					break;
				default:
					System.out.println("İnce sesli harflidir");
			
			}
			
		}
		
		else {
			System.out.println("Sessiz harfdir");
			
		}
		
		}
		
		
		
		
		
		
	else if(projectNumber==3) {
		
		
		int toplam=0;        
        for(int sayi=1;sayi<100;sayi++){
            toplam=0;    
            for(int i=1;i<sayi;i++){
            int kalan=sayi%i;
            if(kalan==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+" i");
        }
	}
	
	}
	
	else {
		
		 System.out.println("Unfortunately I have just 3 projects. Please try again.");
	}
}}
