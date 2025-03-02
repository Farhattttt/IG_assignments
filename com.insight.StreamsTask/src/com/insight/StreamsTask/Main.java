package com.insight.StreamsTask;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> productList = Arrays.asList(
	                new Product(1, "Milk", "Dairy", 100.0, 50.0, LocalDate.of(2025, 3, 1)),
	                new Product(2, "Rice", "Pulses", 200.0, 30.0, LocalDate.of(2025, 2, 15)),
	                new Product(3, "Salt", "Spices", 50.0, 10.0, LocalDate.of(2025, 1, 20)),
	                new Product(4, "Sunflower Oil", "Oils", 150.0, 100.0, LocalDate.of(2025, 3, 5)),
	                new Product(5, "Chips", "Snacks", 50.0, 20.0, LocalDate.of(2025, 2, 27))
	        );

	        ProductService productService = new ProductService(productList);

	        // Highest priced product
	        Product highestPriced = productService.getHighestPricedProduct();
	        System.out.println("Highest Priced Product: " + highestPriced);

	        // Lowest priced product
	        Product lowestPriced = productService.getLowestPricedProduct();
	        System.out.println("Lowest Priced Product: " + lowestPriced);

	        // Expired products
	        List<Product> expiredProducts = productService.getExpiredProducts();
	        System.out.println("Expired Products: " + expiredProducts);

	        // Products expiring in the next 10 days
	        List<String> expiringIn10Days = productService.getProductsExpiringInNext10Days();
	        System.out.println("Products Expiring in Next 10 Days: " + expiringIn10Days);

	        // Count of products by type
	        Map<String, Long> countByType = productService.getCountOfProductsByType();
	        System.out.println("Count of Products by Type: " + countByType);
	}

}
