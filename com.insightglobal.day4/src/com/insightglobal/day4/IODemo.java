package com.insightglobal.day4;


import java.io.IOException;

public class IODemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ItemService itemService = new ItemService();

        String filePath = "C:\\Users\\FarhattasnimLaskar\\OneDrive - Insight Global, LLC\\Desktop\\Java\\item.txt";
        
        try {
            // Load items from file
            itemService.loadItemsFromFile(filePath);

            Integer itemIdForPrice = 10; 
            Double price = itemService.getPriceById(itemIdForPrice);
            if (price != null) {
                System.out.println("Price of item with ID " + itemIdForPrice + " is " + price);
            } else {
                System.out.println("Item with ID " + itemIdForPrice + " not found.");
            }

            Integer itemIdForDetails = 2; 
            Item item = itemService.getItemById(itemIdForDetails);
            if (item != null) {
                System.out.println("Item details: " + item);
            } else {
                System.out.println("Item with ID " + itemIdForDetails + " not found.");
            }

            System.out.println("All Items:");
            for (Item i : itemService.listItems()) {
                System.out.println(i);
            }

        } catch (IOException e) {
            // Handle the IOException here
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}



