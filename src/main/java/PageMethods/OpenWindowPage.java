package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class OpenWindowPage extends BasePage {

    public OpenWindowPage verifyWindowTitle (String windowTitle){
        String actualWindowTitle = getElementText(Locators.windowTitle);
        Assertions.assertEquals(windowTitle,actualWindowTitle,"Window Title is not as expected");
        return this;}

    public OpenWindowPage verifyWindowContent (String windowContent){
        String actualWindowContent = getElementText(Locators.windowText);
        Assertions.assertEquals(windowContent, actualWindowContent,"Window Text is not a s expected");
        return this;}

    public OpenWindowPage verifyWindowButtons (String windowButtons){
        String actualWindowButtons = getElementText(Locators.setButtonBarButton(windowButtons));
        Assertions.assertEquals(windowButtons,actualWindowButtons,"Window buttons not as expected");
        return this;}

    public OpenWindowPage maximizeWindow (String maximizeWindow){
        clickOnElement(Locators.setButtonBarButton(maximizeWindow));
        return this;}

    public OpenWindowPage closeWindow (String closeWindow){
        clickOnElement(Locators.setButtonBarButton(closeWindow));
        return this;}
}
