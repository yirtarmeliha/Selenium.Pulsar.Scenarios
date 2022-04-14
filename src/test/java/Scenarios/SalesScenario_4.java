package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario_4 extends OpenPage {


    @DisplayName("Scenario 4")
    @Test
    void ScenarioFour() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointVegMenu();
        Elements.sevenScreen().click();
        Elements.doubleZeroScreen().click();
        Elements.xScreen().click();
        FruitAndVegMenuElements.pointVegMenuBASIL();
        assertEquals("700", Elements.basketItemCountTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointVegMenuButternut();
        assertEquals("block", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.twoPopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("2000", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.modal().getCssValue("display"));

        assertEquals("701", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£31.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.pointVegAndFruitMenuOK().click();
        Elements.sixScreen().click();
        Elements.zeroScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        FruitAndVegMenuElements.FruitAndVegMenuKG();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.zeroPopUp().click();
        Elements.onePopUp().click();
        assertEquals("30001", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        assertEquals("3000", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.modal().getCssValue("display"));
        Elements.sixScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("400", Elements.keypadModalClass().getAttribute("value"));

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

        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£272.80", Elements.basketSubtotalTD().getAttribute("innerHTML"));
        assertEquals("762", Elements.basketItemCountTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.twoScreen().click();
        Elements.zeroScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();

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

        assertEquals("£6.56", Elements.basketDiscountTD().getAttribute("innerHTML"));

        Elements.productScreenFive().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cancelDiscount().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));

        Elements.nineScreen().click();
        Elements.fourScreen().click();
        Elements.doubleZeroScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountAmount().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£94.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£178.80", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.fiveScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sevenPopUp().click();
        Elements.threePopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("730", Elements.keypadModalClass().getAttribute("value"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        assertEquals("none", Elements.modal().getCssValue("display"));


        Elements.Cscreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.ninePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("900", Elements.keypadModalClass().getAttribute("value"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        assertEquals("none", Elements.modal().getCssValue("display"));


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£224.30", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.productScreenFive().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.voidLine().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£187.80", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        FruitAndVegMenuElements.pointFruitMenu();
        Elements.twoScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointFruitMenuAVOCADO();
        Elements.pointVegAndFruitMenuOK().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£94.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£347.80", Elements.basketSubtotalTD().getAttribute("innerHTML"));
        assertEquals("783", Elements.basketItemCountTD().getAttribute("innerHTML"));

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

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"));
        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();







    }
}