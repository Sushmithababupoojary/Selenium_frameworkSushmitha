package genericscripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshotgeneric {

	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo = "./Photos";
	    Date d = new Date();
	     TakesScreenshot ts = (TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File dst = new File(photo+d+".jpeg");
	     FileUtils.copyDirectory(src, dst);
	}
}
