package com.insightglobal.day4;



import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Product");
            System.out.println("4. List Products");
            System.out.println("5. Get Product by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter Product ID: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    Product product = new Product(id, name);
                    System.out.println(ps.addProduct(product));
                    break;
                
                case 2: 
                    System.out.print("Enter Product ID to delete: ");
                    Integer deleteId = scanner.nextInt();
                    int deleteResult = ps.deleteProduct(deleteId);
                    if (deleteResult == 1) {
                        System.out.println("Product deleted successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter Product ID to update: ");
                    Integer updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new Product Name: ");
                    String newName = scanner.nextLine();
                    int updateResult = ps.updateProduct(updateId, newName);
                    if (updateResult == 1) {
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                
                case 4: 
                    System.out.println("Listing all products:");
                    ps.listProducts();
                    break;
                
                case 5:
                    System.out.print("Enter Product ID to get: ");
                    Integer getId = scanner.nextInt();
                    Product p = ps.getProduct(getId);
                    if (p != null) {
                        System.out.println("Product found: " + p);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

