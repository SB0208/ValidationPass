package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationPassTest {

    @Test
    void smallerThanSevenShouldReturnTooSmall() {
        assertTrue(ValidationPass.smallerThanSeven("Saft"));

    }

    @Test
    void biggerThanSevenShouldReturnTrue() {
        assertFalse(ValidationPass.smallerThanSeven("Wassermelone"));
    }

    @Test
    void equalsShouldReturnmissingDiggit() {
        assertFalse(ValidationPass.smallerThanSeven("AAAAAAAA"));

    }

    @Test
    void hasDigitShouldReturnTrue() {
        assertTrue(ValidationPass.hasDigit("AAAAAAA1A"));
    }


    @Test
    void hasDigitShouldReturnFalse() {
        assertFalse(ValidationPass.hasDigit("AAAAAAAA"));
    }

    @Test
    void hasUpperCaseShouldReturnTrue() {
        assertTrue(ValidationPass.hasUpperCase("Aaaaa"));
    }

    @Test
    void hasUpperCaseShouldReturnFalse() {
        assertFalse(ValidationPass.hasUpperCase("aaaaa"));
    }

    @Test
    void hasLowerCaseShouldReturnTrue() {
        assertTrue(ValidationPass.hasLowerCase("Aa"));
    }

    @Test
    void hasLowerCaseShouldReturnFalse() {
        assertFalse(ValidationPass.hasLowerCase("A"));
    }

    @Test
    void safePassShouldReturnTrue() {
        assertTrue(ValidationPass.safePass("AAAAAAAA"));
    }

    @Test
    void safePassShouldReturnFalse() {
        assertFalse(ValidationPass.safePass("1234aA"));
    }

    @Test
    void checkPassShouldReturnTrue() {
        assertTrue(ValidationPass.checkPass("Tomate12"));
    }

    @Test
    void checkPassShouldReturnFalse() {
        assertFalse(ValidationPass.checkPass("tomate"));
    }

}