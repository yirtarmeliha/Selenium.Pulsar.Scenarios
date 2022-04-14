package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



@DisplayName("Sales Scenario")
public class SalesScenario_2 extends OpenPage {


    @DisplayName("Scenario 2")
    @Test
    void ScenarioTwo() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.eightScreen().click();
        Elements.xScreen().click();
        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sevenPopUp().click();
        Elements.backPopUp().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("", Elements.keypadModalClass().getAttribute("value"));
        Elements.threePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("300", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("8", Elements.basketItemCountTD().getAttribute("innerHTML"));

        Elements.fourScreen().click();
        Elements.xScreen().click();
        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.ninePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("900", Elements.keypadModalClass().getAttribute("value"));

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

        assertEquals("£60.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));
        Elements.cigaretteOrTobacco().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£69.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("13", Elements.basketItemCountTD().getAttribute("innerHTML"));
        Elements.voidScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("12", Elements.basketItemCountTD().getAttribute("innerHTML"));

        Elements.productScreenOne().click();
        Elements.voidScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("11", Elements.basketItemCountTD().getAttribute("innerHTML"));

        Elements.productScreenTwo().click();
        Elements.voidScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("10", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£48.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.threeScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash20Screen().click();
        Elements.cashScreen().click();









    }
}
