package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class HomePageDropdowns extends BasePage {

    public HomePageDropdowns clickOnAutoComplete() {
        clickOnElement(Locators.autoCompleteField);
        return this;}

    public HomePageDropdowns enterFavoriteSport (String favoriteSport){
        typeText(favoriteSport, Locators.autoCompleteField);
        pressEnter(Locators.autoCompleteField);
        return this;}

    public HomePageDropdowns verifyFavoriteSport (String favoriteSportVerify){
        String actualFavoriteSport = getElementText(Locators.setDropDownResult(favoriteSportVerify));
        Assertions.assertEquals(actualFavoriteSport, favoriteSportVerify,"Favorite sport not as expected");
        return this;}

    public HomePageDropdowns clearFavoriteSport() {
        clickOnElement(Locators.clearAutoCompleteField);
        return this;}
}
