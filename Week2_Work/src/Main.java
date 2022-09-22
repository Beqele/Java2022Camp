import java.util.Scanner;  
public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello, I'm Berkay. I'm doing the second assignment of Java Camp ");
		System.out.println("Please select Project number: \n \n [1] Functions and  Class Works \n [2] Calculator \n [3] Product Management ");	
		Scanner scanner = new Scanner (System.in);
		int projectNumber = scanner.nextInt();
		
		
		
		if (projectNumber<4) {
			System.out.println("You selected project number"+"  "+projectNumber);
			}
		
		if (projectNumber==1) {
			
			ClassLecture exp= new ClassLecture();
			exp.main(args);
			
		}
		
		if (projectNumber==2) {
			
			Calc calc= new Calc();
			System.out.println("Enter number1: ");
			Scanner scanner1 = new Scanner (System.in);
			int number1 = scanner.nextInt();
			System.out.println("Enter number2: ");
			Scanner scanner2 = new Scanner (System.in);
			int number2 = scanner.nextInt();

			
			System.out.println(calc.add(number1,number2,number1+number2));
			System.out.println(calc.sub(number1,number2));
			System.out.println(calc.mult(number1,number2));

			
		}
		
		
		if (projectNumber==3) {
			
			Product product1 = new Product();
			product1.setName("Laptop");
			product1.setDescription(" MSI Gaming Laptop");
			product1.setId(24);
			product1.setPrice(12450);
			product1.setStockAmount(17);

			
			ProductManager productmanagement = new ProductManager();
			productmanagement.Add(product1);	
		}
			
		}
}

