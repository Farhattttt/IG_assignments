package com.insight.StreamsTask;

import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class ProductService {
   private List<Product> products;
   
   public ProductService(List<Product> products) {
	   this.products=products;
   }
   
   public Product getHighestPricedProduct() {
	   return products.stream().max(Comparator.comparing(Product::getPrice)).orElse(null);
   }
   
   public Product getLowestPricedProduct() {
       return products.stream()
               .min(Comparator.comparing(Product::getPrice))
               .orElse(null);
   }
   
   public List<Product> getExpiredProducts() {
       LocalDate currentDate = LocalDate.now();
       return products.stream()
               .filter(product -> product.getExpiryDate().isBefore(currentDate))
               .collect(Collectors.toList());
   }
   
   public List<String> getProductsExpiringInNext10Days() {
       LocalDate currentDate = LocalDate.now();
       LocalDate tenDaysFromNow = currentDate.plusDays(10);

       return products.stream()
               .filter(product -> !product.getExpiryDate().isBefore(currentDate) && product.getExpiryDate().isBefore(tenDaysFromNow))
               .map(Product::getName)
               .collect(Collectors.toList());
   }
   
   public Map<String, Long> getCountOfProductsByType() {
       return products.stream()
               .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
   }
}
