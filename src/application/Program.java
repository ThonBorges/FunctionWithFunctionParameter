package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Samsung S23 FE", 2399.90));
		list.add(new Product("Samsung A35", 1499.90));
		list.add(new Product("Motorola G54", 1359.90));
		list.add(new Product("Motorola Edge 40", 1499.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		sc.close();
	}

}
