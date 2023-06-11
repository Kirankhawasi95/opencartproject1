/**
 * 
 */
package ActionClass_Interface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author kpkmt942
 *
 */
public interface Interface_AbstractMrthod {
	
	public void Click(WebDriver driver, WebElement ele);
	public boolean Isdisplayed(WebDriver driver, WebElement ele);
	public boolean TextSend(WebElement ele, String  text);
	public String GetText(WebDriver textele, WebElement ele);
	public boolean SelectByIndex(WebElement driver, int ele);
	public boolean JavascriptExe(WebDriver driver, WebElement ele);
	public void implicitWait(WebDriver driver, int timeOut);
	public void explicitWait(WebDriver driver,WebElement element, Duration timeOut);
	public void pageLoadTimeOut(WebDriver driver, int timeOut);
	public boolean IsEnable(WebDriver driver, WebElement ele);
	public boolean IsSelected(WebDriver driver, WebElement ele);
	
	

}
