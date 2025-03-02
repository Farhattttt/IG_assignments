package com.insight.StreamsTask;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class AuthorTest {

    public static void main(String[] args) {
        
        Author author1 = new Author(123456789L, "Smith", "John", "Doe", LocalDate.of(1990, 1, 15), "Male", "New York", 9876543210L);
        Author author2 = new Author(987654321L, "Johnson", "Emma", "Lee", LocalDate.of(1985, 5, 20), "Female", "Los Angeles", 1234567890L);
        Author author3 = new Author(111223344L, "Williams", "Olivia", "Brown", LocalDate.of(1992, 3, 25), "Female", "New York", 1122334455L);
        Author author4 = new Author(556677889L, "Davis", "Michael", "Clark", LocalDate.of(1980, 7, 30), "Male", "Chicago", 9988776655L);

        List<Author> authorList = Arrays.asList(author1, author2, author3, author4);

        try {
            AuthorService authorService = new AuthorServiceImpl();

            
            Set<String> uniqueSurnames = authorService.getUniqueSurnames(authorList);
            System.out.println("Unique Surnames in Uppercase: " + uniqueSurnames);

       
            List<Author> authorsFromNewYork = authorService.getAuthorsByCity(authorList, "New York");
            System.out.println("Authors from New York: " + authorsFromNewYork);

         
            double femaleAverageAge = authorService.femaleAverageAge(authorList);
            System.out.println("Female Average Age: " + femaleAverageAge);

          
            Long mobileByAdhar = authorService.getMobileByAdhar(authorList, 987654321L);
            System.out.println("Mobile Number for Aadhar 987654321: " + mobileByAdhar);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
