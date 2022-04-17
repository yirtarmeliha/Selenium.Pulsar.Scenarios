package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;



@DisplayName("Sales Scenario")
public class SalesScenario_5 extends OpenPage{



    @DisplayName("Scenario 5")
    @Test
    void ScenarioFive(){

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        FruitAndVegMenuElements.pointVegMenu();
        FruitAndVegMenuElements.pointVegMenuBROCCOLI();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.zeroPopUp().click();
        Elements.sevenPopUp().click();
        assertEquals("30007", Elements.keypadModalClass().getAttribute("value"));
        Elements.fivePopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        Elements.backPopUp().click();
        assertEquals("3000", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£27.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.Cscreen().click();
        FruitAndVegMenuElements.FruitAndVegMenuKG();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.ninePopUp().click();
        Elements.eightPopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.twoPopUp().click();
        assertEquals("98002", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("9800", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fourPopUp().click();
        Elements.fivePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("4500", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£468.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        FruitAndVegMenuElements.pointFruitMenu();
        FruitAndVegMenuElements.pointFruitMenuBanana1kg();

        assertEquals("3", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£477.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.sevenScreen().click();
        Elements.threeScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuBanana1kg();
        Elements.pointVegAndFruitMenuOK().click();

        assertEquals("76", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£1,134.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        Elements.productScreenTwo().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.voidLine().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        assertEquals("£693.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));
        Elements.twoScreen().click();
        Elements.doubleZeroScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.onePopUp().click();
        Elements.zeroPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("1000", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("275", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£2,693.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        Elements.voidLine().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        assertEquals("75", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£693.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.twoScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.zeroPopUp().click();
        Elements.fivePopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("2050", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        FruitAndVegMenuElements.pointVegMenu();
        FruitAndVegMenuElements.pointVegMenuCAPSLONGRED();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sixPopUp().click();
        Elements.onePopUp().click();
        Elements.ninePopUp().click();
        Elements.sevenPopUp().click();
        assertEquals("6197", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));
        Elements.Cscreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("96", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£1,152.58", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.functions().click();
        Elements.fiveScreen().click();
        Elements.zeroScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountPercent().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        assertEquals("£576.29", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£576.29", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"));
        Elements.StartcardtransactionNo().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cashScreen().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();






    }
}
