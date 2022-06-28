package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver; // null

	public static String value;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kavia\\eclipse-workspace\\project\\driver\\chrome_driver\\chromedriver.exe");
			driver = new ChromeDriver(); // Up casting

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "chrome_driver\\chromedriver.exe");
			driver = new FirefoxDriver(); // Up casting
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static String read_particular_data(String path, int row_index, int cell_index) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(row_index);
		XSSFCell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
		}
		return value;

	}

	public static void implicitwait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static WebDriver get(String url) {
		driver.get(url);
		return driver;
	}

	public static void clickonELement(WebElement element) {
		element.click();
	}

	public static void sendingKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static WebDriver close() {

		driver.close();
		return driver;
	}

	public static WebDriver quit() {

		driver.quit();
		return driver;
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void switchtoAlert(String type) {

		Alert ref = driver.switchTo().alert();

		if (type.equalsIgnoreCase("accept")) {
			ref.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			ref.dismiss();
		}
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}

	public static void actionsDoubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();

	}

	public static void actionsClicknHold(WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).build().perform();
	}

	public static void actionsDragnDrop(WebElement drag, WebElement drop) {
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);
	}

	public static void actionsMovetoelement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void actionsContextclick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void actionsKeyup(String key) {
		Actions act = new Actions(driver);
		act.keyUp(key).build().perform();
	}

	public static void actionsKeysdown(String key) {
		Actions act = new Actions(driver);
		act.keyDown(key);
	}

	public static void frames(int frame) {
		driver.switchTo().frame(frame);
		driver.switchTo().defaultContent();
	}

	public static void robot(String key) {
		// Robot robo = new Robot();
		// robo.keyPress(KeyEvent.)
	}

	public static void windowsHandle(String window) {
		// String

	}

	public static void dropdown(WebElement element, String type, String Value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.deselectByValue(Value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(Value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(Value);
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		if (s.isMultiple()) {
			System.out.println("Yes its supports Multiple");
		} else {
			System.out.println("Multiple is not supported");
		}
	}

	public static void checkbox(WebElement element) {
		element.click();
	}

	public static void isEnabled(WebElement element) {
		if (element.isEnabled()) {
			System.out.println("The element is enabled");
		} else {
			System.out.println("Element is not enabled");
		}
	}

	public static void isDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}
	}

	public static void isSelected(WebElement element) {
		if (element.isSelected()) {
			System.out.println("Element is Selected");
		} else {
			System.out.println("Element is not selected");
		}
	}

	public static void getTitle() {
		System.out.println("Title of page" + driver.getTitle());
	}

	public static void getCurrentUrl() {
		System.out.println("Current url is" + driver.getCurrentUrl());
	}

	public static void getText(WebElement element) {
		element.getText();
		System.out.println("Text of content is " + element);
	}

	public static void getAttribute(WebElement element, String type) {
		System.out.println("Atrribute Value is " + element.getAttribute(type));
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
	}

	public static void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-600)", "");
	}
}