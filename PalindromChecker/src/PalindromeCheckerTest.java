import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sisense on 9/30/15.
 */
public class PalindromeCheckerTest {
    PalindromeChecker testObject;

    @Before
    public void setup() {
        testObject = new PalindromeChecker();
    }


    @Test
    public void checkObject() {

        Assert.assertNotNull(testObject);

    }

    @Test
    public void checkIsPalindrome() {

        Assert.assertTrue(testObject.isPalindrome("mom"));

    }

    @Test
    public void checkIsNotPalindrome() {

        Assert.assertFalse(testObject.isPalindrome("testing"));

    }

    @Test
    public void checkIsNotPalindrome2() {

        Assert.assertFalse(testObject.isPalindrome("2gbdbdfb"));

    }

}
