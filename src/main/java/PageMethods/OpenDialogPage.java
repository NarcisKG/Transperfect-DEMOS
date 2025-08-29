package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


public class OpenDialogPage extends BasePage {

    public OpenDialogPage verifyElementTitle(String elementTitle){
        String actualElementTitle = getElementText(Locators.dialogBoxTitle);
        Assertions.assertEquals(elementTitle, actualElementTitle,"Dialog title not as expected");
        return this;}

    public OpenDialogPage verifyElementButton(String elementButton){
        String actualElementButton = getElementText(Locators.setYesNoButton(elementButton));
        Assertions.assertEquals(elementButton, actualElementButton, "Button title not as expected");
        return this;}

    public OpenDialogPage verifyElementContent(String dialogContent){
        String actualDialogContent = getElementText(Locators.dialogBoxContent);
        Assertions.assertEquals(dialogContent, actualDialogContent, "Dialog Box content not as expected");
        return this;}

    public OpenDialogPage verifyYesButtonColor(String yesColor){
        String actualYesColor = getElementColor(Locators.setYesNoButton("Yes"));
        Assertions.assertEquals(yesColor,actualYesColor);
        return this;}


    public OpenDialogPage verifyElementX(String elementX){
        String actualElementX = getElementText(Locators.buttonX);
        Assertions.assertEquals(elementX, actualElementX, "Button X not as expected");
        return this;}


    public OpenDialogPage focusOnX (){
        pressTab(Locators.buttonX);
        return this;}

    public OpenDialogPage closeDialog(){
        pressEnter(Locators.buttonX);
        return this;}





}
