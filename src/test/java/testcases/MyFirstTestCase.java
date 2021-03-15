package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MyFirstTestCase 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

		Thread.sleep(5000);
		
		driver.findElement(By.id("num1Button")).click();
		driver.findElement(By.id("plusButton")).click();
		driver.findElement(By.id("num1Button")).click();
		driver.findElement(By.id("equalButton")).click();
		String output = driver.findElement(By.name("Exibição é 2")).getAttribute("Name");
		System.out.println("Resultado é "+output);
	}
}
