package com.insight.core;

import java.util.*;
import java.io.*;

public class CityStateMap extends AbstractCollection<Map.Entry<String, String>> {

   
    private Map<String, String> cityStateMap;

   
    public CityStateMap() {
        cityStateMap = new HashMap<>();
    }


    public boolean add(Map.Entry<String, String> cityStatePair) {
        cityStateMap.put(cityStatePair.getKey(), cityStatePair.getValue());
        return true;
    }

   
    public String get(String city) {
        return cityStateMap.get(city);
    }

   
    public Set<String> getAllCities() {
        return cityStateMap.keySet();
    }

   
    public Set<String> getAllStates() {
        return new HashSet<>(cityStateMap.values());
    }

  
    public Set<String> getCitiesForState(String state) {
        Set<String> citiesForState = new HashSet<>();
        for (Map.Entry<String, String> entry : cityStateMap.entrySet()) {
            if (entry.getValue().equals(state)) {
                citiesForState.add(entry.getKey());
            }
        }
        return citiesForState;
    }

 
    public void deleteCitiesForState(String state) {
        Iterator<Map.Entry<String, String>> iterator = cityStateMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(state)) {
                iterator.remove();
            }
        }
    }

    
    @Override
    public int size() {
        return cityStateMap.size();
    }

    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        return cityStateMap.entrySet().iterator();
    }

    public void readFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cityState = line.split(",");
                if (cityState.length == 2) {
                    add(new AbstractMap.SimpleEntry<>(cityState[0].trim(), cityState[1].trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        CityStateMap cityStateMap = new CityStateMap();

    
        System.out.println("How many city-state pairs do you want to add?");
        int numEntries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numEntries; i++) {
           
            System.out.println("Enter city " + (i + 1) + ":");
            String city = scanner.nextLine();
            System.out.println("Enter state for " + city + ":");
            String state = scanner.nextLine();

     
            cityStateMap.add(new AbstractMap.SimpleEntry<>(city, state));
        }

  
        System.out.println("\nAll Cities: " + cityStateMap.getAllCities());
        System.out.println("All States: " + cityStateMap.getAllStates());

       
        System.out.println("Enter a state to get its cities:");
        String stateQuery = scanner.nextLine();
        System.out.println("Cities for State '" + stateQuery + "': " + cityStateMap.getCitiesForState(stateQuery));

     
        System.out.println("\nEnter new city to add:");
        String newCity = scanner.nextLine();
        System.out.println("Enter state for the new city:");
        String newState = scanner.nextLine();
        cityStateMap.add(new AbstractMap.SimpleEntry<>(newCity, newState));

       
        System.out.println("\nEnter a state to delete all its cities:");
        String deleteState = scanner.nextLine();
        cityStateMap.deleteCitiesForState(deleteState);
        System.out.println("After deleting cities for state '" + deleteState + "', All Cities: " + cityStateMap.getAllCities());
    }
}

