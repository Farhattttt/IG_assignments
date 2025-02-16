package com.insightglobal.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
	private List<Item> itemList = new ArrayList<>();

    
    public void loadItemsFromFile(String filePath) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = b.readLine()) != null) {
            String[] data = line.split(",");
            Integer id = Integer.parseInt(data[0].trim());
            String name = data[1].trim();
            Integer qty = Integer.parseInt(data[2].trim());
            Double price = Double.parseDouble(data[3].trim());

            Item item = new Item(id, name, qty, price);
            itemList.add(item);
        }
        b.close();
    }

    
    public Double getPriceById(Integer id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item.getPrice();
            }
        }
        return null; 
    }

   
    public Item getItemById(Integer id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null; 
    }

   
    public List<Item> listItems() {
        return itemList;
    }
}

