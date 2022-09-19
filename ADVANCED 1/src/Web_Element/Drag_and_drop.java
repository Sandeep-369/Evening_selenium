package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./SOFTWARE/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	WebElement from = driver.findElement(By.id("box7"));
	WebElement to = driver.findElement(By.id("box107"));
	Actions act=new Actions(driver);
	act.dragAndDrop(from, to).perform();
	Thread.sleep(2000);
	WebElement from1 = driver.findElement(By.id("box6"));
	WebElement to1 = driver.findElement(By.id("box106"));
	act.dragAndDrop(from1, to1).perform();
	Thread.sleep(2000);
	WebElement from2 = driver.findElement(By.id("box5"));
	WebElement to2 = driver.findElement(By.id("box105"));
	act.dragAndDrop(from2, to2).perform();
	Thread.sleep(2000);
	driver.close();
}
}
