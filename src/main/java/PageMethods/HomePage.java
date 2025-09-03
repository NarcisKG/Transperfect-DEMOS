package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage openDialog (){
        clickOnElement(Locators.clickOnOpenDialog);
        return this;}
    public OpenDialogPage clickOnDialogBox(){
        clickOnElement(Locators.dialogBoxTitle);
        return new OpenDialogPage();}

    public HomePage openWindow(){
        clickOnElement(Locators.clickOnOpenWindow);
        return this;}
    public OpenWindowPage clickOnWindow(){
        clickOnElement(Locators.windowTitle);
        return new OpenWindowPage();}
}
