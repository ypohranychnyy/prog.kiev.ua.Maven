/**
 * Created by sisense on 9/30/15.
 */
public class PalindromeChecker {
    public boolean isPalindrome(String string) {
        StringBuffer reversedStringBuffer = new StringBuffer(string);
        reversedStringBuffer.reverse();


        if (string.equalsIgnoreCase(reversedStringBuffer.toString()))
            return true;
        return false;
    }
}
