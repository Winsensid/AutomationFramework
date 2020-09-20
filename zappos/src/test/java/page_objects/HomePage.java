package page_objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage {

    WebDriver driver = null;

    @FindBy(how = How.CLASS_NAME, using = "w")
    WebElement womenSection;

    public void womenSection() {
        womenSection.click();

    }
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div[1]/header/div[3]/div/nav/ul/li[2]/a")
    WebElement menSection;

    public void menSection() {
        menSection.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id='editing-view-port']/div")
    WebElement searchField;

    public void SearchField() {
        searchField.sendKeys("Converse All star");
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div[1]/header/div[3]/div/div[2]/div/a")
    WebElement signInRegisterButton;

    public void setSignInRegisterButton(){
        signInRegisterButton.click();

    }
    public void getPageTitle(){
        String actualTitle = driver.getTitle();


    }
}

