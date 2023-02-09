package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPage {
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public static WebElement close;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div")
	public static WebElement banner;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/span[1]")
	public static WebElement ElectronicsTab;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div[1]/a")
	public static List<WebElement> MobilesTab;
	

}
