package Scenarios;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class FruitAndVegMenuElements {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public FruitAndVegMenuElements(WebDriver webDriver) {
        driver = webDriver;
        js = (JavascriptExecutor) driver;

    }

    public static void FruitAndVegMenuKG(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('KG')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



//.VegMenu
    public static void pointVegMenu(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('.Veg')\").parent().click()\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuARTICHOKE() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ARTICHOKE')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuASPARAGUS() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ASPARAGUS')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBASIL() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BASIL')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBeansRed() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Beans Red')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBROCCOLIROMANESCO() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BROCCOLI ROMANESCO')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBEANSBOBBY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BEANS BOBBY')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static void pointVegMenuAUBERGINETURKISH() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('AUBERGINE TURKISH')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBROCCOLI() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BROCCOLI')\").filter(function(){ return $(this).text() == 'BROCCOLI'; }).parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuButternut() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Butternut')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



//.FruitMenu
    public static void pointFruitMenu(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('.Fruit')\").parent().click()\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuAVOCADO() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('AVOCADO')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }







}