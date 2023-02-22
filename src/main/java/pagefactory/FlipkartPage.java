package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPage {
	
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement close;
	
	@FindBy(xpath="//div[@class=\"_3ChZRr _1rs5Pv\"]")
	private WebElement banner;
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	private WebElement ElectronicsTab;
	
	@FindBy(xpath="//div[@class='_1fwVde'][1]//child::a")
	private List<WebElement> MobilesTab;

	public WebElement getClose() {
		return close;
	}

	public void setClose(WebElement close) {
		this.close = close;
	}

	public WebElement getBanner() {
		return banner;
	}

	public void setBanner(WebElement banner) {
		this.banner = banner;
	}

	public WebElement getElectronicsTab() {
		return ElectronicsTab;
	}

	public void setElectronicsTab(WebElement electronicsTab) {
		ElectronicsTab = electronicsTab;
	}

	public List<WebElement> getMobilesTab() {
		return MobilesTab;
	}

	public void setMobilesTab(List<WebElement> mobilesTab) {
		MobilesTab = mobilesTab;
	}
	

}
