package Scenarios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.function.Function;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenPage {


    protected WebDriver driver;
    Elements page;
    PointVegMenuElements vegElement;

    @BeforeAll
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://pulsar.tills4u.com:4441/pulsar/dispatcher/pagenavi#/");
        driver.manage().window().maximize();
        page = new Elements(driver);
        vegElement = new PointVegMenuElements(driver);
        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

    }


    protected void initJquery(){
        if(!(Boolean) PointVegMenuElements.js.executeScript("return (typeof jQuery != \"undefined\")")) {
            PointVegMenuElements.js.executeScript(
                    "var headID = document.getElementsByTagName('head')[0];" +
                            "var newScript = document.createElement('script');" +
                            "newScript.type = 'text/javascript';" +
                            "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';" +
                            "headID.appendChild(newScript);");
            WebDriverWait waitJQ = new WebDriverWait(driver, 300);
            Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> (
                    (Boolean) PointVegMenuElements.js.executeScript("return (typeof jQuery != \"undefined\")")
            );
            waitJQ.until(jQueryAvailable);

        }
    }
}

