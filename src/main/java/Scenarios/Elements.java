package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Elements {

    public static WebDriver driver;

    public Elements(WebDriver webDriver){
        driver = webDriver;
    }

    public static WebElement singOnOff(){
        return driver.findElement(new By.ByCssSelector(".col-xs-6[translate='SIGNIN_LB']"));
    }

    //SAYILAR Pop Up
    public static WebElement zeroPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('0');\"]"));
    }
    public static WebElement doubleZeroPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('00');\"]"));
    }
    public static WebElement onePopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('1');\"]"));
    }
    public static WebElement twoPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('2');\"]"));
    }
    public static WebElement threePopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('3');\"]"));
    }
    public static WebElement fourPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('4');\"]"));
    }
    public static WebElement fivePopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('5');\"]"));
    }
    public static WebElement sixPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('6');\"]"));
    }
    public static WebElement sevenPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('7');;\"]"));
    }
    public static WebElement eightPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('8');\"]"));
    }
    public static WebElement ninePopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeValue('9');\"]"));
    }

    //Pop up
    public static WebElement enterPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click='playKeySound(); submitCode();']"));
    }
    public static WebElement backPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); clearCodeValue();\"]"));
    }
    public static WebElement escPopUp(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); escapeModal();\"]"));
    }


    public static WebElement grocery () {
        return driver.findElement(new By.ByCssSelector(".btn[style='padding: 0px; font-size: 2.5vmin; background: rgb(144, 165, 228);']"));
    }
    public static WebElement cigaretteOrTobacco () {
        return driver.findElement(new By.ByCssSelector(".btn[style=\"padding: 0px; font-size: 2.5vmin;\"]"));
    }
    public static WebElement cigaretteOrTobaccoYes () {
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); ageConfirmed();\"]"));
    }
    public static WebElement cigaretteOrTobaccoNo () {
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); ageRejected();\"]"));
    }
    public static WebElement ConfirmAgePopUp(){
        return driver.findElement(By.id("ageRestricted"));
    }

    public static WebElement pointFruitMenu () {
        return driver.findElement(new By.ByCssSelector(".btn[style=\"padding: 0px; font-size: 2.5vmin; background: rgb(248, 248, 13);\"]"));
    }
    public static WebElement pointVegMenu () {
        return driver.findElement(new By.ByCssSelector(".btn[style='padding: 0px; font-size: 2.5vmin; background: rgb(0, 255, 0);']"));
    }

    //Screen

    public static WebElement xScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCodeX();\"]"));
    }
    public static WebElement zeroScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('0');\"]"));
    }
    public static WebElement doubleZeroScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('00');\"]"));
    }
    public static WebElement oneScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('1');\"]"));
    }
    public static WebElement twoScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('2');\"]"));
    }
    public static WebElement threeScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('3');\"]"));
    }
    public static WebElement fourScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('4');\"]"));
    }
    public static WebElement fiveScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('5');\"]"));
    }
    public static WebElement sixScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('6');\"]"));
    }
    public static WebElement sevenScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('7');\"]"));
    }
    public static WebElement eightScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('8');\"]"));
    }
    public static WebElement nineScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); addCode('9');\"]"));
    }


    public static WebElement cashScreen (){
        return driver.findElement(By.id("btnCash"));
    }
    public static WebElement cardScreen (){
        return driver.findElement(By.id("btnCreditCard"));
    }
    public static WebElement Cscreen(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); clearScreen('Clear'); clearButtonLog();\"]"));
    }
    public static WebElement voidScreen(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); voidProduct();\"]"));
    }
    public static WebElement cancelScreen (){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); cancellBasket();\"]"));
    }




    public static WebElement cash50Screen(){
        return driver.findElement(new By.ByCssSelector(".imgCurrencyBtn[data-ng-click=\"playKeySound(); payBasket('CASH_50')\"]"));
    }
    public static WebElement cash20Screen(){
        return driver.findElement(new By.ByCssSelector(".imgCurrencyBtn[data-ng-click=\"playKeySound(); payBasket('CASH_20')\"]"));
    }
    public static WebElement cash10Screen(){
        return driver.findElement(new By.ByCssSelector(".imgCurrencyBtn[data-ng-click=\"playKeySound(); payBasket('CASH_10')\"]"));
    }
    public static WebElement cash5Screen(){
        return driver.findElement(new By.ByCssSelector(".imgCurrencyBtn[data-ng-click=\"playKeySound(); payBasket('CASH_5')\"]"));
    }
    public static WebElement cash2Screen(){
        return driver.findElement(new By.ByCssSelector(".col-xs-6[data-ng-click=\"playKeySound(); payBasket('CASH_2')\"]"));
    }
    public static WebElement cash1Screen(){
        return driver.findElement(new By.ByCssSelector(".col-xs-6[data-ng-click=\"playKeySound(); payBasket('CASH_1')\"]"));
    }


    public static WebElement productScreenOne(){
        return driver.findElement( new By.ByCssSelector(".ng-isolate-scope tbody tr:nth-child(1)"));
    }
    public static WebElement productScreenTwo(){
        return driver.findElement( new By.ByCssSelector(".ng-isolate-scope tbody tr:nth-child(2)"));
    }
    public static WebElement productScreenThree(){
        return driver.findElement( new By.ByCssSelector(".ng-isolate-scope tbody tr:nth-child(3)"));
    }
    public static WebElement productScreenFour(){
        return driver.findElement( new By.ByCssSelector(".ng-isolate-scope tbody tr:nth-child(4)"));
    }



    public static WebElement modal(){
        return driver.findElement(By.id("keypadModal"));
    }
    public static WebElement keypadModalClass(){
        return driver.findElement(new By.ByCssSelector(".form-control[data-ng-model=\"$parent.codeValue\"]"));
    }


    public static WebElement StartcardtransactionYesNo(){
        return driver.findElement(By.id("pinpadSelected"));
    }
    public static WebElement StartcardtransactionNo(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); pinpadCancel();\"]"));
    }
    public static WebElement StartcardtransactionYes(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); isPinpadOk();\"]"));
    }



    public static WebElement cancellYesNo(){
        return driver.findElement(By.id("cancellYesNo"));
    }
    public static WebElement wanttocancelbasketNO(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); cancellRejected()\"]"));
    }
    public static WebElement wanttocancelbasketYES(){
        return driver.findElement(new By.ByCssSelector(".flexItem[data-ng-click=\"playKeySound(); cancelConfirmed();\"]"));
    }



    public static WebElement basketSubtotalTD(){
        return driver.findElement(new By.ByCssSelector(".col-xs-4[data-ng-bind=\"!saleNew() ? basket.subtotal : 0 | currency:'£'\"]"));
    }
    public static WebElement basketDiscountTD(){
        return driver.findElement(new By.ByCssSelector(".col-xs-4[data-ng-bind=\"!saleNew()  ? basket.discount : 0 | currency:'£'\"]"));
    }
    public static WebElement basketItemCountTD (){
        return driver.findElement(new By.ByCssSelector(".col-xs-4[data-ng-bind=\"!saleNew() ? basket.itemCount : 0\"]"));
    }
    public static WebElement changeScreen (){
        return driver.findElement(new By.ByCssSelector(".basket-table-td-right[style=\"font-size: 6vmin;\"]"));
    }





    public static WebElement baskettabletd(){
        return driver.findElement(new By.ByCssSelector(".col-xs-2.basket-table-td-right.ng-binding"));
    }




}

