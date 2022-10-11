package org.example.selenium.cucumber.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BasePage {

    static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

 /*   @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }*/

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().fullscreen();
    }


    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void navigateTo(String url) { //constructor
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }


    public static void waitUntilTheElementIsVisible(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    private WebElement find(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public void clickElement(String locator) {
        find(locator).click();
    }

    public void enterInformation(String locator, String textToWrite) {
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void selectFormDropdownByValue(String locator, String valueToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue((valueToSelect));
    }

    public void selectFormDropdownByIndex(String locator, int indexToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByIndex((indexToSelect));
    }

    public void selectFormDropdownByVisibleText(String locator, String textToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText((textToSelect));
    }

    public void scrollToElement(String locator) {
        action = new Actions(driver).scrollToElement(find(locator));
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(find(locator));
    }

    public void doubleClickElement(String locator) {
        action.doubleClick(find(locator));
    }

    public void rightClickElement(String locator) {
        action.contextClick(find(locator));
    }

    public String getValueFromTable(String locator, int row, int column) {
        String cellIWant = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        return find(cellIWant).getText();
    }

    public void setValueInTable(String locator, int row, int column, String valueToSet) {
        String cellToFill = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        find(cellToFill).clear();
        find(cellToFill).sendKeys(valueToSet);
    }

    public void uploadFile(String locator, String nameFile) throws IOException {
        File currentDir = new File(".");
        String basePath = currentDir.getCanonicalPath();
        final String filePathToUpload = basePath + "/src/test/resources/DataTest/" + nameFile;
        find(locator).sendKeys(filePathToUpload);
        System.out.println("Path found: " + filePathToUpload);
    }

    public void switchToiFrameForIndex(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToiFrameForName(String iFrameName) {
        driver.switchTo().frame(iFrameName);
    }

    public void switchToiFrameForWebElement(String locator) {
        driver.switchTo().frame(find(locator));
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    public String textFromElement(String locator) {
        return find(locator).getText();
    }

    public boolean isElementDisplayed(String locator) {
        return find(locator).isDisplayed();
    }

    public boolean isElementSelected(String locator) {
        return find(locator).isSelected();
    }

    public boolean isElementEnabled(String locator) {
        return find(locator).isEnabled();
    }

    public List<WebElement> getAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }

    public static byte[] getByteScreenshot() throws IOException
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return FileUtils.readFileToByteArray(src);
    }
}
