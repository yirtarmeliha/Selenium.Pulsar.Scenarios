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

    public static void pointVegMenuCAPSLONGRED() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('CAPS LONG RED')\").parent().click()\n");
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

    public static void pointFruitMenuALMONDFRESH1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ALMOND FRESH 1kg')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuBLACKBERRY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BLACKBERRY')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuCOCONUT() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('COCONUT')\").parent().click()");
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

    public static void pointFruitMenuBanana1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BANANA 1kg')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuORANGESMALL() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ORANGE SMALL')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuWATERMELON() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('WATERMELON  ')\").filter(function(){ return $(this).text() == 'WATERMELON  '; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuAPPLECHINESE() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('APPLE CHINESE')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuCherrySour() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Cherry Sour')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuPLUMPRESIDENT() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('PLUM PRESIDENT')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuStrawberry250gr() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Strawberry 250gr')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuLimePack() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Lime Pack')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }




//SAYFA DEĞİŞİM FRUİT MENU

    public static void pointFruitMenuABC() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'ABC\\')\").filter(function(){ return $(this).text() == 'ABC'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuCDEFG() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'CDEFG\\')\").filter(function(){ return $(this).text() == 'CDEFG'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuGHKLM() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'GHKLM\\')\").filter(function(){ return $(this).text() == 'GHKLM'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuMNOP() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'MNOP\\')\").filter(function(){ return $(this).text() == 'MNOP'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuPQRSTW() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'PQRSTW\\')\").filter(function(){ return $(this).text() == 'PQRSTW'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuWY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'WY\\')\").filter(function(){ return $(this).text() == 'WY'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }









}