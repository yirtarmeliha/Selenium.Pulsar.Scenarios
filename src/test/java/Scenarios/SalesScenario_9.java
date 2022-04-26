package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario_9 extends OpenPage{


    @DisplayName("Scenario 9")
    @Test
    void ScenarioNine() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenu();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuALMONDFRESH1kg();
        Elements.fiveScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuBLACKBERRY();

        Elements.twoScreen().click();
        Elements.sevenScreen().click();
        Elements.xScreen().click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        FruitAndVegMenuElements.pointFruitMenuAPPLECHINESE();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        FruitAndVegMenuElements.pointFruitMenuCDEFG();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.threeScreen().click();
        Elements.xScreen().click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        FruitAndVegMenuElements.pointFruitMenuCOCONUT();
        FruitAndVegMenuElements.pointFruitMenuABC();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuCherrySour();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.sixPopUp().click();
        Elements.ninePopUp().click();
        Elements.threePopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("6930", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Cherry Sour 1\n" +
                "\t\t\t\t\t\t\t\t\t\tkg@£4.00", Elements.thirdItemInBasket().getAttribute("innerHTML"));

        assertEquals("37", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£170.99", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        FruitAndVegMenuElements.pointFruitMenuPQRSTW();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        FruitAndVegMenuElements.pointFruitMenuPLUMPRESIDENT();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.eightPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("800", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        Elements.ninePopUp().click();
        assertEquals("809", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuStrawberry250gr();
        FruitAndVegMenuElements.pointFruitMenuGHKLM();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuLimePack();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.pointVegAndFruitMenuOK().click();

        assertEquals("40", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£231.60", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        Elements.productScreenFour().click();

        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        Elements.voidLine().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("37", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£171.60", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.twoScreen().click();
        Elements.fiveScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountPercent().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£42.90", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£128.70", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash50Screen().click();

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash50Screen().click();

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash20Screen().click();

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash10Screen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();



    }
}
