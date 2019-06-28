import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Login']")).click();
		driver.findElement(By.id("com.example.eventsmanager:id/email")).clear();
		driver.findElement(By.id("com.example.eventsmanager:id/email")).sendKeys("zeze");
		driver.findElement(By.id("com.example.eventsmanager:id/password")).sendKeys("123");
		driver.findElement(By.className("android.widget.Button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Eventos']")).click();

	}

}
