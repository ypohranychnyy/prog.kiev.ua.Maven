import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user25 on 10/12/2015.
 */
public class RozetkaMainPage {
    public WebDriver driver;

    @FindBy(name = "signin")
    private WebElement loginLink;

    public RozetkaMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
