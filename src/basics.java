import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class basics extends base{
	
	@BeforeSuite
	public void Start() {
		StartServer();
	}
	
	@AfterSuite
	public void Stop() {
		StopServer();
	}
	
	@Test
	public void Test() throws MalformedURLException{
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
	
	@Test
	public void Testtwo() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Login']")).click();
		driver.findElement(By.id("com.example.eventsmanager:id/email")).clear();
		driver.findElement(By.id("com.example.eventsmanager:id/email")).sendKeys("zeze");
		driver.findElement(By.id("com.example.eventsmanager:id/password")).sendKeys("123");
	}

}
