package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario_6 extends OpenPage{

    @DisplayName("Scenario 6")
    @Test
    void ScenarioSix() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.twoPopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.threePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.twoPopUp(), Elements.threePopUp(),
                Elements.fourPopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.fivePopUp().click();
        Elements.twoPopUp().click();
        Elements.onePopUp().click();
        assertEquals("3521", Elements.keypadModalClass().getAttribute("value"));

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

        Elements.fourScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.onePopUp().click();
        Elements.sevenPopUp().click();
        Elements.threePopUp().click();
        assertEquals("173", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.ninePopUp().click();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("1739", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("5", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£104.77", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.onePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("16", Elements.keypadModalClass().getAttribute("value"));

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

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sevenPopUp().click();
        assertEquals("7", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.eightPopUp().click();
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("8400", Elements.keypadModalClass().getAttribute("value"));

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

        assertEquals("7", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£188.37", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.functions().click();
        Elements.fourScreen().click();
        Elements.sevenScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountAmount().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.productScreenFive().click();
        Elements.cancelDiscount().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.fiveScreen().click();
        Elements.sevenScreen().click();
        Elements.eightScreen().click();
        Elements.zeroScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountAmount().click();


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        assertEquals("7", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£57.80", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£130.57", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.productScreenTwo().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.voidScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("6", Elements.basketItemCountTD().getAttribute("innerHTML"));

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

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.threePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointVegMenu();
        FruitAndVegMenuElements.pointVegMenuBeansRed();

        Elements.eightScreen().click();
        Elements.twoScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FruitAndVegMenuElements.pointVegMenuASPARAGUS();
        Elements.Cscreen().click();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("83", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£17.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.functions().click();
        Elements.oneScreen().click();
        Elements.fiveScreen().click();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountPercent().click();
        Elements.functions().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£2.55", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£14.45", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.cash20Screen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();







    }
}
