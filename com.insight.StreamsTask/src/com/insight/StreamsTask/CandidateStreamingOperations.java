package com.insight.StreamsTask;

import java.util.*;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

    
    public static void main(String[] args) {
        
        
        List<Candidate> candidates = InterviewRepository.getCandidateList();

  
        System.out.println("List of Pune Candidates:");
        candidates.stream()
                .filter(candidate -> candidate.getCity().equals("Pune"))
                .map(Candidate::getName)
                .forEach(System.out::println);
        
        printLine();

        
        System.out.println("Candidate count per city:"); 
        Map<String, Long> cityCount = candidates.stream()
                .collect(Collectors.groupingBy(Candidate::getCity, Collectors.counting()));
        cityCount.forEach((city, count) -> System.out.println(city + ": " + count));
        
        printLine();

       
        System.out.println("Candidate count by Technical Expertise:");
        Map<String, Long> expertiseCount = candidates.stream()
                .collect(Collectors.groupingBy(Candidate::getTechnicalExpertise, Collectors.counting()));
        expertiseCount.forEach((expertise, count) -> System.out.println(expertise + ": " + count));
        
        printLine();

      
        System.out.println("Fresher Candidate list:");
        candidates.stream()
                .filter(candidate -> candidate.getExperience() == 0)
                .map(Candidate::getName)
                .forEach(System.out::println);
        
        printLine();

        
        System.out.println("Sorted List of Candidates by Experience:");
        candidates.stream()
                .sorted(Comparator.comparingInt(Candidate::getExperience).reversed())
                .forEach(candidate -> System.out.println(candidate.getName() + " - " + candidate.getExperience() + " years"));
        
        printLine();

     
        System.out.println("Sorted List of Candidates by City Name:");
        candidates.stream()
                .sorted(Comparator.comparing(Candidate::getCity))
                .forEach(candidate -> System.out.println(candidate.getName() + " - " + candidate.getCity()));
    }

    private static void printLine() {
        System.out.println("======================================================");
    }
}
