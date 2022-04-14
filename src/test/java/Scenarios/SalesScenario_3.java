package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario_3 extends OpenPage {


    @DisplayName("Scenario 3")
    @Test
    void ScenarioThree() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.oneScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();
        Elements.threeScreen().click();
        Elements.doubleZeroScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("10", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£30.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.cancelScreen().click();
        assertEquals("block", Elements.cancellYesNo().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.wanttocancelbasketNO().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.cancellYesNo().getCssValue("display"));

        Elements.twoScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();
        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fivePopUp().click();
        Elements.onePopUp().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("51", Elements.keypadModalClass().getAttribute("value"));
        Elements.backPopUp().click();
        assertEquals("5", Elements.keypadModalClass().getAttribute("value"));
        Elements.fivePopUp().click();
        Elements.fivePopUp().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("555", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.onePopUp().click();
        Elements.sixPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        Elements.backPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("400", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        Elements.Cscreen().click();

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.fourPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.escPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("31", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£145.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.ninePopUp().click();
        Elements.zeroPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("390", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.fiveScreen().click();
        Elements.xScreen().click();
        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.onePopUp().click();
        Elements.twoPopUp().click();
        Elements.twoPopUp().click();
        assertEquals("122", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(300);
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

        assertEquals("37", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£155.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.productScreenOne().click();
        Elements.voidScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("36", Elements.basketItemCountTD().getAttribute("innerHTML"));

        Elements.productScreenFour().click();
        Elements.voidScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("35", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£148.10", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"));

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

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("400", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(200);
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

        Elements.cash10Screen().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.twoPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("200", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash2Screen().click();


    }
}
