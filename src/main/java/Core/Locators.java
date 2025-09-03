package Core;

import org.openqa.selenium.By;

public class Locators {

    //Button selection

    public static By clickOnOpenDialog = By.xpath("//div[@class='example-wrapper']//span[text()='Open dialog']");

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

    public static By dialogBoxContent = By.xpath("//p[text()='Are you sure you want to continue?']");


    //Open window button

    public static By clickOnOpenWindow = By.xpath("//div[@class='example-wrapper']//span[text()='Open window']");

    public static By setButtonBarButton(String buttonBar){
        String bBBlocator = "//button[@title='*****']";
        return By.xpath(bBBlocator.replace("*****", (buttonBar)));}

    public static By windowTitle = By.xpath("//span[@class='k-window-title'][text()='About']");
    public static By windowText = By.xpath("//div[@class='k-window-content']");



    //Dropdowns

    public static By autoCompleteField = By.xpath("//input[@placeholder='Your favorite sport']");
    public static By clearAutoCompleteField = By.xpath("(//span[@class='k-clear-value'])[0]");

    public static By setDropDownListValue (String dropDownListValue){
        String dDListValue = "//span[@class='k-input-value-text'][text()='*****']";
        return By.xpath(dDListValue.replace("*****",dropDownListValue));}

    public static By multiColumnComboBox = By.xpath("//input[@placeholder='Select an employee']");
    public static By dropMulticolumn = By.xpath("(//button [@class='k-input-button k-button k-icon-button k-button-md k-button-solid k-button-solid-base'])[3]");

    public static By setMultiSelectTreeResult (String multiSelectTreeResult){
        String multiselectTreeValue = "//span[@class='k-chip-label k-text-ellipsis'][text()='*****']";
        return By.xpath(multiselectTreeValue.replace("*****", multiSelectTreeResult));}

    public static By setDropDownResult (String dropDownResult){
        String dropDownValue = "//span[@class='k-input-value-text'][text()='*****']";
        return By.xpath(dropDownValue.replace("*****", dropDownResult));}

    public static By comboBox = By.xpath("(//input[@class='k-input-inner'])[1]");
    public static By dropDownTree = By.xpath("(//span[@class='k-input-inner'])[1]");
    public static By multiSelect = By.xpath("(//input[@class='k-input-inner'])[3]");














}