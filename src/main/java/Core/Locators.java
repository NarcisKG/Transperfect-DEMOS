package Core;

import org.openqa.selenium.By;

public class Locators {

    //Button selection

    public static By clickOnOpenDialog = By.xpath("//div[@class='example-wrapper']//span[text()='Open dialog']");
    public static By clickOnOpenWindow = By.xpath("//div[@class='example-wrapper']//span[text()='Open window']");
    public static By setClickOnButton(String buttonType) {
        String buttonLocator = "//div[@class='example-wrapper']//span[text()='*****']";
        return By.xpath(buttonLocator.replace("*****", (buttonType)));
    }

    //Open dialog button
    public static By dialogBoxTitle = By.xpath("//span[@class='k-window-title k-dialog-title'][text()='Please confirm']");
    public static By buttonX = By.xpath("//button[@title='Close']");

    public static By setYesNoButton(String buttonYesNo) {
        String buttonYNlocator = "//span[@class='k-button-text'][text()='*****']";
        return By.xpath(buttonYNlocator.replace("*****", (buttonYesNo)));}

    //Dialog box elements
      public static By dialogBoxContent = By.xpath("//p[text()='Are you sure you want to continue?']");

    //Open window button
    public static By setButtonBarButton(String buttonBar){
        String bBBlocator = "//button[@title='*****']";
        return By.xpath(bBBlocator.replace("*****", (buttonBar)));}

    public static By kWindowTitle = By.xpath("//span[@class='k-window-title ng-star-inserted'][text()='About']");
    public static By kWindowText = By.xpath("//p[@class='ng-star-inserted'][text()='Additional info']");
}