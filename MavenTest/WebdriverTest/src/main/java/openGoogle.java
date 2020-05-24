import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle {
 

public void test12() throws Exception{
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open Google
driver.get("http://www.google.com");
 
// Close browser
driver.close();
}
 
}
