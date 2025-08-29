package Core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage extends Properties {

    protected void moveToElement(By locator){
        Actions move = new Actions(driver);
        move.moveToElement(driver.findElement(locator)).click().perform();}


    protected void clickOnElement(By locator) {
        scrollToElement(locator);
        waitForElementToBeVisible(locator);//
        getDriver().findElement(locator).click();}


    protected void pressEnter (By locator){
        Actions enter = new Actions(driver);
        enter.sendKeys(Keys.ENTER).perform();}

    protected void pressTab(By locator){
        Actions tab = new Actions(driver);
        tab.sendKeys(Keys.TAB).perform();}

    protected void clickOnElementTop(By locator) {
        scrollToElementTop(locator);
        waitForElementToBeVisible(locator);//
        getDriver().findElement(locator).click();}

    protected void hoverOnElement(By locator){
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(locator)).build().perform();}

    protected void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));}

    protected void typeText(String text, By locator) {
        waitForElementToBeVisible(locator);
        getDriver().findElement(locator).sendKeys(text);}

    protected String getElementText(By locator) {
        waitForElementToBeVisible(locator);
        return getDriver().findElement(locator).getText();}

    protected String getLocator(String locator, String arg) {
        return locator.replace("%ARG%", arg);
    }

    protected boolean isElementVisible(By locator) {
        boolean isVisible = true;
        try {
            waitForElementToBeVisible(locator);
        } catch (Exception e) {
            isVisible = false;

        }
        return isVisible;}

    private void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);}

    private void scrollToElementTop(WebDriver driver, WebElement element){
        JavascriptExecutor jsTop = (JavascriptExecutor) driver;
        jsTop.executeScript("scroll(250, 0)");}

    private void scrollToElementTop (By locator){
        scrollToElementTop(getDriver(), findElement(getDriver(),locator));}

    private void scrollToElementBottom(WebDriver driver, WebElement element){
        JavascriptExecutor jsBottom = (JavascriptExecutor) driver;
        jsBottom.executeScript("scroll(0, 250)");}



    private WebElement findElement(WebDriver driver, By by) {
        return driver.findElement(by);
    }

    public void scrollToElement(By locator){
        scrollToElement(getDriver(),findElement(getDriver(), locator));}



    protected int getElementCount(String locator){
        List<WebElement> webElements = getDriver().findElements(By.xpath(locator));
        return webElements.size();}


    protected void switchToNewWindow() {
        Set<String> handles = getDriver().getWindowHandles();
        driver.switchTo().window((String) handles.toArray()[1]);}

    protected void switchToMainWindow(){

        final String originalWindow = getDriver().getWindowHandle();}

    protected void switchToMainPageContent(){
        getDriver().switchTo().defaultContent();
    }

}


