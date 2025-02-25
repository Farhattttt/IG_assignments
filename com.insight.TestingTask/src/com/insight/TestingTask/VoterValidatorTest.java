package com.insight.TestingTask;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {

    // Test for invalid age (less than 0)
    @Test
    public void testValidateVoterAgeForInvalidAge() {
        VoterValidator validator = new VoterValidator();
        
        // Using assertThrows to check if exception is thrown
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateVoterAge(-5); // Invalid age
        });
        
        // Verifying the exception message
        assertEquals("Invalid age", exception.getMessage());
    }
    
    // Parameterized Test for valid ages
    @ParameterizedTest
    @ValueSource(ints = {19, 20, 45, 78}) // Valid ages
    public void validateVoterAgeTestForValidAges(int age) throws Exception {
        VoterValidator validator = new VoterValidator();
        
        // Since these ages are >= 18, we expect validateVoterAge to return true
        assertTrue(validator.validateVoterAge(age));
    }

    // Parameterized Test for invalid ages (negative)
    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -100}) // Invalid ages (negative)
    public void validateVoterAgeTestForInvalidAges(int age) {
        VoterValidator validator = new VoterValidator();
        
        // Using assertThrows to check if exception is thrown
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateVoterAge(age); // Invalid age
        });
        
        // Verifying the exception message
        assertEquals("Invalid age", exception.getMessage());
    }
}
