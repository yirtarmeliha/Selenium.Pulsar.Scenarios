package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario_7 extends OpenPage{

    @DisplayName("Scenario 7")
    @Test
    void ScenarioSeven() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.sevenScreen().click();
        Elements.xScreen().click();
        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fivePopUp().click();
        Elements.sixPopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("560", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(1000);
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

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.zeroPopUp().click();
        Elements.onePopUp().click();
        assertEquals("201", Elements.keypadModalClass().getAttribute("value"));

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
        Elements.ninePopUp().click();
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("9400", Elements.keypadModalClass().getAttribute("value"));

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
        Elements.onePopUp().click();
        Elements.onePopUp().click();
        Elements.fivePopUp().click();
        assertEquals("115", Elements.keypadModalClass().getAttribute("value"));

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

        FruitAndVegMenuElements.FruitAndVegMenuKG();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.eightPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("2800", Elements.keypadModalClass().getAttribute("value"));

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

        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.onePopUp().click();
        Elements.fivePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("1500", Elements.keypadModalClass().getAttribute("value"));

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

        assertEquals("10", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£464.20", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cashScreen().click();

        try {
            Thread.sleep(500);
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
        for (WebElement webElement : Arrays.asList(Elements.twoPopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("200", Elements.keypadModalClass().getAttribute("value"));

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

        Elements.cash5Screen().click();

        try {
            Thread.sleep(500);
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

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.eightPopUp().click();
        Elements.twoPopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("820", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash10Screen().click();

        try {
            Thread.sleep(2000);
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
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sevenPopUp().click();
        Elements.onePopUp().click();
        assertEquals("71", Elements.keypadModalClass().getAttribute("value"));

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

        Elements.cash1Screen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();












    }

}
