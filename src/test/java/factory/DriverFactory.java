package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	
	private static final String chromeDriver = "webdriver.chrome.driver";
	private static final String pathChrome = "/home/ice/Documentos/Driver/chromedriver_linux64/chromedriver";
	private static final String firefoxDriver = "webdriver.gecko.driver";
	private static final String pathFirefox = "/home/ice/Documentos/Driver/firefox029/geckodriver";
	
	
	public DriverFactory() {}
	
	public WebDriver getConnectionChrome() throws WebDriverException{
		
		WebDriver browser = null;
		
		try {
			System.setProperty(chromeDriver, pathChrome);
			browser = new ChromeDriver();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return browser;
		
	}
	
	public WebDriver getConnectionFirefox() throws WebDriverException{
		
		WebDriver browser = null;
		
		try {
			System.setProperty(firefoxDriver, pathFirefox);
			browser = new FirefoxDriver();
		
		} catch(Exception e) {
			
			e.printStackTrace();
		
		}
		
		return browser;
	}
	
	public void closeConnection(WebDriver browser) throws WebDriverException{
		
		try {
			
			browser.quit();
		
		} catch (WebDriverException e) {
		
			e.printStackTrace();
		
		}
	}
	
	public BufferedImage screenshot(WebDriver driver) throws IOException {
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    BufferedImage fullImg = ImageIO.read(screenshot);
	    return fullImg;
	}
	
	public boolean persistScreenshot(BufferedImage image, String location) {
	    try {
	        File file = new File(location);
	        if (file.exists()) {
	            file.delete();
	        }
	        ImageIO.write(image, "png", file);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}

}
