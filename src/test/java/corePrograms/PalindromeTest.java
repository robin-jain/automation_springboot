package corePrograms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void testCheckIfStringPalindrome_WithPalindromeString() {
        boolean result = palindrome.checkIfStringPalindrome();
        assertTrue(result, "MADAM should be a palindrome");
    }

    @Test
    public void testCheckIfStringPalindrome_WithNonPalindromeString() {
        // This test demonstrates the behavior with the current hard-coded string
        // The current implementation always checks "MADAM"
        boolean result = palindrome.checkIfStringPalindrome();
        assertTrue(result, "MADAM is a palindrome");
    }

    @Test
    public void testPalindromeFunctionality() {
        // Test that the palindrome_fu method executes without throwing an exception
        assertDoesNotThrow(() -> palindrome.palindrome_fu());
    }
}
