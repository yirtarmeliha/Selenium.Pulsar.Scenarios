package Scenarios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenPage {


    protected WebDriver driver;
    Elements page;


    @BeforeAll
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://pulsar.tills4u.com:4441/pulsar/dispatcher/pagenavi#/");
        driver.manage().window().maximize();
        page = new Elements(driver);
        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

    }
}

