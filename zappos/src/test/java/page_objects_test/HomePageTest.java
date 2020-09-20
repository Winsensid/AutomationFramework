package page_objects_test;

import browserDrivers.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class HomePageTest extends BrowserDriver {

    HomePage homePage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test (enabled = false)
    public void searchFieldTest(){
        homePage.SearchField();
    }

    @Test
    public void womenSectionTest(){
        homePage.womenSection();
    }

    @Test
    public void menSectionTest(){
        homePage.menSection();
    }

    @Test
    public void signInRegisterButton(){
        homePage.setSignInRegisterButton();
        homePage.getPageTitle();
    }




}
