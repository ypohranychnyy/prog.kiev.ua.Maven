import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by user25 on 10/12/2015.
 */
//public class TestRunner {
//    WebDriver driver;
//    String address = "http://rozetka.com.ua/";
//
//
//    @Before
//    public  void beforeTest(){
//        System.out.println("Creating chrome driver instance");
//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
//    }
//    @After
//    public  void afterTest(){
//        driver.quit();
//    }
//
//    @Test
//    public  void myTest(){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.get(address);
//        RozetkaMainPage mainPage = new RozetkaMainPage(driver);
////        mainPage.loginLink.click();
////
////        loginLink.click();
////        try {
////            Thread.sleep(1000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        WebElement userNameInput = driver.findElement(By.xpath("//*[@id=\"user-popup-parent53570\"]/div/div/div/form/div[1]/div[2]/input"));
//        userNameInput.sendKeys("javaqa01");
//        WebElement userPasswordInput = driver.findElement(By.xpath("//*[@id=\"user-popup-parent53570\"]/div/div/div/form/div[1]/div[3]/div[1]/div[1]/input"));
//        WebElement loginSubmit = driver.findElement(By.xpath("//*[@id=\"user-popup-parent53570\"]/div/div/div/form/div[1]/div[3]/div[1]/div[2]/div/span/button"));
//
//
//    }
//}
public class TestRunner {
    WebDriver driver;
    String address = "http://rozetka.com.ua/";
    String login;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        WebElement account = driver.findElement(By.className("sprite-side"));
        account.click();
        WebElement logout = driver.findElement(By.className("profile-m-edit-signout"));
        logout.click();

        driver.quit();
    }

    @Test
    public void rozetkaTest() throws InterruptedException {
        driver.get(address);
        WebElement loginLink = driver.findElement(By.xpath("//*[@name=\"signin\"]"));
        loginLink.click();
        Thread.sleep(500);

        WebElement login = driver.findElement(By.xpath("//*[@name=\"login\"]"));
        Thread.sleep(500);
        login.sendKeys("ole4kakarnaukh@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
        Thread.sleep(500);
        password.sendKeys("javaqa01");

        WebElement enterButton = driver.findElement(By.xpath("//*[@name=\"auth_submit\"]"));
        enterButton.click();
        Thread.sleep(2500);

        WebElement popup = driver.findElement(By.className("social-bind-tiny-close"));
        popup.click();

        WebElement userName = driver.findElement(By.xpath("//*[@name=\"profile\"]"));
        String profileName = userName.getText();

        Assert.assertTrue("Olga".equals(profileName));

    }
}
