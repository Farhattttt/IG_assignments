package com.insightglobal.day4;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    
    static List<Product> plist = new ArrayList<>();
    
   
    public String addProduct(Product p) {
        plist.add(p);
        return "Product added successfully";
    }
    
  
    public int deleteProduct(Integer id) {
        Product productToDelete = null;
        for (Product p : plist) {
            if (p.id.equals(id)) {
                productToDelete = p;
                break;
            }
        }
        
        if (productToDelete != null) {
            plist.remove(productToDelete);
            return 1; 
        }
        return 0;
    }
    
    
    public int updateProduct(Integer id, String newName) {
        for (Product p : plist) {
            if (p.id.equals(id)) {
                p.name = newName;
                return 1; 
            }
        }
        return 0;
    }
    
   
    public void listProducts() {
        if (plist.isEmpty()) {
            System.out.println("No products available.");
        } else {
            plist.forEach(x -> System.out.println(x));
        }
    }
    
   
    public Product getProduct(Integer id) {
        for (Product p : plist) {
            if (p.id.equals(id)) {
                return p;
            }
        }
        return null; 
    }
}
