package Scenarios;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class PointVegMenuElements {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public PointVegMenuElements(WebDriver webDriver) {
        driver = webDriver;
        js = (JavascriptExecutor) driver;

    }


    public static void pointVegMenuARTICHOKE() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ARTICHOKE')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuASPARAGUS() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ASPARAGUS')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBASIL() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BASIL')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBeansRed() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Beans Red')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBROCCOLIROMANESCO() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BROCCOLI ROMANESCO')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuP() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('P')\").parent().click()\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }
}