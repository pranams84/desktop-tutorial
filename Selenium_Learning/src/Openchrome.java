import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {
 
	 public static void main(String[] args) { 
		 System.setProperty("webdriver.chrome.driver", "C:/Users/sushp/Downloads/chromedriver_win32/chromedriver.exe");
 
// Initialize browser
		 
WebDriver driver=new ChromeDriver();

// Open Google
driver.get("http://www.jenkins.com");
String a = driver.getTitle();
String b = driver.getCurrentUrl();
String c = driver.getWindowHandle();
System.out.println(b);
System.out.println(a);
System.out.println(c);
WebElement element = driver.findElement(By.name("q"));
String Tag = element.getTagName();
System.out.println(Tag);
element.sendKeys("Selenium Learning");
WebElement element1 = driver.findElement(By.name("btnK"));
//String Tag1 = element1.getTagName();
//System.out.println(Tag1);
//element.submit();
element1.click();
String a1 = driver.getTitle();
System.out.println(a1);
String b1 = driver.getCurrentUrl();
System.out.println(b1);
 //driver.navigate().back();
// Close browser
//driver.close()
}
 
}
